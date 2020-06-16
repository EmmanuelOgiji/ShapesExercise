public class Square extends ShapeClass {
    private double length;

    public Square(double _length){
        super("square");
        length = _length;
    }

    public double getLength() {
        return length;
    }

    public double calculate_perimeter(){
        return (4 * this.length);
    }

    public double calculate_area(){
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
