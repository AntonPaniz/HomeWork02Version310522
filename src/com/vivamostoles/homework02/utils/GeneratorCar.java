package com.vivamostoles.homework02.utils;

import com.vivamostoles.homework02.Car;
import com.vivamostoles.homework02.service.CarMarks;
import com.vivamostoles.homework02.service.CarModels;

import java.util.Random;

public class GeneratorCar {
    public static Car [] generazicion(int numberOfCarsToMake) {
        Car [] cars = new Car[numberOfCarsToMake];
        String [] carMarksList = CarMarks.marks;
        String [] carModelList = CarModels.models;
        for (int i = 0; i < cars.length; i++) {
            int randomValueOfMarks = new Random().nextInt(carMarksList.length);
            int randomValueOfModels = new Random().nextInt(carModelList.length);
            int randomValueForEngineVolume = (int) (1 + Math.random() * 4);
            int randomValueForFuelCons = (int) (1 + Math.random() * 15);
            int randomValueForTanksCapa = (int) (1 + Math.random() * 100);
            Car carFromGenerator = new Car(carMarksList[randomValueOfMarks],
                    carModelList[randomValueOfModels], 33, 33,2);
            carFromGenerator.setFuelCons(randomValueForFuelCons);
            carFromGenerator.setTankCapa(randomValueForTanksCapa);
            carFromGenerator.setEngineVolume(randomValueForEngineVolume);
            cars[i] = carFromGenerator;
            //System.out.println(cars[i]);
        }
        return cars;

    }
}
