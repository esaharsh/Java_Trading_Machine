package com.hftsystem.app.src.main.java;

import java.util.*;

public class DataFormatter {
    public List<Integer> formatData(String rawData) {
        List<Integer> stockPrices = new ArrayList<>();
        String[] priceStrings = rawData.split(",");

        for (String priceString : priceStrings) {
            stockPrices.add(Integer.parseInt(priceString));
        }
        return stockPrices;
    }
}
