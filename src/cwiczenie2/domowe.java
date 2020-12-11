package cwiczenie2;

public class domowe {
    public static void main(String[] args){
        int[] tab = new int [10];
        System.out.println("tablica sklada sie z:");
        for (int i = 0; 1 < tab.length; i++){
            tab[i] = (int) (Math.random() * 100);
            System.out.println(i != tab.length -1 ? tab [i] + "," : tab[i]);
        }
        int m = 0;

        for (int j : tab) {
            m = m + j;
        }
        System.out.println(" suma liczb wynosi: " + m);
    }
}
