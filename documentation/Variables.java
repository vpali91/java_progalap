package variables;

import java.text.ParseException;

public class Variables {

public static void main(String[] args) throws ParseException {
//Deklaráció: Amikor úgy hozunk létre változót, hogy nem adunk neki értéket
int a;
//Inicializáció: Amikor értéket adunk a változónak
a = 10;
//Inicializáció történhet a deklarációval együttesen
int b = 20;
int c = a + b;

//Változó elnevezések
String camelCase = "camelCase";
String PascalCase = "Pascal"; 
String snake_case = "snake_case";
//kebab-case nem működik C#-ban
//a változó nem kezdődhet számmal, de rakhatsz számot bele: pl: a1
//a változó nem tartalmazhat szóközt, speciális karaktert, ékezetes se legyen
//a tiszta kód jegyében próbálj mindig beszédes nevet adni nekik, lehetőleg angol nevekkel, hogy bárki ránéz, tudja miről van szó

//Változó típusok
byte mybyte = 1;
int myNum = 5;
float myFloat = 6.02f;
double myDoubleNum = 5.02;
long mylong = 3;
boolean myBool = true;
char myLetter = 'D';
String myText = "Hello";
String text2 = "true";

//Egyszerre több azonos típusú változót is létrehozhatsz inicializációval és anélkül is
int x = 5, y = 6, z;

//Explicit Kasztolás (Casting), egy változó/érték típusának megváltoztatás
int castedFloatToInt = (int)myFloat;
System.out.println(castedFloatToInt); //Nincs kerekítés, csak a tizedes jel mögötti értékek el lettek távolítva


//Típus konverzió methódusok (Type conversion methods)
String intToString = String.valueOf(myNum);
String charToString = Character.toString(myLetter); //Ezt c#-ban nem lehetne így megoldani
double intToDouble = Double.valueOf(myNum);
byte intToByte = (byte)myNum;
boolean StringToBool = Boolean.valueOf(text2);
System.out.println(intToString + "; " + charToString + "; " + intToDouble + "; " + intToByte + "; " + StringToBool);

//Stringgé alakítás másképp
String newString = "" + myNum;
String newString2 = "" + myDoubleNum;
String newString3 = "" + myLetter;
String newString4 = "" + myBool;
String newString5 = "" + myFloat;

System.out.println(newString + "; " + newString2 + "; " + newString3 + "; " + newString4 + "; " + newString5);

//Parse a típus megváltoztatására string esetén
String intInString = "2021";
String doubleInString = "10.02";
int stringToIntParse = Integer.parseInt(intInString);
double stringToDoubleParse = Double.parseDouble(doubleInString);

System.out.println(stringToIntParse +stringToDoubleParse);
}
}
