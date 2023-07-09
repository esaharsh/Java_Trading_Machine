package com.hftsystem.app.src.main.java;


import java.util.*;

public class AlgorithmRunner {
    public void runAlgorithm(List<Integer> stockPrices) {
        int minPrice = Collections.min(stockPrices);
        int buyingIndex = stockPrices.indexOf(minPrice);

        List<Integer> subList = stockPrices.subList(buyingIndex + 1, stockPrices.size());
        int maxPrice = Collections.max(subList);
        int sellingIndex = stockPrices.indexOf(maxPrice);

        System.out.println("Buy signal: Buy at price " + minPrice + " (Index: " + buyingIndex + ")");
        System.out.println("Sell signal: Sell at price " + maxPrice + " (Index: " + sellingIndex + ")");
    }
}
