package Program3;

class Rectangle extends Shape implements Resizable {
    private int length;
    private int breadth;
    public Rectangle(String name, String colour, int length, int breadth) {
        super(name, colour);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return((double)(this.length * this.breadth));
    }
    //program 2 ko resize garney length llai
    public void resize(double factor) {
        this.length *= factor;
        this.breadth *= factor;
    }
}