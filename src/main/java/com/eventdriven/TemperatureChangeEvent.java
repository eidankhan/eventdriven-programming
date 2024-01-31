package com.eventdriven;

import java.util.EventObject;

public class TemperatureChangeEvent extends EventObject {

    private double oldTemperature;
    private double newTemperature;
  
    public TemperatureChangeEvent(Object source, double oldTemperature, double newTemperature) {
      super(source);
      this.oldTemperature = oldTemperature;
      this.newTemperature = newTemperature;
    }
  
    public double getOldTemperature() {
      return oldTemperature;
    }
  
    public double getNewTemperature() {
      return newTemperature;
    }
  }