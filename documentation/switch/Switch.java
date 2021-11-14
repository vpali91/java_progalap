package pkgswitch;

public class Switch {

    public static void main(String[] args) {
//switch(paraméter){case "eset": parancs; break; case "eset2": parancs; break;
        //break megtöri a switch futását ott ahol teljesül a feltételünk és tovább fut a switchet követő parancs
        //példa számokkal
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //Ugyanezt megtehetjük bármilyen paraméterrel
        //Default értéket adhatunk meg, ha a switch egyik feltételének sem felel meg az inputértékünk
        String job = "software developer";
        int salary = 0;
        switch (job) {
            case "software developer":
                salary = 2000;
                System.out.println("Your salary as software developer:" + salary + "$");
                break;
            case "janitor":
                salary = 800;
                System.out.println("Your salary as janitor:" + salary + "$");
                break;
            case "secretary":
                salary = 1000;
                System.out.println("Your salary as secretary: " + salary + "$");
                break;
            default:
                System.out.println(job + " profession not found!");
                break;
        }
    }
}
