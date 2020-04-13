import java.util.Objects;

public class Length {

    private double length;
    private Unit unit;

    public Length(double length, Unit unit) {
        this.length = length * unit.getValue();
        this.unit = unit;
    }

    public double getValue() { return length; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return Double.compare(length1.length, length) == 0;
    }
}
