package src.com.pucpr.EstudoProva.Exercício4;

import java.util.ArrayList;

public class DespesasMensais {
    private String nomeMes;
    private ArrayList<Despesa> despesas;

    public DespesasMensais(String nomeMes) {
        this.nomeMes = nomeMes;
        this.despesas = new ArrayList<>();
    }
    public void addDespesa(Despesa despesa){
        this.despesas.add(despesa);
    }
    public void removeDespesa(Despesa despesa){
        this.despesas.remove(despesa);
    }
    public float getTotalDespesas(){
        float total = 0.0f;
        for (Despesa d:despesas) {
            total += d.getValue();
        }
        /*for (int i = 0; i < despesas.size(); i++) {
            total += despesas.get(i).getValue();
        }*/
        return total;
    }
    public void printStatus(){
        System.out.println("---"+this.nomeMes + "---");
        for (Despesa d:despesas){
            d.printStatus();
        }
        System.out.println("Total: R$"+getTotalDespesas());
    }
}
