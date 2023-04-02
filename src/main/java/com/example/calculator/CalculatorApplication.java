public class CalculatorApplication {
    static double firstNumber= 10.0;
    static double secondNumber=5.0;

    public static void main(String[] args) {
        CalculatorApplication calculate = new CalculatorApplication();
        calculate.methods();
    }


    public void methods(){
        double addition = firstNumber + secondNumber;
        double substraction = firstNumber - secondNumber;
        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);
    }
}
