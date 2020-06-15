import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class TestShapes {

    @Test
    public void ShapeThrowException(){
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> {
                    ShapeClass square = new ShapeClass(null);
                });
    }

    @Test
    public void ShapeClassAcceptsName(){
        ShapeClass square = new ShapeClass("square");
        assertThat(square.getName()).isEqualTo("square");
    }

}
