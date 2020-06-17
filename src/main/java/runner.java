import java.util.Scanner;

public class runner {
    public static void main(String [] args){
        System.out.println("What shape are you interested in?");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        System.out.println(String.format("You chose %s", shape));
        System.out.println("What is the length of the square?");
        double length = Double.parseDouble(scanner.nextLine());
        Square square = new Square(length);
        System.out.println(square.print_details());
    }
}
