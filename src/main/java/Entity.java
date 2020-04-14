public enum Entity {
    FEET(12, EntityType.LENGTH),
    INCH(1, EntityType.LENGTH),
    YARD(36, EntityType.LENGTH),
    CENTIMETER(0.4, EntityType.LENGTH),
    LITRE(1, EntityType.VOLUME),
    MILLILITER(0.001, EntityType.VOLUME),
    GALLON(3.78, EntityType.VOLUME),
    GRAM(0.001, EntityType.WEIGHT),
    KILOGRAM(1, EntityType.WEIGHT),
    TONNE(1000, EntityType.WEIGHT),
    FAHRENHEIT(1, EntityType.TEMPERATURE),
    CELSIUS(1, EntityType.TEMPERATURE);

    private final double value;
    EntityType entityType;

    Entity(double value, EntityType entityType) {
        this.value = value;
        this.entityType = entityType;
    }

    public double getValue() {
        return value;
    }
}
