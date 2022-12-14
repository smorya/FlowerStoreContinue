package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private String color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(double sepalLength, String color, double price) {
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;

    }

    public void setPrice(int number) {
        price = number;
    }


    public String getColor() {
        return color;
    }
}
