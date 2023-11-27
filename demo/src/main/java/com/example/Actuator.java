package com.example;

public class Actuator extends Unit 
{
    private double value;

    public double getValue() 
    {
        return value;
    }
    public void SetValue(double newValue) 
    {
        value = newValue;
    }
}