import java.util.Scanner;

public class DesenMetot {
    static int sayi;
    static String cikti2 = "";

    static int sartan(int n) {
        int cikti = n + 5;
        if (n == sayi) {
            System.out.println(cikti2);
            return 0;
        } else {
            cikti2 += "," + cikti;
            sartan(cikti);
        }

        return cikti;
    }

    static int sazalan(int n) {
        int cikti = n - 5;
        if (cikti <= 0) {
            cikti2 += "," + cikti;
            sartan(cikti);
        } else {
            cikti2 += "," + cikti;
            sazalan(cikti);
        }
        return 1;
    }

    public static <sayi> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();
        cikti2 += sayi;
        sazalan(sayi);
    }
}
