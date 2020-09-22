package com.dummyTesting;

public class MoodAnalyzerException extends RuntimeException{

    enum ExceptionType{
        NULL, EMPTY
    }

    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
