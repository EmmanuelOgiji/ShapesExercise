public class Square extends ShapeClass {
    private double length;
    private double perimeter;
    private double area;

    public Square(double _length){
        super("square");
        if (_length == 0){
            throw new IllegalArgumentException("A square cannot have length 0");
        }
        length = _length;
        perimeter = this.calculate_perimeter();
        area = this.calculate_area();
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    private double calculate_perimeter(){
        return (4 * this.length);
    }

    private double calculate_area(){
        return Math.pow(this.length, 2);
    }

    public String print_details(){
        return String.format(
                "This square has Length %s, Perimeter %s and Area %s",
                this.length,
                this.calculate_perimeter(),
                this.calculate_area()
        );
    }

}
