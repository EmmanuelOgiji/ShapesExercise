public class Circle extends ShapeClass{
    private double radius;

    public Circle(double _radius){
        super("circle");
        if (radius == 0){
            throw new IllegalArgumentException("A circle cannot have radius 0");
        }
        radius = _radius;
    }

    public double getRadius(){
        return radius;
    }
}
