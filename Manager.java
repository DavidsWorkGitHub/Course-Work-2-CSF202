import java.util.ArrayList;

public class Manager extends Employee {

    double totalPay = 0.0;
    private ArrayList<Employee> subOrdinates;

    public Manager(String name, double pay) {

        super(name, pay);
        subOrdinates = new ArrayList<Employee>();

    }

    public void add(Employee e) {

        subOrdinates.add(e);

    }

    public void remove(Employee e) {

        subOrdinates.remove(e);
    }

    public void printAllEmployees() {

        System.out.println("Manager "+ this.getName());
        for (Employee e : subOrdinates) {
            e.printAllEmployees();
        }
    }

    public double calculateTotalPay() {
        totalPay = 0;
        totalPay += this.getPay();

        for (Employee e : subOrdinates) {
            totalPay = totalPay + e.calculateTotalPay();
        }
        return totalPay;
    }


}