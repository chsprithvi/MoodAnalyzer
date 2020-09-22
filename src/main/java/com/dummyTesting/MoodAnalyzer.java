package com.dummyTesting;

public class MoodAnalyzer {

    private String message;

    //MoodAnalyzer(){}

    MoodAnalyzer(String message){
        this.message = message;
    }


    public String analyzeMood() {
        if(message.contains("Sad")){
            return "Sad";
        }
        else{
            return "Happy";
        }
    }
}
