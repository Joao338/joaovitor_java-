import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        /*int numero = 50 ;
        float real = 10.5f;
        String frase = "minha frase legal";
        boolean noite = true;


        System.out.println("ola mundo" + numero);*/

        /*System.out.println("Olá, qual é o seu mundo ?");
        Scanner leitor = new Scanner (System.in);

        String nome = leitor.nextLine();
        System.out.println("seja bem vindo " + nome + "!!!");

        System.out.println("em que ano vc nasceu?");
        int ano =  Integer.parseInt(leitor.nextLine());

        int idade = 2024 - ano;
        System.out.println("legal, então vc deve ter " + idade + "anos");

        System.out.print("dia");
        String dia = leitor.nextLine();

        System.out.print("mes");
        String mes = leitor.nextLine();

        System.out.print("ano");
        String ano2 = leitor.nextLine();
        System.out.print("que dia vc nasceu ? (dd/mm/aaaa)");;
        String resposta = leitor.nextLine();

        String dia = resposta.substring(0, 2);
        String mes = resposta.substring(3, 5);
        String ano2 = resposta.substring(6, 10);


        System.out.println("entao vc nasceu no dia : " + dia "mes" + mes  "ano" + ano2 + "certo ?" );*/

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
