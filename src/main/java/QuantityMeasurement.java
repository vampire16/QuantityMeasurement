public class QuantityMeasurement {

    enum Unit{
        FEET,
        INCH
    }

    public static void main(String[] args){
        System.out.println("Welcome");
    }

    public boolean compare(Length lengthOne, Length lengthTwo){
        if(lengthOne.equals(lengthTwo))
            return  true;
        return false;
    }
}
