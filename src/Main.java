import java.util.List;

public class Main {
    public static void main(String[] args) {

        int varfuriGraf = 5;
        Graf graf = new Graf(varfuriGraf);

        graf.adaugaMuchie(0,1);
        graf.adaugaMuchie(0,2);
        graf.adaugaMuchie(1,3);
        graf.adaugaMuchie(2,4);

        System.out.println("Gradul nodului 0: " + graf.gradulVarfului(0));

        System.out.println("Exista muchie intre nodurile 1 si 3: " + graf.existaMuchie(1, 3));

        List<String> varfuri = graf.afiseazaToateMuchiile();
        System.out.println("Muchiile grafului: " + varfuri);

    }
}