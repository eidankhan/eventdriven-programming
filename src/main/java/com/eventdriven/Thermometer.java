package com.eventdriven;

import java.util.ArrayList;
import java.util.List;

public class Thermometer {

  private double temperature;
  private List<TemperatureChangeListener> listeners;

  public Thermometer(double temperature) {
    this.temperature = temperature;
    this.listeners = new ArrayList<>();
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    double oldTemperature = this.temperature;
    this.temperature = temperature;
    TemperatureChangeEvent event = new TemperatureChangeEvent(this, oldTemperature, temperature);
    fireTemperatureChangeEvent(event);
  }

  public void addTemperatureChangeListener(TemperatureChangeListener listener) {
    listeners.add(listener);
  }

  public void removeTemperatureChangeListener(TemperatureChangeListener listener) {
    listeners.remove(listener);
  }

  private void fireTemperatureChangeEvent(TemperatureChangeEvent event) {
    for (TemperatureChangeListener listener : listeners) {
      listener.temperatureChanged(event);
    }
  }
}