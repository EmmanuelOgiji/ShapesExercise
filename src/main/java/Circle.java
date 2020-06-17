import java.util.Scanner;

public class Circle extends ShapeClass{
    private double radius;
    private double circumference;
    private double area;

    Circle(double _radius){
        super("circle");
        if (_radius == 0){
            throw new IllegalArgumentException("A circle cannot have radius 0");
        }
        radius = _radius;
        circumference = this.calculate_circumference();
        area = this.calculate_area();
    }

    double getRadius(){
        return radius;
    }
    double getCircumference(){
        return circumference;
    }
    double getArea(){return area; }



    private double calculate_circumference(){
        return Math.round(Math.PI * 2 * this.radius);
    }

    private double calculate_area(){
        return Math.round(Math.PI * (Math.pow(this.radius, 2)));
    }

    @Override
    public String print_details(){
        return String.format(
                "This circle has Radius %s, Circumference %s and Area %s",
                this.radius,
                this.circumference,
                this.area
        );
    }
}
