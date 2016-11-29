import java.util.ArrayList;


public class Manager extends Employee {
    Manager parent = null;

    double totalPay = 0.0;
    private ArrayList<Employee> subOrdinates;

    public Manager(String name, double pay) {

        super(name, pay);
        subOrdinates = new ArrayList<>();

    }

    public void add(Employee e) {
        if (e instanceof Manager) {
            if (this.countLevels(this) > 3) {                   //I change this for testing the levels count to >=1
                throw new RuntimeException("!!! Exceeded Manager Levels !!! ");
            } else {
                ((Manager) e).parent = this;
            }
        }
        subOrdinates.add(e);
    }

    public void remove(Employee e) {

        subOrdinates.remove(e);
    }

    public void printAllEmployees() {

        System.out.println("Manager " + this.getName());
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

    public int countLevels(Manager me) {
        if (me.parent != null) {
            return countLevels(me.parent) + 1;
        }
        return 1;

    }


}

