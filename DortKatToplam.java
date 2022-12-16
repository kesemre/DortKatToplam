import java.util.Scanner;
public class DortKatToplam {
    public static void main(String[] args) {
        int number, totalnumber=0;
        Scanner input = new Scanner(System.in);

         do {System.out.print("Lütfen bir sayı giriniz");
             number = input.nextInt();
             if(number%2==1) break;
             else if (number%4==0) {
                 totalnumber+=number;
                 System.out.println("Girdiğniz Sayıların dört'ün katı olan sayıların toplamı: " + totalnumber);
             }
         }while (true);
        System.out.println("Girdiğniz Sayıların dört'ün katı olan sayıların toplamı: " + totalnumber);

    }
}