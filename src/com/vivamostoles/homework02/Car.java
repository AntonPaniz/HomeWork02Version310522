package com.vivamostoles.homework02;

import com.vivamostoles.homework02.service.CarMovement;

import java.util.Objects;

public class Car implements CarMovement, Comparable<Car> {
    private String carMark;
    private String carModel;
    private int fuelCons;
    private int tankCapa;
    private double engineVolume;
  Car(){
      carMark = "Seat";
      carModel = "Cordoba";
      fuelCons = 7;
      tankCapa = 60;
      engineVolume = 1.6;
  }

    public Car(String carMark, String carModel, int fuelCons, int tankCapa, double engineVolume) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.fuelCons = fuelCons;
        this.tankCapa = tankCapa;
        this.engineVolume = engineVolume;
    }

    public Car(String carMark, String carModel, int fuelCons, int tankCapa) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.fuelCons = fuelCons;
        this.tankCapa = tankCapa;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
    }

    public int getTankCapa() {
        return tankCapa;
    }

    public void setTankCapa(int tankCapa) {
        this.tankCapa = tankCapa;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelCons == car.fuelCons && tankCapa == car.tankCapa && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(carMark, car.carMark) && Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMark, carModel, fuelCons, tankCapa, engineVolume);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", fuelCons=" + fuelCons +
                ", tankCapa=" + tankCapa +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public int move(int fuelCons, int tanskCapa) {
        int distan = tanskCapa / fuelCons;
        System.out.println("max possible distance>>" + distan);
        return distan;
    }

    @Override
    public void highSpeed() {
        System.out.println("High speed it's no goood!");
    }

    @Override
    public int compareTo(Car carsToSort) {
        return (this.fuelCons - carsToSort.fuelCons );
    }


      }

