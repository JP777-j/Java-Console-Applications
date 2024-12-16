import java.util.Scanner;
public class CalculatorLogic {

private static double add(double a,double b){
    return a+b;
}
private static double subtract(double a,double b){
    return a-b;
}
private static double multiply(double a,double b){
    return a*b;
}
private static double divide(double a,double b){
    return a/b;
}


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double result = scanner.nextDouble();
        
        while (true) {
            System.out.println("Current result: " + result);
            System.out.println("Enter an operator (+, -, *, /) or type 'exit' to quit:");
            String operator = scanner.next();
            
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Final result: " + result);
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            
            System.out.println("Enter the next number:");
            double nextNumber = scanner.nextDouble();
            
          
                switch (operator) {
                    case "+":
                        result = add(result, nextNumber);
                        break;
                    case "-":
                        result = subtract(result, nextNumber);
                        break;
                    case "*":
                        result = multiply(result, nextNumber);
                        break;
                    case "/":
                        result = divide(result, nextNumber);
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, or /.");
                        continue;
                }
            } 
            }
        }
        
    

    
    







