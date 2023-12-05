package ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rubrica {

    private final Map<String,String> m = new HashMap<>();

    public void inserisci(String nome, String numero){
        m.put(nome,numero);
    }

    public void elimina(String nome){
        m.remove(nome);
    }

    public String ricercaPerNumero(String numero){
        Set<String> chiavi = m.keySet();
        for(String k: chiavi){
            if(m.get(k).equals(numero)){
                return k;
            }
        }
        return null;
    }

    public String ricercaPerNome(String nome){
        return m.get(nome);
    }

    public void stampaRubrica(){
        Set<String>  keys = m.keySet();
        for(String k: keys){
            System.out.println(k+" "+m.get(k));
        }
    }
}
