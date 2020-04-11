import java.util.Objects;

public class Length {

    private int length;
    private QuantityMeasurement.Unit unit;

    public Length(int length, QuantityMeasurement.Unit unit) {
        if(unit == QuantityMeasurement.Unit.FEET){
            this.length = 12 * length;
            this.unit = QuantityMeasurement.Unit.INCH;
        } else {
            this.length = length;
            this.unit = unit;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return length == length1.length &&
                unit == length1.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, unit);
    }
}
