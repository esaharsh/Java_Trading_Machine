package com.hftsystem.app.src.main.java;



import java.net.*;
import java.io.*;

public class StockExchangeCommunicator {
    public void executeTrade(String tradeEndpoint, String tradeType, int price) throws Exception {
        URL url = new URL(tradeEndpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String tradeData = "{ \"type\": \"" + tradeType + "\", \"price\": " + price + " }";

        OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
        osw.write(tradeData);
        osw.flush();
        osw.close();

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("Trade executed successfully.");
        } else {
            throw new Exception("Error: Failed to execute trade.");
        }
    }
}
