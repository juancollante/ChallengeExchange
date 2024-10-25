package com.alura;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ExchangeRateAPI {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/2cc3ff8448ae0eef4afb0ba2/latest/USD"; // Reemplaza YOUR_API_KEY

    public static JsonObject getExchangeRates() throws IOException {
        // Crear una instancia del cliente HTTP
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(API_URL);

        // Realizar la solicitud HTTP
        HttpResponse response = httpClient.execute(request);

        // Convertir la respuesta HTTP a una cadena JSON
        String json = EntityUtils.toString(response.getEntity());

        // Parsear el JSON utilizando Gson
        JsonObject jsonResponse = JsonParser.parseString(json).getAsJsonObject();

        httpClient.close();
        return jsonResponse;
    }
}
