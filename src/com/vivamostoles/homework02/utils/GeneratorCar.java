package com.vivamostoles.homework02.utils;

import com.vivamostoles.homework02.Car;
import com.vivamostoles.homework02.service.CarMarks;
import com.vivamostoles.homework02.service.CarModels;
import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.service.PatronymicNamesList;

import java.util.Random;

public class GeneratorCar {}
    /*public static Car [] generazicion(int numberOfCarsToMake) {
        Car [] cars = new Car[numberOfCarsToMake];
        String [] authorLastName = AuthorLastNamesList.lastNames;
        String [] authorFirstName = AuthorFirstNamesList.firstNames;
        String [] patronymicName = PatronymicNamesList.patronymicNames;
        String [] literaryWork = LiteraryWorks.literaryWorks;
        for (int i = 0; i < cars.length; i++) {
            int randomValueOfLastName = new Random().nextInt(authorLastName.length);
            int randomValueOfFirstName = new Random().nextInt(authorFirstName.length);
            int randomValueOfpatronymicName = new Random().nextInt(patronymicName.length);
            int randomValueOfliteraryWork = new Random().nextInt(LiteraryWorks.literaryWorks.length);
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
*/