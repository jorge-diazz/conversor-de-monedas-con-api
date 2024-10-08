package com.conversordemonedas.models;

public record ConversionRate(String base_code, String target_code, double conversion_rate) {
}
