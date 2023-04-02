public class Calculator {
    static double firstNumber= 10.0;
    static double secondNumber=5.0;

    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.methods();
    }


    public void methods(){
        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
    }
}

