public class hello {

    public void display() {
        System.out.println("Hello World!");
    }

    public void displayAuthor() {
        System.out.println("Program Ending...\n\tAuthor: itsmeankeet");
    }

    public static void main(String[] args) {
        hello ob = new hello();
        ob.display();
        ob.displayAuthor();
        return;
    }
};