import shapes.Circle;
import shapes.ShapeClass;
import shapes.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class runner {
    public static void main(String [] args){
        System.out.println("What shape are you interested in?");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        System.out.println(String.format("You chose %s", shape));
        ShapeSolver solver = new ShapeSolver(shape);
        System.out.println("What is the dimension of the shape?");
        double dimension = Double.parseDouble(scanner.nextLine());
        List<ShapeClass> shapeClasses = new ArrayList<>();
        shapeClasses.add(new Square(dimension));
        shapeClasses.add(new Circle(dimension));
        System.out.println(solver.solve_shape(shapeClasses));
    }
}
