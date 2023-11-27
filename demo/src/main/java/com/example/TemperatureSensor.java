package com.example;

public class TemperatureSensor extends Sensor 
{
    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }
}