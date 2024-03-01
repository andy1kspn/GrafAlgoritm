import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graf {
    private int numarVarfuri;
    private LinkedList<Varf>[] listaAdiacenta;

    Graf(int numarVarfuri) {
        this.numarVarfuri = numarVarfuri;
        listaAdiacenta = new LinkedList[numarVarfuri];
        for (int i = 0; i < numarVarfuri; ++i) {
            listaAdiacenta[i] = new LinkedList<>();
        }
    }

    void adaugaMuchie(int sursa, int destinatie) {
        Varf destinatieVarf = new Varf(destinatie);
        Varf sursaVarf = new Varf(sursa);
        listaAdiacenta[sursa].add(destinatieVarf);
        listaAdiacenta[destinatie].add(sursaVarf);
    }


    int gradulVarfului(int v) {
        return listaAdiacenta[v].size();
    }

    boolean existaMuchie(int src, int dest) {
        for (Varf varf : listaAdiacenta[src]) {
            if (varf.valoarea == dest) {
                return true;
            }
        }
        return false;
    }

    List<String> afiseazaToateMuchiile() {
        List<String> muchii = new ArrayList<>();
        for (int i = 0; i < numarVarfuri; ++i) {
            for (Varf varf : listaAdiacenta[i]) {
                if (varf.valoarea > i) { // Evităm să adăugăm de două ori aceeași muchie
                    muchii.add("(" + i + ", " + varf.valoarea + ")");
                }
            }
        }
        return muchii;
    }



}
