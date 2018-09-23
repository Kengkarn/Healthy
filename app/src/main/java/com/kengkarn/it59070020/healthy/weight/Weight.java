package com.kengkarn.it59070020.healthy.weight;

public class Weight {

    private String date;
    private int weight;
    private String status;

    public Weight() {}

    public Weight(String date, int weight, String status) {
        this.setDate(date);
        this.setWeight(weight);
        this.setStatus(status);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
