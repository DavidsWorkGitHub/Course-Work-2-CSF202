/**
 * Created by David on 25/11/16.
 */

public class GraphicsArtist extends Employee {

    GraphicsArtist(String name, double pay) {
        super(name, pay);
    }

    public double calculateTotalPay() {
        return this.getPay();
    }

}
