import java.util.Random;
import java.util.Scanner;

public class J14_1_2 {

    /*Gra w "Za dużo, za mało". Komputer losuje liczbę z przedziału 1 –100.
    Gracz ma za zadanie odgadnąć, co to za liczba po przez podawanie kolejnych wartości.
    Jeżeli podana liczba jest:
    Większa od wylosowanej -wyświetlany jest komunikat "podałeś za dużą liczbę"
    Mniejsza od wylosowanej –wyświetlony jest komunikat "podałeś za małą liczbę"
    Równą wylosowanej –wyświetlony jest komunikat "Gratulacje" i gra zostaje zakończona
    Na odgadnięcie liczby mamy 5 prób, jeżeli nie odgadniemy to gra jest przerywana i otrzymujemy komunikat, że przegraliśmy.
    Jeżeli wygramy lub przegramy to program pyta nas czy chcemy zagrać ponownie T/N, jeżeli wpiszemy literkę T to program
    powinien na nowo wylosować liczbę i gra się powinna rozpocząć od nowa, w przeciwnym przypadku koniec gry.
        */


    public static void main(String[] args) {
        Scanner dane = new Scanner (System.in);

        int los = new Random().nextInt(100)+1;

        System.out.println(los); //podpowiada jaka jest wlasciwa odpowiedz, w celu sprawdzenia i przyspieszenia sprawdzania kodu

        int proba = 1;

        while(proba <= 5){

            proba++;

            System.out.println("Podaj liczbe całkowita od 0 do 100");
            int liczba = dane.nextInt();

            if(liczba > los){
                System.out.println("podałeś za dużą liczbę");}

            else if(liczba<los) {
                System.out.println("podałeś za małą liczbę");
            }
            else {
                System.out.println("Gratulacje");
                break;

            }

            if (proba==6){
                System.out.println("Przegrales, przekroczyles 5 prób");

            }

        }

System.out.println("Czy chcesz zagrać ponownie T/N ?");

        dane.nextLine();
        String taknie = dane.nextLine();

if (taknie.equals("T")){ // jeżeli przed zmienną postawimy ! to mamy przeciwieństwo różne od wartosci

    int los2 = new Random().nextInt(100)+1;
    while(proba <= 5){

        proba++;

        System.out.println("Podaj liczbe całkowita od 0 do 100");
        int liczba = dane.nextInt();

        if(liczba > los2){
            System.out.println("podałeś za dużą liczbę");}

        else if(liczba<los2) {
            System.out.println("podałeś za małą liczbę");
        }
        else {
            System.out.println("Gratulacje");
            break;

        }

        if (proba==6){
            System.out.println("Przegrales, przekroczyles 5 prób");

        }

    }
    }

    else {
    System.out.println("Koniec gry,dziękuję");
    }

}
}


