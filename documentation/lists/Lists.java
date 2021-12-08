package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.reverse;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        //ArrayList olyan lista, amihez mindenféle típusú elemet hozzáadhatunk, akár egyazon array listbe és a méretet se kell megadnunk
        //Teljesítményproblémák miatt inkább a List<object> megoldás javasolt többféle típusú változó tárolására
        //Azonos típusú változók dinamikus tárolására inkább a List javasolt
        ArrayList arlist = new ArrayList();
        var arlist2 = new ArrayList(); //inkább ez a javasolt forma

        //Így adunk elemeket hozzá
        arlist.add(1);
        arlist.add("Bill");
        arlist.add(" ");
        arlist.add(true);
        arlist.add(1.6);

        //ArrayList-et hozzáadhatunk, tömböt
        int[] tomb = {100, 200, 300, 400, 500};
        arlist2.addAll(arlist);
        arlist2.add(tomb);

        //kiíratás
        System.out.println(arlist2.get(5));
        for (var item : arlist2) {
            System.out.print(item + "; ");
        }
        System.out.println();

        //ArrayList methods
        //remove() Egy elemet távolít el
        //RemoveRange itt nincs, for ciklussal lehetne megoldani
        arlist2.remove(" ");
        for (var item : arlist2) {
            System.out.print(item + "; ");
        }
        System.out.println();

        //Reverse() Megfordítja az elemes sorrendjét
        reverse(arlist2);
        System.out.println("Reverse:");
        for (var item : arlist2) {
            System.out.print(item + "; ");
        }
        System.out.println();

        //clear() törli a tartalmát
        arlist2.clear();
        for (var item : arlist2) {
            System.out.print(item + "| ");
        }
        System.out.println();

        //List<> lista
        //Létrehozása és feltöltése adatokkal
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(30);
        numbers.add(10);
        numbers.add(5);

        List<Integer> numbers2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers2.add(i);
        }

        List cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("London");
        cities.add("Mumbai");
        cities.add("Chicago");
        cities.add(null);// ez is megengedett listánál

        //Hogyan töltsünk be többféle változó típust a listába? Objektumokkal!
        List<NPC> npc_list = new ArrayList<>();
        NPC npc_generator = new NPC("Belethor", "breton", 100, false);
        npc_list.add(npc_generator);
        npc_generator = new NPC("Sheogorath", "daedric", 100, true);
        npc_list.add(npc_generator);
        npc_generator = new NPC("M'aiq the Liar", "khajiit", 100, true);
        npc_list.add(npc_generator);

        //kiíratás
        for (var item : npc_list) {
            System.out.println(item.name + " " + item.race + " " + item.hp + " " + item.immortal);
        }

        //Tömb hozzáadása listához
        String[] tomb2 = {"Mumbai", "London", "New York"};
        List<String> lista = new ArrayList<String>();
        for (var item : tomb2) {
            lista.add(item);
        }
        //ellenőrzés, hogy sikerült-e
        for (var item : lista) {
            System.out.println(item);
        }

        //size(), ugyanazt csinálja, mint a tömböknél a length, megszámolja az elemeket
        //Az objektumot is 1-nek számolja, hiába van tele változókkal
        System.out.println("Lista elemeinek száma: " + npc_list.size());

        //contains(keresett érték) --> logikai értékkel tér vissza, hogy tartalmazza-e a lista
        System.out.println((cities.contains("London")) ? "Van találat Londonra" : "Nincs találat Londonra");

        //Collections.sort(lista) Sorbarendezi a lista elemeit, minimum maximumkereséskor praktikus lehet, ha számokról van szó, vagy ha abc sorrendbe akarjuk rakni a szavakat
        Collections.sort(numbers);
        System.out.println("Min: " + numbers.get(0) + ", Max: " + numbers.get(numbers.size() - 1));

        //Listákat tudunk akár tömbben, vagy egy másik listában is tárolni
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        List<String> lista3 = new ArrayList<String>();

        List<List<String>> listalista = new ArrayList<List<String>>();
        listalista.add(lista1);
        listalista.add(lista2);
        listalista.add(lista3);
    }
}
