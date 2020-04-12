public enum Unit {
    FEET(12),
    INCH(1),
    YARD(36);

    private final double length;

    Unit(double length) { this.length = length; }

    public double getValue() { return length; }
}
