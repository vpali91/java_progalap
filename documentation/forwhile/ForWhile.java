package forwhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cimletek{
 public int cimlet;
        public int db;

        public Cimletek(int cimlet, int db)
        {
            this.cimlet = cimlet;
            this.db = db;
        }    
}

public class ForWhile {
    // javaban nincs isNumeric parancs, így magunknak kell megírni a metódust,
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    public static void main(String[] args) {
        //Iteration statement / iteráció
        //egyszerűen gyorsan for+tab paranccsal tudsz for ciklust generálni
        // i-nek mindig kell kezdőértéket adni, nem kötelező 0 értéket adni neki, szituációfüggő
        //Feltételnek mindig kell lennie a for ciklusban, ennek pedig olyan feltételnek kell lennie, ami valamikor teljesül, különben végtelen ciklus lesz
        //i++/i-- elem is kell bele különben végtelen ciklus marad és jól meg kell választani, hogy növeljük/csökkentjük különben végtelen ciklus lesz

        //esetünkben for ciklusunk 0-ról indul. Minden körben: lefut a kiíratásunk és i értéke 1-el növekszik. Amikor i értéke 4 eléri a 4-et, akkor leáll a for ciklus és folytatódik a programunk a for ciklust követő utasításokkal.
        for (int i = 0; i < 5; i++) {
            System.out.println("Ciklus:"+i +". kör, még ebben a körben i++.");
        }

        //Példa: Hány inputot akarsz bekérni?
        System.out.println("Hány String inputot akarsz bekérni?");
        List<String> sztringek = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int input = myObj.nextInt();
        System.out.println("asd");

        for (int i = 0; i < input; i++) {
            System.out.println((i + 1)+". Add meg a lista" +i+"-edik elemét!");
            Scanner myObj2 = new Scanner(System.in);
            String inputString = myObj2.nextLine();
            sztringek.add(inputString);
        }
        for (int i = 0; i < sztringek.size(); i++) {
            System.out.println((i + 1)+". A lista " + i + "-edik eleme:" + sztringek.get(i));
        }

        //fordított for ciklus
        for (int i = 5; i >= 0; i--) {
            System.out.println("Visszaszámlálás:"+ i);
        }

        //foreach nincs java-ban, de van megfelelője, amivel ugyanazt meg tudjuk oldani, főleg listakiíratáshoz használható, vagy egyszerűbb for ciklussal kiíratható dolgokra is
        // for(var item : lista)  a lista i-edik eleme(itt 0-ról indul mindig, tehát ha 1-ről akarunk indulni, akkor normál for ciklus kell)
        for(var item : sztringek)
            {
                System.out.println("'Foreach'-szerűen: "+item);
        }

        //listába betöltés 'Foreach'-szerűen:
        List<String> szavak = new ArrayList<>();
        int a = 1;
        for(var item : sztringek)
            {
                szavak.add(a + ". " + item);
            a++;
        }
        for(var item : szavak){
                System.out.println(item);
        }

        //Egymásba ágyazott for ciklus
        int[] cimletek = {5, 10, 20, 50};
        int[] kassza = {5, 5, 5, 10, 20, 20, 20, 50, 50, 5, 5, 5, 10, 20, 20, 20, 50, 50};
        List<Cimletek> penzSum = new ArrayList<Cimletek>();
        int db = 0;
        // a külső for ciklus a címleteketen meg végig
        for (int i = 0; i < cimletek.length; i++) {
            //A belső minden egyes címletnél végigfut a teljes kassszán
            //beágyazott for ciklusban, nem lehet i változó ugyanúgy elnevezve, mint a külsőben, ezért j
            for (int j = 0; j < kassza.length; j++) {
                if (cimletek[i] == kassza[j]) {
                    db++; //itt minden egyezésnél növekszik db 1-el
                }
            }
            //objektum létrehozás, erről az osztályoknál szó lesz, annyi a lényeg, hogy itt mindig összeillesszük az aktuláis címletet a hozzá tartozó darabszámmal
            Cimletek szamolas = new Cimletek(cimletek[i], db);
            //Ezt hozzáadjuk egy listához
            penzSum.add(szamolas);
            db = 0; //db-ot kinullázzuk, hogy a következő címlet is meg legyen számolva
        }
        //Ellenőrzésül írassuk ki
        for(var item : penzSum)
            {
                System.out.println("Címlet:"+ item.cimlet +" Ft darabszám: "+ item.db);
        }

        //while(feltétel), Addig lefut, amíg Igaz a feltételünk, amint hamis lesz leáll. Azért használunk k-t, mert már i létezik a for ciklusok miatt
        int k = 0;
        while (k < 5) {
            System.out.println("While "+ k+". ciklus");
            k++; //ha nem növelnék k értékét végtelen ciklust kapnánk
        }

        //while bool értékkel is működhet, amíg igaz addig fut, amint átállítjuk false-ra leáll
        //Fontos!!! Ha false az értékünk, while el sem indul
        boolean repeat = true;
        int number;
        while (repeat) {
            System.out.println("Adj meg egy számot");
            String input_num = myObj.nextLine();
            // javaban nincs isNumeric parancs, így magunknak kell megírni a metódust, ami a 20. sorban található
            if (isNumeric(input_num)){
                    System.out.println("Ügyes vagy!" + input_num +" valóban szám, jár a keksz!");
                repeat = false;
            }
        }

        //do while, ez kiküszöböli azt a problémát, hogy false esetén while el sem indul. Do-nál legalább 1x minden esetben lefut
        int n = 0;
        do {
            System.out.println("Do-while, n("+n+")<5?");
            n++;
        } while (n < 5);

        //Bár while erőforrásbarátabb, mivel olyan kereséseket tudunk csinálni ahol, az első találat után már nem fut végig
        //ugyanezt for ciklussal is meg tudjuk csinálni a break; használatával. Ez megszakítja a for ciklust az első találat után
        //keresés while-al
        int[] kassza2 = {5, 5, 5, 10, 20, 20, 20, 50, 50, 5, 5, 5, 10, 20, 20, 20, 50, 50};
        int keresett = 10;
        boolean talalt = false;
        int m = 0;
        while (!talalt) {
            if (kassza2[m] == keresett) {
                System.out.println("While, Van találat első index: " + m);
                talalt = true;
                m++;
            } else {
                System.out.println("While keresés " +m+". kör");
                m++;
            }
        }

        //Ugyanez for ciklussal, hogy szintén leálljon (mert egyébként végig menne kassza2 összes elemény)
        for (int i = 0; i < kassza2.length; i++) {
            if (kassza2[i] == keresett) {
                System.out.println("For-break, van találat első index: "+m);
                break;
            } else {
                System.out.println("For break keresés "+m+". kör");
            }
        }
    }
}

