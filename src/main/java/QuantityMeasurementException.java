public class QuantityMeasurementException extends Exception{
   enum Exception {
       NULL_EXCEPTION,
       NOT_POSSIBLE_EXCEPTION
   }

   Exception type;

    public QuantityMeasurementException(Exception type) {
        this.type = type;
    }
}
