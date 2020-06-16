public class Circle extends ShapeClass{
    private double radius;

    public Circle(double _radius){
        super("circle");
        radius = _radius;
    }

    public double getRadius(){
        return radius;
    }
}
