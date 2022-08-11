import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Toplama" + "2.Çıkarma" + "3.Çarpma" + "4.Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçin:" );
        int selection = input.nextInt();
        System.out.println("İlk sayıyı girin:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı girin:");
        int sayi2 = input.nextInt();

        switch (selection){
            case 1:
                System.out.println("Sonuç:"+(sayi2+sayi1));
                break;
            case 2:
                System.out.println("Sonuç:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç:"+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sonuç:"+(sayi1/sayi2));
                break;
            default:
                System.out.println("Geçersiz bir işlem girdiniz...");
                        
        }
    }
}
