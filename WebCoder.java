/**
 * Created by David on 25/11/16.
 */

public class WebCoder extends Employee {

    WebCoder(String name, double pay) {
        super(name, pay);
    }

    public double calculateTotalPay() {
        return this.getPay();
    }
}

	