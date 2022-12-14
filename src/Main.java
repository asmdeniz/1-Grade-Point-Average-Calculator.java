import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,ingilizce,tarih,müzik;
        Scanner input = new Scanner(System.in);

        System.out.println("***Grade Point Average Calculator***");
        System.out.print("matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("fizik notunuz : ");
        fizik  = input.nextInt();
        System.out.print("kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("ingilizce notunuz : ");
        ingilizce = input.nextInt();
        System.out.print("tarih notunuz : ");
        tarih = input.nextInt();
        System.out.print("müzik notunuz: ");
        müzik = input.nextInt();

        int toplam = mat+fizik+kimya+ingilizce+tarih+müzik;
        double sonuç = toplam/6.0;

        System.out.println("ortalamanız : " + sonuç);

        // Comparison without if else blocks
        String str = (sonuç>=60)? "You Passed" : "You Failed";
        System.out.print("Your Situation : " + str);
    }
}
