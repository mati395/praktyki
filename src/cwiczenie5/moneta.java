package cwiczenie5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class moneta {
    public static void main(String[] args) {
        Random random = new Random();
        // tworzenie zmiennej typu random
        String[] options = {"Orzel", "Reszka"};
        // dodaje dwie zmienne opcje - orzel i reszka
        for (int i = 0; i < 1; i++ ) {
            // tworze petle ktora powinna wykonac sie tylko raz
            int wynik = random.nextInt(options.length);
            //tworze zmienna wynik ktora losuje jedna z moich opcji
            System.out.println(options[wynik]);
            // system wyrzuca wynik

        }
    }
}