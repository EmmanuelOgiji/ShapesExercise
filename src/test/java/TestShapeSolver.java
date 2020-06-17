import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestShapeSolver {

    @Test
    public void TestShapeSolverForSquare(){
        ShapeSolver solver = new ShapeSolver("square");
        assertThat(solver.solve_shape(6)).isEqualTo("This square has Length 6.0, Perimeter 24.0 and Area 36.0");
    }
}
