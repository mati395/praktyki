package cwiczenie1;

public class liczby {

    public static void main(String[] args){
        System.out.println("Petla for");

        int i=0;

        for(i=0; i<10; i++){
            System.out.println("Liczba "+ i +" jest "+(i%2==0?"parzyste":"nieparzysta"));
        }
        System.out.println("Petla while");

        i=0;

        while((i++)<10){
            System.out.println("Liczba "+ i +" jest "+(i%2==0?"parzyste":"nieparzysta"));
        }
        System.out.println("Petla do while");

        i=1;

        do{

            System.out.println("Liczba "+ i +" jest "+(i%2==0?"parzyste":"nieparzysta"));

        }while((i++)<10);
    }
}
