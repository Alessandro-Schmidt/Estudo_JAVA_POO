package Aula2;

public class aula2_exercicio2 {
    public static void main(String[] args) {
        enviar_cartaopostal cartao1 = new enviar_cartaopostal();
        cartao1.dias_ate_entrega = 10;
        cartao1.paisdeorigem = "Alemanha";
        cartao1.paisdestino = "Brasil";
        cartao1.mensagem = "\nMuita saudade de você meu amor! Não vejo a hora de nos encontrarmos!\n";
        cartao1.status();
    }

}
