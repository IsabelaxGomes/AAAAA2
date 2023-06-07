import java.util.ArrayList;
import java.util.Scanner; 

public class Meus_Livros{

   

ArrayList<Livros_Romance> livros_romance;
ArrayList<Livros_Acao> Livros_Acao;  

Scanner sc = new Scanner (System.in);
String nome;
String autor;
String ARQ_DADOS = "meus_livros.dat";



public void cadastar_LivrosR (){

    System.out.println("Informe o nome do livro de romance");
    nome =  sc.nextLine();

    System.out.println (" Informe o autor de romance ");
    autor = sc.nextLine();



   Livros_Romance novoLivro = new Livros_Romance();
    


   

    System.out.println("Livro cadastrado com sucesso!");

  
}

l







public void imprimir_Enum(){

    for (Genero genero : Genero.values()){

        System.out.println("\nLivro Favorito:\n");

        System.out.println("Genero:" + genero.name());
        System.out.println("Favorito:" + genero.getFavorito());
        System.out.println("Nota:" + genero.getNota());

    }
;
    

}

public static void main(String[] args) {
    //Meus_Livros.imprimir_Enum();

    Meus_Livros ml = new Meus_Livros();
    ml.imprimir_Enum();
    

    
}
    
   
    
    
    
}