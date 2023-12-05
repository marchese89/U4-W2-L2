package ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero N");
        Integer n = null;
        while (n == null){
            try {
                n = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("input non corretto, riscrivere");
            }
        }
        Set<String> setParole = new HashSet<>();
        Set<String> setDuplicati = new HashSet<>();
        Set<String> setDistinte = new HashSet<>();

        for (int i = 0; i < n; i++){
            System.out.println("dammi una parola");
            String p = null;
            while (p == null){
                try {
                    p = sc.nextLine();
                }catch (NumberFormatException e){
                    System.out.println("input non corretto, riscrivere");
                }
            }
            if(setParole.contains(p)) {
                setDuplicati.add(p);
            }
            setParole.add(p);
        }

        System.out.println("Parole duplicate");
        stampaSet(setDuplicati);
        //troviamo le parole distinte
        for(String s: setParole){
            if(!setDuplicati.contains(s)){
                setDistinte.add(s);
            }
        }

        System.out.println("numero parole distinte: "+setDistinte.size());
        stampaSet(setDistinte);
        sc.close();
    }

    public static void stampaSet(Set<String> set){
        System.out.print("{");
        for (String s: set){
            System.out.print(s+" ");
        }
        System.out.println("}");
    }
}
