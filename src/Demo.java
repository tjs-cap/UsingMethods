import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        boolean run = true;
        String choice;
        Scanner reader = new Scanner(System.in);

        do {
            choice = displayMenu();
            if (choice.equals("x")){
                run = false;
            }
            else if (choice.equals("1")){
                double x = getNumber(1);
                double y = getNumber(2);
                double total = sumMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("2")){
                double x = getNumber(1);
                double y = getNumber(2);
                double total = subtractMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("3")){
                double x = getNumber(1);
                double y = getNumber(2);
                double total = multiplyMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("4")){
                double x = getNumber(1);
                double y = getNumber(2);
                double total = divideMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else {
                System.out.println("Entry not recognised, please try again...");
            }

        } while (run);
    }

    public static double getNumber(int count){
        boolean numberWrong = true;
        while (numberWrong) {
            if (count == 1) {
                System.out.print("Enter 1st number: ");
            } else {
                System.out.print("Enter 2nd number: ");
            }
            Scanner reader = new Scanner(System.in);
            try {
                double x = reader.nextDouble();
                return x;
            } catch (Exception e){
                System.out.println("Number not recognised, please try again.");
            }
        }
        return 0;
    }

    public static String displayMenu(){
        System.out.println(" Calculator Menu");
        System.out.println("1. Add numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.println("x. Exit program");
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter option (1,2,3,4,x): ");
        return reader.nextLine();
    }

    public static boolean checkFinish(){
        Scanner reader = new Scanner(System.in);
        boolean check = true;
        System.out.print("Have you finished (y/n): ");
        String ans = reader.nextLine().trim().toLowerCase();
        if (ans.equals("y")){
            return false;
        }
        else{
            return true;
        }
    }

    public static double sumMethod(double n, double m){
        System.out.println("When adding the numbers");
        return (n + m);
    }

    public static double subtractMethod(double n, double m){
        System.out.println("When subtracting the numbers");
        return (n - m);
    }

    public static double multiplyMethod(double n, double m){
        System.out.println("When multiplying the numbers");
        return (n * m);
    }

    public static double divideMethod(double n, double m){
        System.out.println("When dividing the numbers");
        return ((double)n / m);
    }

    public static void display(double sum){
        System.out.println("The answer is: " + sum);
    }
}
