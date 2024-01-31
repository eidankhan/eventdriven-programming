package com.eventdriven;

public class TemperaturePrinter implements TemperatureChangeListener {

    @Override
    public void temperatureChanged(TemperatureChangeEvent event) {
      System.out.println("Temperature changed from " + event.getOldTemperature() + " to " + event.getNewTemperature());
    }
  }