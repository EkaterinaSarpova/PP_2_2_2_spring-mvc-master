package web.model;

public class Car {
    private String brand;
    private String model;
    private int releaseYear;

    public Car(String brand, String model, int releaseYear) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
