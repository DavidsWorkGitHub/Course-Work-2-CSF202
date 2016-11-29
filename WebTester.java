/**
 * Created by nnknow on 29/11/16.
 */
public class WebTester extends Employee {

    WebTester(String name, double pay) {
        super(name, pay);
    }

    public double calculateTotalPay() {
        return this.getPay();
    }
}