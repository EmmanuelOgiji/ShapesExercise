import org.reflections.Reflections;
import shapes.Circle;
import shapes.ShapeClass;
import shapes.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class runner {
    public static void main(String [] args){


        System.out.println("What shape are you interested in?");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        System.out.println(String.format("You chose %s", shape));


        ShapeSolver solver = new ShapeSolver(shape);
        System.out.println("What is the dimension of the shape?");
        double dimension = Double.parseDouble(scanner.nextLine());


        Reflections reflections = new Reflections("shapes");
        Set<Class<? extends ShapeClass>> shapes = reflections.getSubTypesOf(ShapeClass.class);

        //TODO: Use reflection output to inject dependency
        //TODO: Figure out how to only initialize the needed class
        List<ShapeClass> shapeClasses = new ArrayList<>();
        shapeClasses.add(new Square(dimension));
        shapeClasses.add(new Circle(dimension));
        System.out.println(solver.solve_shape(shapeClasses));
    }
}
