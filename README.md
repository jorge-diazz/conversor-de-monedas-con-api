# Conversor de Monedas Con API
Challenge One: Conversor de monedas desarrollado en Java 17, con el uso de la API [Exchange Rate API](https://www.exchangerate-api.com/) y la librería [Gson.](https://mvnrepository.com/artifact/com.google.code.gson/gson) Permite realizar la conversión de todas la monedas con las que cuenta la API.

<image src="/img/conversor-de-monedas.png" alt="Imagen de la aplicacion funcionando">

## Requerimientos
* Java 17
* API Exchange Rate
* GSON 2.10.1

## Configuración
1.- Crear una cuenta y conseguir un Key en [Exchange Rate API](https://www.exchangerate-api.com/)
<image src="/img/exchangerate-account.png" alt="Imagen de la Pagina de la API">
2.- Modificar con tu key la variable apiKey del archivo [src/com/conversordemonedas/utils/ExchangeRateApi.java](https://github.com/jorge-diazz/conversor-de-monedas-con-api/blob/main/src/com/conversordemonedas/utils/ExchangeRateApi.java)
<image src="/img/change-api-key.png" alt="Imagen para cambiar la API">
3.- Descargar la libreria [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1) en formato jar.
<image src="/img/gson-download.png" alt="Imagen de descarga Gson">
4.- Implementar el modulo en IntelliJ File > Project Structure > Modules > Dependencies > + > JARs or Directories > Seleccionar el archivo .jar > OK, reiniciar 
<image src="/img/gson-implements.png" alt="Imagen de implementacion Gson">

## Funcionalidades
1.- Seleccionar moneda.

Ingresar la opción uno y después ingresar el número de la moneda que deseas.
<image src="/img/ingresa-moneda-1.png" alt="Imagen de la lista de monedas">
Para saber si la moneda es correcta, se muestra en el menú después de haberla seleccionado.
<image src="/img/ingresa-moneda-2.png" alt="Imagen de la moneda seleccionada">

2.- Seleccionar moneda para conversión.

Ingresar la opción dos y después ingresar el número de la moneda que deseas.
<image src="/img/ingresa-conversion-1.png" alt="Imagen de la lista de monedas">
Para saber si la moneda es correcta, se muestra en el menú después de haberla seleccionado.
<image src="/img/ingresa-conversion-2.png" alt="Imagen de la moneda seleccionada">

3.- Realizar conversión.

Seleccionar la opción tres e ingresar la cantidad, mostrará la conversión debajo del menú.
<image src="/img/realizar-conversion.png" alt="Imagen de conversion de moneda">

4.- Ver historial de conversiones.
Seleccionar la opción 3 y se mostrara una lista con las conversiones hechas.

<image src="/img/historial-de-conversiones.png" alt="Imagen de historial de conversiones">

5.- Salir.

<image src="/img/terminacion-programa.png" alt="Imagen de salir del programa">

## Insignia de completado

<image src="/img/Badge-Conversor.png" alt="Imagen de salir del programa">
