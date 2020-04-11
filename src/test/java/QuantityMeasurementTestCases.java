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
}
