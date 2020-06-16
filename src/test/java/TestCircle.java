import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCircle {

    @Test
    public void TestCircleAcceptsRadius(){
        Circle circle = new Circle(7);
        assertThat(circle.getRadius()).isEqualTo(7);
    }




}
