import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Ana tutarı giriniz :");

        double tutar = input.nextDouble();

        double kdvOrani = tutar < 1000 ? 18 : 8 ;
        double kdvTutari = tutar*kdvOrani/100 ;
        double kdvliTutar = tutar+kdvTutari ;

        System.out.println(kdvliTutar);
    }
}
