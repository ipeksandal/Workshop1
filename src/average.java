import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz : ");
        int studentNumber = scanner.nextInt();
        for (int i = 0 ; i <studentNumber ; i++){
            System.out.print((i + 1) + ". öğrencinin ismini girin : ");
            String name = scanner.next();
            System.out.print((i + 1) + ". öğrencinin soyadını girin : ");
            String lastName = scanner.next();
            System.out.println((i + 1) + ". öğrencinin üç notunu giriniz :");
            double examGrade1 = scanner.nextDouble();
            double examGrade2 = scanner.nextDouble();
            double examGrade3 = scanner.nextDouble();
            double ort = ((examGrade1 + examGrade2 + examGrade3) / 3);
            System.out.print(name + lastName + "'in not ortalaması : " + ort +"\n");
        }
    }
}



