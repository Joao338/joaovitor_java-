import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
    
    System.out.println("informe o primeiro numero? ");
    java.util.Scanner primeiroScanner = new Scanner(System.in);
    int numero1 = primeiroScanner.nextInt();

    System.out.println("informe o segundo numero? ");
    java.util.Scanner segundoScanner = new Scanner(System.in);
    int numero2 = segundoScanner.nextInt();

    
    java.util.Scanner somaScanner = new Scanner(System.in);
    int soma = somaScanner.nextInt();

    if(numero1 > numero2){
        System.out.print("o seu primeiro numero é maior que o segundo ");
    }
    else{
        System.out.print("o seu segundo numero é maior que o primeiro");
    }

    /*System.out.println("o soma tatol dos numeros é :" numero1 + numero2);*/

    

    



   } 
}
