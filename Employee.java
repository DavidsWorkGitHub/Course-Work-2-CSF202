/**
 * Created by David on 25/11/16.
 */

public abstract class Employee {

    private String name;
    private double pay;

    public Employee(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPay() { return pay; }
    public void setPay(double pay) {
        this.pay = pay;
    }

    public double calculateTotalPay() {
        System.out.println(getName() + "Total Pay is " + getPay());
        return pay;
    }

    public void add(Employee e) {
        throw new RuntimeException("Employee Add Error");
    }
    public void remove(Employee e) {
        throw new RuntimeException("Employee Remove Error");
    }

    public void printAllEmployees() { System.out.println(this.getName());  }


}
