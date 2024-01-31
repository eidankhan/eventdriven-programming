package com.eventdriven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create an instance of the event source
        Thermometer thermometer = new Thermometer(25.0);

        // Create an instance of the event listener
        TemperaturePrinter printer = new TemperaturePrinter();

        // Register the listener with the event source
        thermometer.addTemperatureChangeListener(printer);

        // Change the temperature of the event source
        thermometer.setTemperature(30.0);
        thermometer.setTemperature(10.0);

    }
}
