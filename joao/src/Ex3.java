import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
         System.out.println("informe o valor A ");
        java.util.Scanner aScanner = new Scanner(System.in);
        int A = aScanner.nextInt();

        System.out.println("informe o valor de B ");
        java.util.Scanner bScanner = new Scanner(System.in);
        int B = bScanner.nextInt();


        if(A > B){
            System.out.println("o valor de A é maior que o valor B");
        }
        else if(A < B){
            System.out.println("o valor de B é maior que o valor de A");
        }
        else{
        System.out.println("a sequencia dos valores de A e B sao invalidos");
        }
    }
}
