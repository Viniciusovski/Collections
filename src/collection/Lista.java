package collection;

import java.util.ArrayList;

public class Lista {
    
    // List é ordenada
    // Pode acessat pelo ID
    // Indexado
    // Ordenado por padrão
    // Pode ter repetição
    
    public static void main(String[] args) {
        ArrayList<Usuario> lista =  new ArrayList<Usuario>();
        
        Usuario u1 = new Usuario("Ana");
        
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        for(Usuario u: lista){
            System.out.println(u.nome);
        }
        
        System.out.println(lista.get(3)); //Para encontrar através do indice
        
        System.out.println(lista.remove(1)); //remove pelo indice e mostra quem foi removido
        System.out.println(lista.remove(new Usuario("Lia"))); // Remove o elemento mas retorna um valor booleano
        
        System.out.println("Tem? " + lista.contains(new Usuario("Manu")));
        
        //Ele só faz essas operações graças ao hashcode e equals do obj Usuario
    }
}
