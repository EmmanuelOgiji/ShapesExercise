import org.junit.Test;
import shapes.Circle;
import shapes.ShapeClass;
import shapes.Square;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestShapeSolver {

    @Test
    public void TestShapeSolverForSquareWithLength6(){
        ShapeSolver solver = new ShapeSolver("square");
        List<ShapeClass> shapeClasses = new ArrayList<>() {{
            add(new Square(6));
        }};
        assertThat(solver.solve_shape(shapeClasses)).isEqualTo("This square has Length 6.0, Perimeter 24.0 and Area 36.0");
    }

    @Test
    public void TestShapeSolverForSquareWithLength7(){
        ShapeSolver solver = new ShapeSolver("square");
        List<ShapeClass> shapeClasses = new ArrayList<>() {{
            add(new Square(7));
        }};
        assertThat(solver.solve_shape(shapeClasses)).isEqualTo("This square has Length 7.0, Perimeter 28.0 and Area 49.0");
    }

    @Test
    public void TestShapeSolverForCircleWithRadius7(){
        ShapeSolver solver = new ShapeSolver("circle");
        List<ShapeClass> shapeClasses = new ArrayList<>() {{
            add(new Circle(7));
        }};
        assertThat(solver.solve_shape(shapeClasses)).isEqualTo("This circle has Radius 7.0, Circumference 44.0 and Area 154.0");
    }
}
