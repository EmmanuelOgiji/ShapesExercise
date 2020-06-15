public class ShapeClass {
    protected String name;

    public ShapeClass(String _name) {
        if (_name == null){
            throw new NullPointerException();
        }
        name = _name;
    }

    public String getName() {
        return name;
    }

    public String print_details(){
        return null;
    }
}
