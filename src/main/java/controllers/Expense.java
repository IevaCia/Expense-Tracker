package controllers;

import java.util.List;

public class Expense {

    private String date;
    private String data;
    private double sum;
    private List<Tag> tagList;


    public Expense(String date, String data, double sum) {
        this.date = date;
        this.data = data;
        this.sum = sum;

    }


    public String getDate() {
        return date;
    }

    public String getData() {
        return data;
    }

    public double getSum() {
        return sum;
    }



}

