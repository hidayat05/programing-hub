package All;

/**
 * Created by hidayat on 12/12/16.
 */
public class ArrayOfArraysAnimalDemo {

    public static void main(String[] args) {
        String[][] animal = {
                {
                        "DanaDog", "WallyDog", "JessiDog", "AlexisDog", "LuckyDog"
                },
                {
                        "BibsCat", "DoodleCat", "MilleCat", "SimonCat"
                },
                {
                        "ElyFish", "CloeiFish", "GoldieFish", "OscarFish", "ZippyFish", "TedFish"
                },
                {
                        "RascalMule", "GeorgeMule", "GraciaMule", "MontyMule", "BuckMule", "RosieMule"
                }
        };

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i][0] + " : ");
            for (int j = 1; j < animal[i].length; j++) {
                System.out.println(animal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
