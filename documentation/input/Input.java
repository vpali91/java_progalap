package input;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        System.out.println("Enter username:");
        //A nextLine a teljes beírt inputot hozza a console-ból
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // Inputbekérés
        String userName = myObj.nextLine();
        System.out.println("Hello " + userName +"!"); //nincs string interpolation

        System.out.println("Are you sure? Enter 'y' or 'n':");
        String inputYesOrNo = myObj.nextLine();

        System.out.println("Enter a number:");
        //int numberinput = myObj.nextInt(); //hibalehetőség, lehetőleg maradjunk annál, hogy először string, aztán alakítjuk át, vagy ellenőrizzük az átalakíthatóságot
        int numberinput = myObj.nextInt();
        System.out.println(numberinput +3);
        // A fordított per jel (\) escape karakter, amivel stringen belül spec karaktereket, sortöréseket és egyéb dolgokat írathatunk ki, amit egyébként nem tehetnénk meg
        System.out.println("Sortörés \n Új sor \n Következő sor.");
        System.out.println("Escape karakterrel például  \"\" -et is kiírathatunk");

        System.out.println("Write a text to calculate length: ");
        String text = myObj.nextLine();
        System.out.println("Your text length is:" + text.length());
    }
    
}
