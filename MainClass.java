package com.hftsystem.app.src.main.java;


import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        try {
            String serverEndpoint = "https://example.com/prices";
            String tradeEndpoint = "https://example.com/trade";
            String tradeType = "BUY";

            NetworkingClass ncl = new NetworkingClass();
            String rawData =ncl.fetchDataFromServer(serverEndpoint);

            DataFormatter df = new DataFormatter();
            List<Integer> stockPrices = df.formatData(rawData);

            AlgorithmRunner ar = new AlgorithmRunner();
            ar.runAlgorithm(stockPrices);

            StockExchangeCommunicator sec = new StockExchangeCommunicator();
            int buyingPrice = Collections.min(stockPrices);
            sec.executeTrade(tradeEndpoint, tradeType, buyingPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
