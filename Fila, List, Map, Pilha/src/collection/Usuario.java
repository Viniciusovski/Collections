package collection;

import java.util.Objects;

public class Usuario {
    String nome;
    
    Usuario(String nome){
        this.nome = nome;
    }
    
    public String toString(){
        return "Me nome é " + this.nome + ".";
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
//    
//    public int hashcode(){
//        return 1; 
//        return this.nome.length();
//    }
    
}
