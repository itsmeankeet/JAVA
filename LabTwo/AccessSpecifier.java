import java.util.Scanner;

public class AccessSpecifier {
    private int employeeId;//private data member that stores the employee id
    private String employeeName;//private data member that stores the employee name
    private String employeeAddress;//private data member that stores the employee address

    public void setEmployeeId(int employeeId) { // used public access specifier to set employee id
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {// used public access specifier to set employee name
        this.employeeName = employeeName;
    }

    public void setEmployeeAddress(String employeeAddress) {// used public access specifier to set employee address
        this.employeeAddress = employeeAddress;
    }

    public int returnsEmployeeId() {// used public access specifier to return the private data member employee id
        return this.employeeId;
    }

    public String returnsEmployeeName() {// used public access specifier to return the private data member employee name
        return this.employeeName;
    }

    public String returnsEmployeeAddress() {// used public access specifier to return the private data member employee address
        return this.employeeAddress;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter the employee address:");
        String address = scanner.nextLine();
        System.out.println("Enter the employee id:");
        int employeeId = scanner.nextInt();
        scanner.close();
        AccessSpecifier accessSpecifier = new AccessSpecifier();
        accessSpecifier.setEmployeeAddress(address);//set the address of employee
        accessSpecifier.setEmployeeId(employeeId);//set the employeeid of employee 
        accessSpecifier.setEmployeeName(name);//set the name of employee
        System.out.println("Hello "+accessSpecifier.returnsEmployeeName());//display name of employee
        System.out.println("Your address is: "+accessSpecifier.returnsEmployeeAddress());//display address of employee
        System.out.println("Your employee id is:" + accessSpecifier.returnsEmployeeId());//display employee id of employee
        return;
    }
}