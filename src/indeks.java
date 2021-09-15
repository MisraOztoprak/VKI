import java.util.Scanner;

public class indeks {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        float kilo,boy;
        System.out.println("lutfen kg cinsinden kilonuzu giriniz:");
        kilo=input.nextFloat();

        System.out.println("lutfen metre cinsinden boyunuzu giriniz:");
        boy=input.nextFloat();

        float vki=boy*boy/kilo;

        System.out.println("vucut kitle indeksiniz:"+vki);

    }
}
