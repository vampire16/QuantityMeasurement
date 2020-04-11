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
        Length lengthOne = new Length(0, QuantityMeasurement.Unit.FEET);
        Length lengthTwo = new Length(0, QuantityMeasurement.Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenLengthInFeetAndNull_ShouldReturnFalse() {
        Length lengthOne = new Length(0, QuantityMeasurement.Unit.FEET);
        Length lengthTwo = null;
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenSameRef_ShouldReturnTrue() {
        Length length = new Length(0, QuantityMeasurement.Unit.FEET);
        boolean temp = quantityMeasurement.compare(length, length);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameType_ShouldReturnTrue() {
        Length lengthOne = new Length(0, QuantityMeasurement.Unit.FEET);
        Length lengthTwo = new Length(0, QuantityMeasurement.Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameValue_ShouldReturnTrue() {
        Length lengthOne = new Length(5, QuantityMeasurement.Unit.FEET);
        Length lengthTwo = new Length(5, QuantityMeasurement.Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenDifferentValue_ShouldReturnTrue() {
        Length lengthOne = new Length(4, QuantityMeasurement.Unit.FEET);
        Length lengthTwo = new Length(5, QuantityMeasurement.Unit.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenLengthInInch_ShouldReturnTrue() {
        Length lengthOne = new Length(0, QuantityMeasurement.Unit.INCH);
        Length lengthTwo = new Length(0, QuantityMeasurement.Unit.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

}
