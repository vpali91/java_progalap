package arrays;

public class Arrays {

    public static void main(String[] args) {
        //Tömbökben(Arrays) szintem bármilyen változót tudunk tárolni
        //Tömböknél létrehozáskor mindig vagy meg kell adnunk az elemeit, vagy azt hogy hány elemből fog állni. Ez nem is változtatható amíg a memóriában él.

        //üres tömb létrehozása(declaration), ilyenkor meg kell adnunk hány elemből álljon:
        int[] uresTomb = new int[5];

        //Tömb létrehozása értékekkel(minden értéket meg kell adni, vagy a helyére alapértelmezett null értékeket adni)
        int[] tomb1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        //tömböt így is létrehozhatunk:
        int[] tomb2 = new int[]{3, 4, 7, 2, 9, 10};

        String[] weekDays = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        //tomb kiíratása
        System.out.println(weekDays[0] + ", " + weekDays[1] + ", stb...");
        for (String item : weekDays) {
            System.out.println("Foreach:" + item);
        }

        //Tömb methódusok
        //tomb.length: Megmondja hány tagú a tömb
        System.out.println("tomb1.Length:" + tomb1.length);

        //equals, összehasonlítása 2 tombnek. True/False értékkel tér vissza
        System.out.println("tomb1.Equals(tomb2): " + tomb1.equals(tomb2));

        //2D tömbök: Olyan tömb, ami 2 tagú tömböket tartalmaz
        int[][] tomb2D = new int[][]{{1, 3}, {5, 7}, {8, 9}};
        int[][] btomb2D = new int[][]{{1, 3}, {5, 7}, {8, 9}};
        //Kiíratás:
        System.out.println(tomb2D[1][0]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(tomb2D[i][j] + ", ");
            }
            System.out.println("");
        }

        //3D tömbök
        int[][][] tomb3D = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        int[][][] btomb3D = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        //Kiíratás:
        System.out.println(tomb3D[1][0][0]);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(tomb3D[i][j][k] + ", ");
                }
                System.out.println();
            }
        }

        //Jagged array (egyenetlen tömb), Olyan tömb, ami tömböket tartalmaz és a tartalmazott tömbök nem feltétlen egyforma hosszúságúak
        //Első körben meg kell adni hány tömböt tartalmaz a tömb
        int[][] jaggedArray = new int[3][];
        //Második körben meg kell adni, hány tagot tartalmaznak a belső tömbök
        jaggedArray[0] = new int[5];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[2];
        //Mehet az értékadás:
        jaggedArray[0] = new int[]{1, 3, 5, 7, 9};
        jaggedArray[1] = new int[]{0, 2, 4, 6};
        jaggedArray[2] = new int[]{11, 22};

        //Kiíratás
        System.out.println("Jagged:" + jaggedArray[1][2]);
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + ", ");
            }
            System.out.println();
        }

    }

}
