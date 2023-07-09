package com.hftsystem.app.src.main.java;


import java.io.*;
import java.net.*;

public class NetworkingClass {
    public String fetchDataFromServer(String endpoint) throws Exception {
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder resp = new StringBuilder();

            while ((inputLine = bf.readLine()) != null) {
                resp.append(inputLine);
            }
            bf.close();
            return resp.toString();
        } else {
            throw new Exception("Error: Failed to fetch data from the server.");
        }
    }
}
