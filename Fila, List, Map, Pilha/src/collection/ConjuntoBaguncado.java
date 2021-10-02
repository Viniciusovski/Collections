package collection;

import java.util.HashSet;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        // TODO code application logic here
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2); // double --> Double, ele vai converter para um objeto
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        
        System.out.println(conjunto.size());
        
        // Set não aceita repetição
        
        System.out.print(conjunto.remove("Teste"));
        System.out.print(conjunto.remove("x"));
        
        System.out.println(conjunto.size());
        
        System.out.println(conjunto.contains(1));
        
        HashSet nums = new HashSet();      
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        System.out.println(conjunto);
        System.out.println(nums);
        
        conjunto.addAll(nums); //Juntou as duas collections
        System.out.println(conjunto);
        
        conjunto.retainAll(nums); // Mostra os valores em comum entre os conjuntos
        System.out.println(conjunto);
        
        conjunto.clear();
        System.out.println(conjunto);
        
        
        
        
       
    }
    
}
