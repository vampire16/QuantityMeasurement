public class Convertor {

    private double value;
    public EntityType entityType;

    public Convertor(double value, Entity entity) {
        if (entity.entityType == EntityType.TEMPERATURE)
            this.value = (entity == Entity.FAHRENHEIT) ? (value - 32) * 5 / 9 : value;
        else
            this.value = value * entity.getValue();
        this.entityType = entity.entityType;
    }

    public double getValue() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convertor value1 = (Convertor) o;
        return Double.compare(value1.value, value) == 0;
    }
}
