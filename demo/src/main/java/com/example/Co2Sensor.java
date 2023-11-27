package com.example;

public class Co2Sensor extends Sensor 
{
    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }
}