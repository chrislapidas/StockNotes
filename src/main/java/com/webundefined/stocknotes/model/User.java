package com.webundefined.stocknotes.model;

import java.util.ArrayList;

/**
 * Created by Chris on 9/1/17.
 */
public class User {

    private String userId;
    private ArrayList<String> stockTickerSymbolList;

    public User(String userId) {
        this.userId = userId;
        this.stockTickerSymbolList = new ArrayList<>(5);
    }

    public String addTickerSymbol(String tickerSymbol){
        tickerSymbol = tickerSymbol.toUpperCase();

        if (this.stockTickerSymbolList.contains(tickerSymbol)){
            return ("Already subscribed to ticker symbol " + tickerSymbol);
        }
        else{
            this.stockTickerSymbolList.add(tickerSymbol);
            return ("Subscribed to " + tickerSymbol);
        }
    }

    public String removeTickerSymbol(String tickerSymbol){
        tickerSymbol = tickerSymbol.toUpperCase();

        if (this.stockTickerSymbolList.contains(tickerSymbol)){
            stockTickerSymbolList.remove(tickerSymbol);
            return ("Removed subscription to " + tickerSymbol);
        }
        else{
            return ("Already not subscribed to " + tickerSymbol);
        }
    }



}
