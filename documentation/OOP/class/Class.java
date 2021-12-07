package pkgclass;

public class Class {

    public static void main(String[] args) {
            // objektum példányosítás
            NPC belethor = new NPC("Belethor", "breton", 100, false);
            //objektumhoz tartozó methódus meghívása
            belethor.Speak();
            NPC sheogorath = new NPC("Sheogorath", "daedric", 100, true);
            NPC maiq = new NPC("M'aiq the Liar", "khajiit", 100, true);
    }
    
}
