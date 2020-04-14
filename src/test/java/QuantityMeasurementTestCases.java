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
    public void givenLengthInFeet_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(0, Entity.FEET);
        Convertor lengthTwo = new Convertor(0, Entity.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenLengthInFeetAndNull_ShouldReturnFalse() {
        Convertor lengthOne = new Convertor(0, Entity.FEET);
        Convertor lengthTwo = null;
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NULL_EXCEPTION);
        }

    }

    @Test
    public void givenSameFeetRef_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor length = new Convertor(0, Entity.FEET);
        boolean temp = quantityMeasurement.compare(length, length);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameFeetType_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(0, Entity.FEET);
        Convertor lengthTwo = new Convertor(0, Entity.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameFeetValue_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(5, Entity.FEET);
        Convertor lengthTwo = new Convertor(5, Entity.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenFeetDifferentValue_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(4, Entity.FEET);
        Convertor lengthTwo = new Convertor(5, Entity.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenLengthInInch_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(0, Entity.INCH);
        Convertor lengthTwo = new Convertor(0, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenLengthInInchAndNull_ShouldReturnFalse() {
        Convertor lengthOne = new Convertor(0, Entity.INCH);
        Convertor lengthTwo = null;
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NULL_EXCEPTION);
        }
    }

    @Test
    public void givenSameInchRef_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor length = new Convertor(0, Entity.INCH);
        boolean temp = quantityMeasurement.compare(length, length);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameInchType_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(0, Entity.INCH);
        Convertor lengthTwo = new Convertor(0, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenSameInchValue_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(5, Entity.INCH);
        Convertor lengthTwo = new Convertor(5, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenInchDifferentValue_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(4, Entity.INCH);
        Convertor lengthTwo = new Convertor(5, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void givenFeetAndInch_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.FEET);
        Convertor lengthTwo = new Convertor(12, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(3, Entity.FEET);
        Convertor lengthTwo = new Convertor(1, Entity.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.FEET);
        Convertor lengthTwo = new Convertor(1, Entity.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.INCH);
        Convertor lengthTwo = new Convertor(1, Entity.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertFalse(temp);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.YARD);
        Convertor lengthTwo = new Convertor(36, Entity.INCH);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(36, Entity.INCH);
        Convertor lengthTwo = new Convertor(1, Entity.YARD);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.YARD);
        Convertor lengthTwo = new Convertor(3, Entity.FEET);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(2, Entity.INCH);
        Convertor lengthTwo = new Convertor(5, Entity.CENTIMETER);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenInchAndInch_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(2, Entity.INCH);
        Convertor lengthTwo = new Convertor(2, Entity.INCH);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(4,temp,0);
    }

    @Test
    public void givenFeetAndInch_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.FEET);
        Convertor lengthTwo = new Convertor(2, Entity.INCH);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(14,temp,0);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.FEET);
        Convertor lengthTwo = new Convertor(1, Entity.FEET);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(24,temp,0);
    }

    @Test
    public void givenInchAndCentimeter_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(2, Entity.INCH);
        Convertor lengthTwo = new Convertor(2.5, Entity.CENTIMETER);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(3,temp,0);
    }

    @Test
    public void givenGallonAndLiter_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.GALLON);
        Convertor lengthTwo = new Convertor(3.78, Entity.LITRE);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(7.56,temp,0);
    }

    @Test
    public void givenLiterAndMiliLiter_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.LITRE);
        Convertor lengthTwo = new Convertor(1000, Entity.MILLILITER);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(2,temp,0);
    }

    @Test
    public void givenTonneAndGram_WhenAdded_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.TONNE);
        Convertor lengthTwo = new Convertor(1000, Entity.GRAM);
        double temp = quantityMeasurement.addition(lengthOne, lengthTwo);
        Assert.assertEquals(1001,temp,0);
    }

    @Test
    public void givenKilogramAndGram_ShouldReturnResult() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(1, Entity.KILOGRAM);
        Convertor lengthTwo = new Convertor(1000, Entity.GRAM);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenFahrenheitAndCelsius_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(212, Entity.FAHRENHEIT);
        Convertor lengthTwo = new Convertor(100, Entity.CELSIUS);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenCelsiusAndFahrenheit_ShouldReturnTrue() throws QuantityMeasurementException {
        Convertor lengthOne = new Convertor(0, Entity.CELSIUS);
        Convertor lengthTwo = new Convertor(32, Entity.FAHRENHEIT);
        boolean temp = quantityMeasurement.compare(lengthOne, lengthTwo);
        Assert.assertTrue(temp);
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenAdded_ShouldReturnResult() {
        Convertor lengthOne = new Convertor(0, Entity.CELSIUS);
        Convertor lengthTwo = new Convertor(32, Entity.FAHRENHEIT);
        try {
            quantityMeasurement.addition(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type, QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        }

    }

    @Test
    public void givenKilogramAndInch_ShouldReturnTrue() {
        Convertor lengthOne = new Convertor(1, Entity.KILOGRAM);
        Convertor lengthTwo = new Convertor(1, Entity.INCH);
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        }
    }

    @Test
    public void givenKilogramAndLitre_ShouldReturnTrue() {
        Convertor lengthOne = new Convertor(1, Entity.KILOGRAM);
        Convertor lengthTwo = new Convertor(1, Entity.LITRE);
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        }
    }

    @Test
    public void givenKilogramAndNull_WhenAdded_ShouldReturnResult() {
        Convertor lengthOne = new Convertor(1, Entity.KILOGRAM);
        Convertor lengthTwo = null;
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NULL_EXCEPTION);
        }
    }

    @Test
    public void givenNullAndKilograml_WhenAdded_ShouldReturnResult() {
        Convertor lengthOne = null;
        Convertor lengthTwo = new Convertor(1, Entity.KILOGRAM);
        try {
            quantityMeasurement.compare(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NULL_EXCEPTION);
        }
    }

    @Test
    public void givenKilogramAndLitre_WhenAdded_ShouldReturnResult() {
        Convertor lengthOne = new Convertor(1, Entity.KILOGRAM);
        Convertor lengthTwo = new Convertor(1, Entity.LITRE);
        try {
            quantityMeasurement.addition(lengthOne, lengthTwo);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(e.type,QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        }
    }
}
