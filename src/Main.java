import java.util.Scanner;

public class Main {

    static void desen(int sayi, int baslangic) {
        System.out.print(sayi + " ");


        if (sayi <= 0) {
            return;
        }

        desen(sayi - 5, baslangic);


        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();

        desen(n, n);
    }
}
