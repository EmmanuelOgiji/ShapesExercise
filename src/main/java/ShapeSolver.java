public class ShapeSolver {
    private String shape;

    ShapeSolver(String _shape){
        shape = _shape;
    }



    public String solve_shape(double dimension) {
        if (this.shape.equals("square")) {
            Square square = new Square(dimension);
            return square.print_details();
        }
        if (this.shape.equals("circle")) {
            Circle circle = new Circle(dimension);
            return circle.print_details();
        }
        return "N/A";
    }

}
