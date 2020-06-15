public class ShapeClass {
    private String name;

    public ShapeClass() {
       throw new NullPointerException();
    }

    public ShapeClass(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
}
