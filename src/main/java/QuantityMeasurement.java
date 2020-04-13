public class QuantityMeasurement {

    public static void main(String[] args){
        System.out.println("Welcome");
    }

    public boolean compare(Length lengthOne, Length lengthTwo){
        return lengthOne.equals(lengthTwo);
    }

    public double addition(Length lengthOne, Length lengthTwo) {
        return lengthOne.getLength()+lengthTwo.getLength();
    }
}
