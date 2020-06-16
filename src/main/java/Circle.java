public class Circle extends ShapeClass{
    private double radius;
    private double circumference;

    public Circle(double _radius){
        super("circle");
        if (_radius == 0){
            throw new IllegalArgumentException("A circle cannot have radius 0");
        }
        radius = _radius;
        circumference = this.calculate_circumference();
    }

    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return circumference;
    }



    private double calculate_circumference(){
        return Math.round(Math.PI * 2 * this.radius);
    }
}
