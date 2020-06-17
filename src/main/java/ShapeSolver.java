import java.util.ArrayList;
import java.util.List;

public class ShapeSolver {
    private String shape;

    ShapeSolver(String _shape){
        shape = _shape;
    }



    public String solve_shape(double dimension) {
        List<ShapeClass> shapeClasses = new ArrayList<>();
        shapeClasses.add(new Square(dimension));
        shapeClasses.add(new Circle(dimension));
        for (ShapeClass shapeClass : shapeClasses) {
            if (shapeClass.getName().equals(shape)) {
                return shapeClass.print_details();
            }
        }
        return "N/A";
    }

}
