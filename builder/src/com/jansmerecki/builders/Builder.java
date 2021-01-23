package com.jansmerecki.builders;

import com.jansmerecki.cars.CarType;
import com.jansmerecki.components.Engine;
import com.jansmerecki.components.GPSNavigator;
import com.jansmerecki.components.Transmission;
import com.jansmerecki.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}