package entities;

public class Retangulo {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
    }

    public String toString() {
        return String.format("A área do retângulo é %.2f, o perimetro do retângulo é %.2f e a diagonal do retangulo mede %.2f",
                area(), perimeter(), diagonal());
    }
}
