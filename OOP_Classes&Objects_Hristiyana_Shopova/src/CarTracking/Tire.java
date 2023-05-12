package CarTracking;

import java.util.ArrayList;
import java.util.List;

public class Tire {
    private double myPreassure;
    private int myAge;

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public double getMyPreassure() {
        return myPreassure;
    }

    public void setMyPreassure(double myPreassure) {
        this.myPreassure = myPreassure;
    }

    public Tire(double preassure, int age)
    {
        this.myPreassure = preassure;
        this.myAge = age;


    }
}