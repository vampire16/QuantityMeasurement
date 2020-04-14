public class QuantityMeasurement {

    public boolean compare(Convertor firstValue, Convertor secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.Exception.NULL_EXCEPTION);
        else if (firstValue.entityType != secondValue.entityType)
            throw new QuantityMeasurementException(QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        return firstValue.equals(secondValue);
    }

    public double addition(Convertor firstValue, Convertor secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.Exception.NULL_EXCEPTION);
        else if (firstValue.entityType != secondValue.entityType)
            throw new QuantityMeasurementException(QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        else if (firstValue.entityType == EntityType.TEMPERATURE)
            throw new QuantityMeasurementException(QuantityMeasurementException.Exception.NOT_POSSIBLE_EXCEPTION);
        return firstValue.getValue()+secondValue.getValue();
    }
}
