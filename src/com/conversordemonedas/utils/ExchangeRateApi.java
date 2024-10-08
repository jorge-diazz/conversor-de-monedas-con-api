package com.conversordemonedas.utils;

import com.conversordemonedas.models.ConversionRate;
import com.conversordemonedas.models.Currency;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ExchangeRateApi {
    private String apiKey = "";
    private String urlBase = "https://v6.exchangerate-api.com/v6/" + apiKey;

    public List<Currency> getCurrencies() {
        URI url = URI.create(urlBase + "/codes");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body())
                    .getAsJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonArray("supported_codes");

            List<Currency> currencies = new ArrayList<>();
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonArray currency = jsonArray.get(i).getAsJsonArray();
                currencies.add(new Currency(
                        currency.get(0).getAsString(),
                        currency.get(1).getAsString()
                ));
            }

            return currencies;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public ConversionRate getConversionRate(String base, String target) {
        URI url = URI.create(urlBase + "/pair/" + base + "/" + target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), ConversionRate.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
