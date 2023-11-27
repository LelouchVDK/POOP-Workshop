package com.example;


import java.util.UUID;
import java.util.ArrayList;

public class Building extends Unit
{
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<Actuator>();
    
    public ArrayList<Sensor> getSensors() { return sensors; }

    public Building(String name, UUID id)
    {
        super(name, id);
    }

    /**
     * @return the actuators
     */
    public ArrayList<Actuator> getActuators() { return actuators; }

    public UUID addTemperatureSensor(TemperatureSensor sensor)
    {
        sensors.add(sensor);
        return sensor.getId();
    }

    public UUID addCO2Sensor(Co2Sensor sensor)
    {
        sensors.add(sensor);
        return sensor.getId();
    }

    public UUID addVentilationActuator(VentilationActuator ventActuator) 
    {
        actuators.add(ventActuator);
        return ventActuator.getId();
    }

    public void removeSensor(Sensor sensor)
    {
        sensors.remove(sensors.indexOf(sensor));
    }

    public void removeActuator(Sensor sensor)
    {
        sensors.remove(sensors.indexOf(sensor));
    }
}
