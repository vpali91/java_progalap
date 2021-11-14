package ifelse;

public class IfElse {

    public static void main(String[] args) {
            //if(feltétel){} törzsén belüli utasítás csak akkor fut le, ha igaz a kondíció
            //else akkor fut le, ha a feltételünknél hamis kondíció valósul meg "minden más esetben"
            int age = 20;
            if (age>=18) 
            {
                System.out.println("Felnőtt");
            }
            else
            {
                System.out.println("Fiatalkorú");
            }

            // Ternális operátor: (feltétel) ? parancs Igaz esetén : parancs Hamis esetén;
            System.out.println((age >= 18) ? "Felnőtt" : "Fiatalkorú");

            //else if(feltétel) törzsén belüli parancs csak akkor fut le, ha az előző feltételünk nem volt igaz és else if kondíciója igaz
            // Ha az if, else if, else törzsén belül csak egy sor parancs van, akkor elhagyhatjuk a {} zárójeleket
            int number = 15;
            if (number % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
            else if (number % 3 == 0)
                System.out.println("Fizz");
            else if (number % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println("Not Fizz or Buzz or FizzBuzz");
    }
    
}
