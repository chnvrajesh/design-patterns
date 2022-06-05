package com.nvrviews.creational.builderpattern;

public class Car {
    private String brandName;
    private String engineCapacity;
    private String bodyType;
    private String color;
    private String fuelType;

    private Car(CarBuilder carBuilder) {
        this.brandName = carBuilder.brandName;
        this.bodyType = carBuilder.bodyType;
        this.color = carBuilder.color;
        this.engineCapacity = carBuilder.engineCapacity;
        this.fuelType = carBuilder.fuelType;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public static class CarBuilder {
        private final String brandName;
        private String engineCapacity;
        private final String bodyType;
        private String color;
        private String fuelType;

        public CarBuilder(String brandName, String bodyType) {
            this.brandName = brandName;
            this.bodyType = bodyType;
        }

        public CarBuilder engineCapacity(String capacity){
            this.engineCapacity = capacity;
            return this;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

        public CarBuilder fuelType(String fuel){
            this.fuelType = fuel;
            return this;
        }

        public Car build(){
            Car car = new Car(this);
            return car;
        }
    }
}
