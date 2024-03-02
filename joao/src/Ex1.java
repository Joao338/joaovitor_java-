import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        System.out.println("informe o numero ");
        java.util.Scanner dezScanner = new Scanner(System.in);
        int numero = dezScanner.nextInt();


        if(numero > 10){
            System.out.print("o seu numero maoir que 10");
        }

        else{
            System.out.print("o numero é menor que 10 ");
        }
    }
}
