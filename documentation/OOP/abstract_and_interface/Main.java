public class Main {
    public static void main(String[] args) {
        Kutya bundas = new Kutya(5, 15,"Bundás");
        System.out.println(bundas.toString());
        bundas.Eszik();
        bundas.Oregszik();
        System.out.println(bundas.Ugat());
        System.out.println(bundas.toString());

        Macska cirmi = new Macska(2, 7);
        System.out.println(cirmi.toString());
        cirmi.Eszik();
        cirmi.Oregszik();
        System.out.println(cirmi.Karmol());
        cirmi.kill();
        System.out.println(cirmi.toString());

        //Emlos emlos = new Emlos(2,4);
        //System.out.println(emlos.toString());
    }
}
