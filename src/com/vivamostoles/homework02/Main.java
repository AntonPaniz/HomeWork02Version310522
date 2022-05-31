package com.vivamostoles.homework02;

import com.vivamostoles.homework02.service.CarMovement;
import com.vivamostoles.homework02.utils.GeneratorCar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     Car [] carsToSort = GeneratorCar.generazicion(7);
        Arrays.sort(carsToSort);
        for (Car car: carsToSort)
        {System.out.println( car);}
    }
    Car carCheck = new Car();






}
