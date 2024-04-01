import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
   
    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao;
    }

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("segredo dos animais", "Miguel de Cervantes", 1605);
        System.out.println(livro1); 

        System.out.println(); 
        
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        System.out.println(livro2); 
    }
}