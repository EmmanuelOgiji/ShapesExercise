import org.junit.Test;
import shapes.Circle;

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
    public void TestCircleCircumferenceWhenRadiusis7(){
        Circle circle = new Circle(7);
        assertThat(circle.getCircumference()).isEqualTo(44);
    }

    @Test
    public void TestCircleCircumferenceWhenRadiusis14(){
        Circle circle = new Circle(14);
        assertThat(circle.getCircumference()).isEqualTo(88);
    }

    @Test
    public void TestCircleAreaWhenRadiusis7(){
        Circle circle = new Circle(7);
        assertThat(circle.getArea()).isEqualTo(154);
    }

    @Test
    public void TestCirclePrintDetailsWhenRadiusis21(){
        Circle circle = new Circle(21);
        String expected = "This circle has Radius 21.0, Circumference 132.0 and Area 1385.0";
        assertThat(circle.print_details()).isEqualTo(expected);
    }



}
