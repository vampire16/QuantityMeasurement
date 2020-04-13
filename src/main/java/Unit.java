public enum Unit {
    FEET(12),
    INCH(1),
    YARD(36),
    CENTIMETER(0.4),
    LITRE(1),
    MILILITER(0.001),
    GALLON(3.78),
    GRAM(0.001),
    KILOGRAM(1),
    TONNE(1000),
    FAHRENHEIT(1),
    CELCIUS(2.12);

    private final double length;

    Unit(double length) { this.length = length; }

    public double getLength() { return length; }
}
