package com.eventdriven;

import java.util.EventListener;

public interface TemperatureChangeListener extends EventListener {

    void temperatureChanged(TemperatureChangeEvent event);
  }
