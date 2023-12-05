package ex2;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        while (n == null){
            try{
                System.out.println("Dammi un intero N");
                n = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("input non corretto, riprovare");
            }
        }
        System.out.println("stampo l'array casuale");
        List<Integer> lista = arrayCasuale(n);
        stampaLista(lista);

        System.out.println("Lista in ordine inverso");
        List<Integer> listaInversa = doppiaListaInversa(lista);
        stampaLista(listaInversa);
        //stampa pari
        System.out.println("Stampo i valori in posizione pari");
        stampaPariDispari(lista,true);
        //stampa dispari
        System.out.println("Stampo i valori in posizione dispari");
        stampaPariDispari(lista,false);
        sc.close();
    }

    static List<Integer> arrayCasuale(int n){
        Random r = new Random();
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < n; i++){
            lista.add(r.nextInt(101));
        }

        Collections.sort(lista);

        return lista;
    }

    static List<Integer> doppiaListaInversa(List<Integer> lista){
        List<Integer> clone = new ArrayList<>(lista);
        List<Integer> clone2 = new ArrayList<>(lista);
        Collections.reverse(clone2);
        clone.addAll(clone2);
        return clone;
    }

    static void stampaPariDispari(List<Integer> l, boolean b){
        System.out.print("{");
        if(b){
            //stampo gli elementi pari
            for(int i = 0; i < l.size(); i+=2){
                System.out.print(l.get(i)+" ");
            }
        }else{
            //stampo gli elementi dispari
            for(int i = 1; i < l.size(); i+=2){
                System.out.print(l.get(i)+" ");
            }
        }
        //versione alternativa
//        for(int i = b?0:1; i < l.size(); i+=2){
//            System.out.print(l.get(i)+" ");
//        }
        System.out.println("}");
    }

    static void stampaLista(List<Integer> l){
        System.out.print("{");
        for(Integer i: l){
            System.out.print(i+ " ");
        }
        System.out.println("}");
    }
}
