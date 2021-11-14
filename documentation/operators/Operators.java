package operators;

public class Operators {

    public static void main(String[] args) {
            //Matematikai alapműveletek: +, -, *, / ezeket nem fejteném ki
            //Maradékos osztás, pl: 5%2 = 1 ilyenkor azt vizsgáljuk hogy 5 szám 2-vel elosztva mennyi maradékot ad.
            int a = 5%2;
            System.out.println("5%2=" + a);
            //Incrementation ++ ilyenkor 1-el növeljük a változó értékét. Fontos, hogy nem azonnal növeli 1-el, hanem a végrehajtás után!
            int b = 3;
            // java-ban nincs string interpolatio, mint amit C# kiíratásnál használtunk, helyette String.format-al érhetünk el hasonló eredményt kiíratásnál
            System.out.println(String.format("b++ pillanatában: %s",b++));
            System.out.println(String.format("b értéke b++ után %s",b));

            //Decrementation -- Ilyenkor 1-el csökkentjük a változó értékét. Fontos, hogy nem azonnal csökkenti 1-el, hanem a végrehajtás után!
            System.out.println(String.format("b-- pillanatában: %s",b--));
            System.out.println(String.format("b értéke b++ után %s",b));

            //Assignment operators(értékadó operátorok): ezekkel a változónknak valamilyen értéket adunk. Pl: =, +=, -=, *=, /=, %=
            //b-nek új értéket adunk:
            b = 10;
            //b-hez hozzáadódik 5, másképp b=b+6
            b += 5;
            //b-ből kivonjuk 4-et, másképp b=b-4
            b -= 4;
            //b-vel szorozzuk 3-at, másképp b=b*3
            b *= 3;
            //2-vel osszuk b-t, másképp b=b/2
            b /= 2;
            //b-t felülírjuk a 3-al osztás maradékának eredményével, másképp b=b%3
            b %= 3;

            int x = 3;
            int y = 5;
            int z = 3;
            //Comparison operators/összehasonlító operátorok:Egyenlő: ==, Nem egyenlő: !=, >, <, >=, <= , ezek mindig logikai(bool) értékkel térnek vissza: true/false
            System.out.println(" x==y:" + (x==y) +",\n x==z: " + (x==z) + ",\n x!=y:" + (x!=y) +",\n x<y: " + (x<y) + ",\n stb...");

            // Logical operators/Logikai operátorok:
            // &&: és, ilyenkor mindkét feltétel együttesen teljesül akkor lesz true,
            System.out.println("x=3 esetén, x>2 && x<5:" + (x > 2 && x < 5));
            // ||: vagy, ilyenkor egy feltételnek kell teljesülnie, akkor lesz true
            System.out.println("x=3 esetén, x>2 || x>5:" + (x > 2 || x > 5));
            // !: megfordítjai a logikai értékünk, pl !(false) -> true
            System.out.println("!true:" + (!true));
    }
    
}
