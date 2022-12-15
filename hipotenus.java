import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a , b , c ;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Kenarı Giriniz : ");
        a=input.nextDouble();
        System.out.println("İkinci Kenarı Giriniz : ");
        b=input.nextDouble();

        c= Math.sqrt((a*a) + (b*b)) ;
        System.out.print("Hipotenüs : " + c );


    }
}
