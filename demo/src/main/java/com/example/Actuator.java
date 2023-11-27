package com.example;

import java.util.UUID;

public class Actuator extends Unit 
{
    private double value;

    public Actuator(String name, UUID id)
    {
        super(name, id);
    }

    public double getValue() 
    {
        return value;
    }
    public void SetValue(double newValue) 
    {
        value = newValue;
    }
}