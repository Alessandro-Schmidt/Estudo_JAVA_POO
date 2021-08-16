package Aula2;

import java.util.Scanner;

public class enviar_cartaopostal {
    String paisdeorigem;
    String paisdestino;
    String mensagem;
    float valor_envio;
    int dias_ate_entrega;
    boolean receber_resposta;
    boolean chegou;

    void status(){
        System.out.printf("Veio do país %s e vai para o país %s",this.paisdeorigem, this.paisdestino);
        System.out.printf("\nA mensagem: %s",this.mensagem);
        System.out.printf("Vão demorar %d dias até a entrega",this.dias_ate_entrega);

    }

}
