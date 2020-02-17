package collection;

import java.util.LinkedList;
import java.util.Queue;

// --> First In First Out
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        // Add e Offer -> Adicionam elementos em uma fila
        
        fila.add("Ana"); // Quando o tamanho da fila for pré-definido, e ultrapassar a quantidade, o java vai retornar ERRO
        fila.offer("Bia"); // Quando o tamanho da fila for pré-definido, e ultrapassar a quantidade, o java vai retornar FALSE
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        //A diferença no comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // --> retorna null
        System.out.println(fila.peek()); // --> retorna null
        System.out.println(fila.element()); // --> retorna exceção
        System.out.println(fila.element()); //--> retorna exceção
        
        // fila.size();
        // fila.isEmpty();
        // fila.clear();
        //fila.contains(...);
        
        // Poll e Remove -> obter o próximo elemento da fila e remove
         //A diferença no comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // --> retorna null
        System.out.println(fila.remove()); // --> retorna exceção
        
    }
}
