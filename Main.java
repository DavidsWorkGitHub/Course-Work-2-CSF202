/**
 * Created by David on 25/11/16.
 */

public class Main {

    public static void main(String[] args) {


        Manager CEO = new Manager("Zeus ", 1000000);

        Manager ArtistManager = new Manager("Poseidon ", 500000);
        Manager CodeManager = new Manager("Hades ", 500000);
        Manager WebTester = new Manager("Hestia ", 500000);
        CEO.add(ArtistManager);
        CEO.add(CodeManager);
        CEO.add(WebTester);

        /**
         * This is to test my levels code
         */
//        Manager testMan = new Manager("Test Manager", 20);
//        CodeManager.add(testMan);

//        System.out.println("TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST ");
//        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
//        System.out.println("CEO Levels: "+ CEO.countLevels(CEO));
//        System.out.println("Artist Manager Levels: "+ ArtistManager.countLevels(ArtistManager));
//        System.out.println("Code Manager Levels: "+ CodeManager.countLevels(CodeManager));
//        System.out.println("Test Manager Levels: "+ testMan.countLevels(testMan));
//        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
//        System.out.println("TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST ");
//        System.out.println("------------------------------------------------------------");
//
//        System.out.println(" ");

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
        Employee Staff7 = new WebCoder("Apollo ", 20000);
        Employee Staff8 = new WebCoder("Hephaestus ", 20000);

        WebTester.add(Staff7);
        WebTester.add(Staff8);

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

        System.out.println("__________________");
        System.out.println("Web Tester's ");
        System.out.println("- - - - - - - - - ");

        WebTester.printAllEmployees();

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Name of the CEO is : " + CEO.getName() + "and the Total pay for all is : " + CEO.calculateTotalPay());
        System.out.println("Name of the Art Manager is : " + ArtistManager.getName() + "and the total pay for the Art Department is : " + ArtistManager.calculateTotalPay());
        System.out.println("Name of the Code Manager is : " + CodeManager.getName() + "and the total pay for the Code Department is : " + CodeManager.calculateTotalPay());
        System.out.println("Name of the Web Manager is : " + WebTester.getName() + "and the total pay for the Testing Department is : " + WebTester.calculateTotalPay());
        System.out.println("-------------------------------------------------------------------------------------------------");





    }

}
