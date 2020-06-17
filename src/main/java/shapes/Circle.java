package shapes;

public class Circle extends ShapeClass {
    private double radius;
    private double circumference;
    private double area;

    public Circle(double _radius) {
        super("circle");
        if (_radius == 0){
            throw new IllegalArgumentException("A circle cannot have radius 0");
        }
        radius = _radius;
        circumference = this.calculateCircumference();
        area = this.calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }


    private double calculateCircumference() {
        return Math.round(Math.PI * 2 * this.radius);
    }

    private double calculateArea() {
        return Math.round(Math.PI * (Math.pow(this.radius, 2)));
    }

    @Override
    public String printDetails() {
        return String.format(
                "This circle has Radius %s, Circumference %s and Area %s",
                this.radius,
                this.circumference,
                this.area
        );
    }
}
