package ex3;

public class Main {
    public static void main(String[] args) {
        Rubrica r = new Rubrica();
        r.inserisci("AAA","1233");
        r.inserisci("AbA","1223");
        r.inserisci("AcA","1343");
        r.inserisci("AdA","1431");
        System.out.println("Stampa rubrica");
        r.stampaRubrica();
        System.out.println("elimino un elemento");
        r.elimina("AAA");
        r.stampaRubrica();
        System.out.println("ricerca per numero di telefono (1223)");
        System.out.println(r.ricercaPerNumero("1223"));
        System.out.println("ricerca per nome (AdA)");
        System.out.println(r.ricercaPerNome("AdA"));
    }
}
