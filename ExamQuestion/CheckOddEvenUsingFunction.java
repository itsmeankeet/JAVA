class Check {
    private int[] numbers;
    private int[] evennumbers;
    private int[] oddnumbers;
    private int evenCount = -1;
    private int oddCount = -1;
    private int size;

    Check(int[] numbers, int size) {
        this.size = size;
        this.numbers = new int[size];
        this.evennumbers = new int[size];
        this.oddnumbers = new int[size];
        for (int i = 0; i < size; i++) {
            this.numbers[i] = numbers[i];
        }
    }

    public void checkOddOrEven() {
        for (int i = 0; i < size; i++) {
            if (this.numbers[i] % 2 == 0) {
                evenCount++;
                evennumbers[evenCount] = numbers[i];
            } else {
                oddCount++;
                oddnumbers[oddCount] = numbers[i];
            }
        }
    }

    public void displayNumbers() {
        for (int i = 0; i < size; i++) {
            System.out.println("The number is: " + numbers[i]);
        }
    }

    public void displayEvenNumbers() {
        for (int i = 0; i <= evenCount; i++) {
            System.out.println("Even number is: " + evennumbers[i]);
        }
    }

    public void displayOddNumbers() {
        for (int i = 0; i <= oddCount; i++) {
            System.out.println("Odd number is: " + oddnumbers[i]);
        }
    }
}

public class CheckOddEvenUsingFunction {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Check ob = new Check(a, 10);
        ob.checkOddOrEven();
        ob.displayEvenNumbers();
        ob.displayOddNumbers();
    }
}
