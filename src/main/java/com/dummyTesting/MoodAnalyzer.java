package com.dummyTesting;

public class MoodAnalyzer {

    private String message;

    MoodAnalyzer(){}

    MoodAnalyzer(String message){
        this.message = message;
    }

    /**
     *
     */
    public String analyzeMood() {
        try {
            return message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
