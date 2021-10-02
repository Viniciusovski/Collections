package collection;

import java.util.HashSet;
import java.util.TreeSet; // O TreeSet garante a ordem de inserção
import java.util.Set;
import java.util.SortedSet; //O SortedSet usa algum critério para ordenação

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");
        
        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }
        
       Set<Integer> nums = new HashSet<>();
       nums.add(1);
       nums.add(2);
       nums.add(120);
       nums.add(6);
       
       // nums.get(1); Não é possivel acessar pelo indice com o Set
       
       for(int n: nums){ //Não há problema pois, ele vai converter um object em um tipo primitivo
           System.out.println(n);
       }
    }
}
