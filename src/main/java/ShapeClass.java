public abstract class ShapeClass {
    private String name;

    ShapeClass(String _name) {
        if (_name == null){
            throw new NullPointerException();
        }
        name = _name;
    }

    public String getName() {
        return name;
    }
    public abstract String print_details();
}
