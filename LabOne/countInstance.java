public class countInstance {
    private static int count;
    public countInstance() {
        count++;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public int returnCount() {
        return count;
    }

    public static void main(String[] args) {
        countInstance ob1 = new countInstance();
        countInstance ob2 = new countInstance();
        countInstance ob3 = new countInstance();
        countInstance ob4 = new countInstance();
        ob1.sayHello();
        ob2.sayHello();
        System.out.println("The total number of instances created is: " + ob1.returnCount() );
    }
}
