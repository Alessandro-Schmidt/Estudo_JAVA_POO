package Aula2;

public class aula2_exercicio1 {
    public static void main(String[] args) {
        dormir_cedo dia1 = new dormir_cedo();
        dia1.horas_sono = 4;
        dia1.aula_do_dia = "Engenharia de Requisitos";
        dia1.dia_da_semana = "Segunda - Feira";
        dia1.dormir_bem = false;
        dia1.estar_pronto = false;
        dia1.status();
        while (dia1.estar_pronto==false){
            dia1.cochilar();
        }

    }
}
