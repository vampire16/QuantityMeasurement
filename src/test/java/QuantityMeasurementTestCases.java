import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTestCases {
    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenLengthInFeet_ShouldReturnTrue() {
        Length lengthOne = new Length(0, Unit.FEET);
        Length lengthTwo = new Length(0, Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenLengthInFeetAndNull_ShouldReturnFalse() {
        Length lengthOne = new Length(0, Unit.FEET);
        Length lengthTwo = null;
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenSameFeetRef_ShouldReturnTrue() {
        Length length = new Length(0, Unit.FEET);
        boolean temp = quantityMeasurement.compare(length, length);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameFeetType_ShouldReturnTrue() {
        Length lengthOne = new Length(0, Unit.FEET);
        Length lengthTwo = new Length(0, Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameFeetValue_ShouldReturnTrue() {
        Length lengthOne = new Length(5, Unit.FEET);
        Length lengthTwo = new Length(5, Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenFeetDifferentValue_ShouldReturnTrue() {
        Length lengthOne = new Length(4, Unit.FEET);
        Length lengthTwo = new Length(5, Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenLengthInInch_ShouldReturnTrue() {
        Length lengthOne = new Length(0, Unit.INCH);
        Length lengthTwo = new Length(0, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenLengthInInchAndNull_ShouldReturnFalse() {
        Length lengthOne = new Length(0, Unit.INCH);
        Length lengthTwo = null;
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenSameInchRef_ShouldReturnTrue() {
        Length length = new Length(0, Unit.INCH);
        boolean temp = quantityMeasurement.compare(length, length);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameInchType_ShouldReturnTrue() {
        Length lengthOne = new Length(0, Unit.INCH);
        Length lengthTwo = new Length(0, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameInchValue_ShouldReturnTrue() {
        Length lengthOne = new Length(5, Unit.INCH);
        Length lengthTwo = new Length(5, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenInchDifferentValue_ShouldReturnTrue() {
        Length lengthOne = new Length(4, Unit.INCH);
        Length lengthTwo = new Length(5, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenFeetAndInch_ShouldReturnTrue() {
        Length lengthOne = new Length(1, Unit.FEET);
        Length lengthTwo = new Length(12, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        Length lengthOne = new Length(3, Unit.FEET);
        Length lengthTwo = new Length(1, Unit.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnTrue() {
        Length lengthOne = new Length(1, Unit.FEET);
        Length lengthTwo = new Length(1, Unit.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnTrue() {
        Length lengthOne = new Length(1, Unit.INCH);
        Length lengthTwo = new Length(1, Unit.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        Length lengthOne = new Length(1, Unit.YARD);
        Length lengthTwo = new Length(36, Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        Length lengthOne = new Length(36, Unit.INCH);
        Length lengthTwo = new Length(1, Unit.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        Length lengthOne = new Length(1, Unit.YARD);
        Length lengthTwo = new Length(3, Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() {
        Length lengthOne = new Length(2, Unit.INCH);
        Length lengthTwo = new Length(5, Unit.CENTIMETER);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }
}
