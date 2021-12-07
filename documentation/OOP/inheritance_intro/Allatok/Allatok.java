package allatok;

public class Allatok {

    public static void main(String[] args) {
        Kutya bundas = new Kutya(5, 15);
        System.out.println("Kutya előtte, életkor: " + bundas.eletkor + ", testsúly: " + bundas.testsuly + ", életben van: " + bundas.eletbenVanE);
        bundas.Eszik();
        bundas.Oregszik();
        System.out.println(bundas.Ugat());
        System.out.println("Kutya utána, életkor: " + bundas.eletkor + ", testsúly: " + bundas.testsuly + ", életben van: " + bundas.eletbenVanE);

        Macska cirmi = new Macska(2, 7);
        System.out.println("Macska előtte, életkor: " + cirmi.eletkor + ", testsúly: " + cirmi.testsuly + ", életben van: " + cirmi.eletbenVanE);
        cirmi.Eszik();
        cirmi.Oregszik();
        System.out.println(cirmi.Karmol());
        cirmi.kill();
        System.out.println("Macska utána, életkor: " + cirmi.eletkor + ", testsúly: " + cirmi.testsuly + ", életben van: " + cirmi.eletbenVanE);
    }
}
