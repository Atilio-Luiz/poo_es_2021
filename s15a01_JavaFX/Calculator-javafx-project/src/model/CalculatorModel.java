package model;

public class CalculatorModel {
    public double calculate(double number1, double number2, String operator) {
        switch(operator) {
            case "+": return number1 + number2;
            case "-": return number1 - number2;
            case "*": return number1 * number2;
            case "/": 
                if(number2 == 0) 
                    throw new ArithmeticException("fail: division by zero");
                else 
                    return number1 / number2;
            default: return 0;
        }
    }
}
