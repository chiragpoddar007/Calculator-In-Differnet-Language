import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner number_1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first_num = number_1.nextDouble();

        Scanner number_2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        double second_num = number_2.nextDouble();
        
        Scanner Operator = new Scanner(System.in);
        System.out.print("Enter Operation (+, -, *, /): ");
        char operator = Operator.next().charAt(0);

        if(operator == '+'){
            System.out.println(first_num + second_num);
        }
        else if(operator == '-'){
            System.out.println(first_num - second_num);
        }
        else if(operator == '*'){
            System.out.println(first_num * second_num);
        }
        else if(operator == '/'){
            if(second_num == 0){
                System.out.println("Division by zero is not allowed.");
            } else {
                System.out.println(first_num / second_num);
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}