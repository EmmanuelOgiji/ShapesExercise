import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class TestCircle {

    @Test
    public void TestSquareDoesNotAccept0Length(){
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    Circle circle = new Circle(0);
                }).withMessage("A circle cannot have radius 0");
    }

    @Test
    public void TestCircleAcceptsRadius(){
        Circle circle = new Circle(7);
        assertThat(circle.getRadius()).isEqualTo(7);
    }

    @Test
    public void TestCircleCircumference(){
        Circle circle = new Circle(7);
        assertThat(circle.getCircumference()).isEqualTo(44);
    }




}
