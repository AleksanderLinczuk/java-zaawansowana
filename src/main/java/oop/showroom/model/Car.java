package oop.showroom.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oop.showroom.model.enums.*;


@Getter
@Setter
@NoArgsConstructor
public class Car extends Vehicle {
    private FuelType fuel;
    private String carDrive;
    private int doorsNumber;
    private Integer capacity;
    private int passengersNumber;

    public Car(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
               GearboxType gearboxType, boolean isUsed, FuelType fuel, String carDrive, int doorsNumber,
               Integer capacity, int passengersNumber) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.fuel = fuel;
        this.carDrive = carDrive;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand: " + super.getBrand() +
                ", model: " + super.getModel() +
                ", fuel: " + fuel +
                ", carDrive: " + carDrive +
                ", doorsNumber: " + doorsNumber +
                ", capacity: " + capacity +
                ", passengersNumber: " + passengersNumber +
                "}";
    }

    @Override
    public Object getSimpleVehicle() {
        return new SimpleCar(this);
    }

//    public SimpleCar createSimpleCar(Car car) {
//        return new SimpleCar(car);
//    }

    static class SimpleCar {
        private BrandType brandType;
        private ModelType modelType;
        private boolean isUsed;

        public SimpleCar(Car car) {
            this.brandType = car.getBrand();
            this.modelType = car.getModel();
            this.isUsed = car.isUsed();
        }

        @Override
        public String toString() {
            return "SimpleCar{" +
                    "brandType=" + brandType +
                    ", modelType=" + modelType +
                    ", isUsed=" + isUsed +
                    '}';
        }
    }
}