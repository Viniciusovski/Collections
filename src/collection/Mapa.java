package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {
    public static void main(String[] args) {
        // --> O Map organiza por chaves as listas
        Map<Integer, String> usuarios = new HashMap<>();
        
        // --> O Put além de adicionar ele substitui elementos que tenham a mesma chave
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafa Kaliman");
        usuarios.put(4, "Rebeca");
        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet()); // Mostra as chaves
        System.out.println(usuarios.values()); // Mostra os valores
        System.out.println(usuarios.entrySet()); // Mostra as chaves com seus respectivos valores
        
        System.out.println(usuarios.containsKey(20)); // Verifica se tem a chave
        System.out.println(usuarios.containsValue("Rebeca")); // Verifica se tem o valor
        
        System.out.println(usuarios.get(4)); // Mostra por meio da chave
        System.out.println(usuarios.remove(1)); // Remove por meio da chave e mostra quem foi removido
        System.out.println(usuarios.remove(1, "Gui")); // Ele vê que não existe e retorna false
        
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }
        
        // Percorrer chave e valor ao mesmo tempo
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
            
        }
    }
}
