package Program3;

class Circle extends Shape {
    private double radius;

    public Circle(String name, String colour, double radius ) {
        super(name, colour);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return(3.14 * this.radius * this.radius);
    }
}
