import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.print("matematik notunu girin= ");
        int mat=scanner.nextInt();
        System.out.print("fizik notunu girin= ");
        int fizik=scanner.nextInt();
        System.out.print("kimya notunu girin= ");
        int kimya=scanner.nextInt();
        System.out.print("tarih notunu girin= ");
        int tarih=scanner.nextInt();
        System.out.print("turkce notunu girin= ");
        int turkce=scanner.nextInt();
        System.out.print("müzik notunu girin= ");
        int muzik=scanner.nextInt();

        double ort=(mat+fizik+kimya+tarih+turkce+muzik)/6.0;
        System.out.print("not ortalamasnız =  "+ort);

    }
}
