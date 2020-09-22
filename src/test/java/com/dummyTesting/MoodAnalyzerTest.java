package com.dummyTesting;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is Sad");
        String mood=moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad",mood);
    }
    @Test
    public void GivenMessage_WhenNotSad_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is Happy");
        String mood=moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy",mood);
    }
}
