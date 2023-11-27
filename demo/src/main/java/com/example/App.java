package com.example;

import java.util.UUID;

/**
 * <h1>Application</h1>
 * @author Emil, HC, Emma og Victoria
 */
public class App
{
    
    public static void main( String[] args )
    {
        BuildingManagementSystem bms = new BuildingManagementSystem();
        Building building01 = new Building("La casa de Emil", UUID.randomUUID());
        building01.addTemperatureSensor(new TemperatureSensor("HotSensor", UUID.randomUUID()));
        building01.addVentilationActuator(new VentilationActuator("LightSwitch", UUID.randomUUID()));
        bms.addBuilding(building01);

        System.out.println(bms.getBuildings().get(0).getName());
    }
}