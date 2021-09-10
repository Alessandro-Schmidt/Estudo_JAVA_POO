package src.com.pucpr.EstudoProva.Exercício4;

import java.util.ArrayList;

public class DespesasMensais {
    private String nomeMes;
    private ArrayList<Despesa> despesas = new ArrayList<>();

    public DespesasMensais(String nomeMes){
        this.nomeMes = nomeMes;
    }

    public void addDespesa(Despesa despesa){
        despesas.add(despesa);
    }

    public void removeDespesa(Despesa despesa){
        despesas.remove(despesa);
    }

    public float getTotalDespesas(){
        float total =0.0f;
        for (Despesa d:despesas){
            total+=this.getValue();
        }
    }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
    }
}
