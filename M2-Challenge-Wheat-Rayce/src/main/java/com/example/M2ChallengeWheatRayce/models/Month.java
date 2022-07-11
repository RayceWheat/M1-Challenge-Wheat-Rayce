package com.example.M2ChallengeWheatRayce.models;

public class Month {

    private String monthName;

    private int monthNumber;

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Month(String monthName, int monthNumber) {
        this.monthName = monthName;
        this.monthNumber = monthNumber;
    }
}
