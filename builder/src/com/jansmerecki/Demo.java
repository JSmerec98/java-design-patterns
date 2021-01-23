package com.jansmerecki;

import com.jansmerecki.builders.CarBuilder;
import com.jansmerecki.builders.CarManualBuilder;
import com.jansmerecki.cars.Car;
import com.jansmerecki.cars.Manual;
import com.jansmerecki.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}