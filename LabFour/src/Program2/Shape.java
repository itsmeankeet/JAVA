package Program2;
abstract class Shape {
    protected String name;
    protected String colour;
    public Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    public abstract double calculateArea();
}