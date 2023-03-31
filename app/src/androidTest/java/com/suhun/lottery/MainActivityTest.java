package com.suhun.lottery;

import android.content.res.Resources;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> rule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void runCreateLotteryTest(){
        Espresso.onView(ViewMatchers.withId(R.id.createNum)).perform(ViewActions.click());
    }
}
