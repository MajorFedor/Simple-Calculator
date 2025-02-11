import java.util.Scanner;
    
public class Main{

    public static int plus(int x, int y){
        return x + y;
    }
    public static int minus(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide(int x, int y){
        return x / y;
    }
    public static int pow(int x, int y){
        return x * x + y * y;
    }

    public static String menu(){
        String menu = """
                --Calculator--
                Choose action.
                1. Plus.
                2. Minus.
                3. Multiply.
                4. divide.
                5. Pow.
                """;
        System.out.print(menu);

        return menu;
    }

    public static int[] getXY() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        while (true) {
            System.out.println("Enter first number.");
            if (sc.hasNextInt()) {
                numbers[0] = sc.nextInt();
            } else {
                System.out.println("You entered an incorrect number.");
                sc.next();
                continue;
            }

            System.out.println("Enter second number.");
            if (sc.hasNextInt()) {
                numbers[1] = sc.nextInt(); 
                break;
            } else {
                System.out.println("You entered an incorrect number.");
                sc.next();
            }
        }
        return numbers;
    }

    public static int action(int choice, int x, int y){
        
        int result = 0;

        if(choice == 1){
            result = plus(x, y);
        } else if (choice == 2){
            result = minus(x, y);
        } else if (choice == 3){
            result = multiply(x, y);
        } else if (choice == 4){
            result = divide(x, y);
        } else if (choice == 5){
            result = pow(x, y);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = getXY();
        int x = numbers[0];
        int y = numbers[1];

        menu();

        System.out.println("Enter. ");
        int choice = sc.nextInt();

        int result = action(choice, x, y);

        System.out.println("Result " + result);
        sc.close();
    }
}