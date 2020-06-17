import shapes.ShapeClass;

import java.util.List;

public class ShapeSolver {
    private String shape;

    ShapeSolver(String _shape){
        shape = _shape;
    }


    public String solve_shape(List<ShapeClass> shapeClasses) {
        for (ShapeClass shapeClass : shapeClasses) {
            if (shapeClass.getName().equals(shape)) {
                return shapeClass.printDetails();
            }
        }
        return "N/A";
    }

}
