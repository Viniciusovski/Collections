package collection;

import java.util.ArrayDeque;
import java.util.Deque;


// --> Last In First Out
public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        
        livros.add("O Pequeno Principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");
     
      
        for(String livro: livros){
            System.out.println(livro);
        }
        
        System.out.println(livros.peek());
        System.out.println(livros.element());
        
        System.out.println(livros.pop());
        System.out.println(livros.poll());
       // System.out.println(livros.remove());
        
        // fila.size();
        // fila.isEmpty();
        // fila.clear();
        //fila.contains(...);
        
    }
}
