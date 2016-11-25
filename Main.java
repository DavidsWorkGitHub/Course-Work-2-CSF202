/**
 * Created by David on 25/11/16.
 */

public class Main {

    public static void main(String[] args) {

        Manager CEO = new Manager("Zeus ", 1000000);

        Manager ArtistManager = new Manager("Poseidon ", 500000);
        Manager CodeManager = new Manager("Hades ", 500000);

        CEO.add(ArtistManager);
        CEO.add(CodeManager);

///////////////////////////////////////////////////////////////////////////////////////////
        GraphicsArtist Staff1 = new GraphicsArtist("Athena ", 20000);
        GraphicsArtist Staff2 = new GraphicsArtist("Hermes ", 20000);
        GraphicsArtist Staff3 = new GraphicsArtist("Ares ", 20000);

        ArtistManager.add(Staff1);
        ArtistManager.add(Staff2);
        ArtistManager.add(Staff3);
/////////////////////////////////////////////////////////////////////////////////////
        Employee Staff4 = new WebCoder("Aphrodite ", 20000);
        Employee Staff5 = new WebCoder("Hera ", 20000);
        Employee Staff6 = new WebCoder("Artemis ", 20000);

        CodeManager.add(Staff4);
        CodeManager.add(Staff5);
        CodeManager.add(Staff6);

///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Managers and Staff ");
        System.out.println("- - - - - - - - - ");

        CEO.printAllEmployees();

        System.out.println("__________________");
        System.out.println("Graphics Artist's ");
        System.out.println("- - - - - - - - - ");

        ArtistManager.printAllEmployees();

        System.out.println("__________________");
        System.out.println("Web Coder's ");
        System.out.println("- - - - - - - - - ");

        CodeManager.printAllEmployees();

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Name of the CEO is : " + CEO.getName() + "and the Total pay for all is : " + CEO.calculateTotalPay());
        System.out.println("Name of the Art Manager is : " + ArtistManager.getName() + "and the total pay for the Art Department is : " + ArtistManager.calculateTotalPay());
        System.out.println("Name of the Code Manager is : " + CodeManager.getName() + "and the total pay for the Code Department is : " + CodeManager.calculateTotalPay());
        System.out.println("-------------------------------------------------------------------------------------------------");





    }

}
