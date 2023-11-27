package com.example;

public class VentilationActuator extends Actuator 
{
    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }

}