import org.junit.Test;
import shapes.Square;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class TestSquare {

    @Test
    public void TestSquareDoesNotAccept0Length(){
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    Square square = new Square(0);
                }).withMessage("A square cannot have length 0");
    }

    @Test
    public void TestSquareAcceptsLength(){
        Square square = new Square(4);
        assertThat(square.getLength()).isEqualTo(4);
    }

    @Test
    public void TestSquarePerimeterWhenLengthis5(){
        Square square = new Square(5);
        assertThat(square.getPerimeter()).isEqualTo(20);
    }

    @Test
    public void TestSquarePerimeterWhenLengthis20(){
        Square square = new Square(20);
        assertThat(square.getPerimeter()).isEqualTo(80);
    }

    @Test
    public void TestSquareAreaWhenLengthis5(){
        Square square = new Square(5);
        assertThat(square.getArea()).isEqualTo(25);
    }

    @Test
    public void TestSquareAreaWhenLengthis6(){
        Square square = new Square(6);
        assertThat(square.getArea()).isEqualTo(36);
    }

    @Test
    public void TestSquarePrintDetailsLength5(){
        Square square = new Square(5);
        String expected = "This square has Length 5.0, Perimeter 20.0 and Area 25.0";
        assertThat(square.printDetails()).isEqualTo(expected);
    }

    @Test
    public void TestSquarePrintDetailsLength6(){
        Square square = new Square(6);
        String expected = "This square has Length 6.0, Perimeter 24.0 and Area 36.0";
        assertThat(square.printDetails()).isEqualTo(expected);
    }
}
