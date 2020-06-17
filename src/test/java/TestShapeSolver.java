import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestShapeSolver {

    @Test
    public void TestShapeSolverForSquareWithLength6(){
        ShapeSolver solver = new ShapeSolver("square");
        assertThat(solver.solve_shape(6)).isEqualTo("This square has Length 6.0, Perimeter 24.0 and Area 36.0");
    }

    @Test
    public void TestShapeSolverForSquareWithLength7(){
        ShapeSolver solver = new ShapeSolver("square");
        assertThat(solver.solve_shape(7)).isEqualTo("This square has Length 7.0, Perimeter 28.0 and Area 49.0");
    }

    @Test
    public void TestShapeSolverForCircleWithRadius7(){
        ShapeSolver solver = new ShapeSolver("circle");
        assertThat(solver.solve_shape(7)).isEqualTo("This circle has Radius 7.0, Circumference 44.0 and Area 154.0");
    }
}
