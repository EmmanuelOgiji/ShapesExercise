package shapes;

public class Square extends ShapeClass {
    private double length;
    private double perimeter;
    private double area;

    public Square(double _length) {
        super("square");
        if (_length == 0){
            throw new IllegalArgumentException("A square cannot have length 0");
        }
        length = _length;
        perimeter = this.calculatePerimeter();
        area = this.calculateArea();
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private double calculatePerimeter() {
        return (4 * this.length);
    }

    private double calculateArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public String printDetails() {
        return String.format(
                "This square has Length %s, Perimeter %s and Area %s",
                this.length,
                this.perimeter,
                this.area
        );
    }

}
