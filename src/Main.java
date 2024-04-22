import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç ürün almak istiyorsunuz ?");
        int numberOfProduct = scanner.nextInt();
        double total = 0;
        System.out.println("Seçtiğiniz ürünlerin fiyatlarını giriniz : ");
        for (int i = 0 ; i < numberOfProduct ; i++){
            double price = scanner.nextDouble();
            System.out.println("ürün" + (i+1) + " = " + price +" TL" );
            total += price;
        }
        System.out.println("Seçilen ürünlerin toplam tutarı : " + total);



        // While döngüsü, koşul doğru olduğu sürece çalışır.
        // Do-While döngüsü, koşul başlangıçta doğru değilse bile döngüye bir kez girer.
        System.out.println("While döngüsüne giriliyor.");
        int i = 2;
        while (i>5){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti.");
        System.out.println("Do-While döngüsüne giriliyor.");
        do{
            System.out.println(i);
            i++;
        }while (i > 5);
        System.out.println("Do-While döngüsü bitti.");


        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int guess = 0;
        System.out.println(number);
        while (number != guess){
            System.out.println("1 ile 10 arasında sayı tahmininde bulunun : ");
            guess = scanner.nextInt();
        }
        System.out.println("Tebrikler!Sayı tahmininiz doğru :)" +
                " (seçilen sayı : " + number + ")" );


        int totalNumber = 0;
        int perfectNumber = 6;
        for(int n = 1; n < perfectNumber ; n++) {
            if ((perfectNumber % n) == 0) {
                totalNumber += n;
            }
        }
           if (perfectNumber == totalNumber)
               System.out.println("Mükemmel sayıdır.");
           else
               System.out.println("Mükemmel sayı değildir.");


        //lenght
        String name = "İpek Sandal";
        System.out.println(name.length());
        //indexOf
        String string = "Etiya java programlama";
        System.out.println("a harfi ilk olarak " + string.indexOf('a') + "sırada bulunur.");
        //charAt
        System.out.println(string.charAt(0));
        //toLowerCase-toUpperCase
        System.out.println(string.toLowerCase() + "\n" + string.toUpperCase());
        //subString
        System.out.println(string.substring(6) + "\n" +
                string.substring(14,18));
        //contains
        System.out.println(string.contains("gram") + "\n" + string.contains("aba"));
        //equals
        String string1 = "Etiya java programlama";
        String string2 = " Analiz eğitim";
        System.out.println(string.equals(string1));
        System.out.println(string.equals(string2));
        //concat
        String string3 = string1.concat(string2);
        System.out.println(string3);
    }
}