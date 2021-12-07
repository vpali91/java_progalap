package gettersetter;

public class GetterSetter {

    public static void main(String[] args) {
        Animal allat = new Animal(5, "Medvedisznóember", true);
        allat.SetAge(4);
        System.out.println(allat.GetAge());
        System.out.println(allat.GetAlive());
        allat.SetAlive(false);
        System.out.println(allat.GetAlive());
    }
}
