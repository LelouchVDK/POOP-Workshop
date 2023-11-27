package com.example;

import java.util.List;
import java.util.UUID;

public class Building extends Unit
{
    public List<Sensor> sensors;
    public List<Actuator> actuators;
    
    public List<Sensor> getSensors() { return sensors; }

    /**
     * @return the actuators
     */
    public List<Actuator> getActuators() { return actuators; }

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
