public class aula1 {
    // Isso é como se faz um comentário em Java.
    /*
    Assim, comentários em várias linhas. 
    */
    // O que é um objeto? R: Objeto é coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentais e estado atual.
    // Comportamento + Característica + Estado == Estado
    // No exemplo das canetas: O objeto em si é a caneta, e o seu molde, seria sua classe. 
    // <<>>Classe: Responde à três perguntas: A) Coisas que eu tenho |Atributo| B) Coisas que eu faço |Método| C) Como Estou agora |Estado| <<>> 
    // Exemplo Caneta: 
    //a) Coisas que tenho: R: Modelo, cor, ponta, carga, Tampa. 
    // b) Coisas que faço: R: Escrever, rabiscar, pintar, tampar, destampar. 
    // c) Como estou agora: R: Tampada, com x% da carga original, escrevendo, em manutenção, etc
    // Para se criar uma caneta, primeiro se cria sua classe (molde). 
    /* 
    Classe caneta: 
    <<|Atributos|>> modelo: Caractere, cor: Caractere, ponta: Real (0.5,1), carga: Inteirio (80%, 100%), tampada: Lógico (V ou F); 
    <<|Método|>>: 
    Rabiscar():
        se (tampada) então:
            escreva("ERRO")
        senão:
            Escreva("Rabisco")
    Fim do método
    Método Tampar():
    tampada = verdadeiro
    Fim do método

    Fim da classe.
    Instanciar -->> Quando conseguimos tranformar uma classe (Molde) em Objeto.
    C1 (nome do objeto) = Nova Caneta (molde)
    C1.cor = Azul
    C1.tampada = False
    C1.ponta = 0.5
    C1.rabiscar()
    <<<<<<<<<<<>>>>>>>>>>
    C2 = nova caneta
    c2.cor = "vermelho"
    c2.tampada = Falso
    c2.tampar()
    <<<<<<<>>>>>>>
    Classe: Define os atributos e métodos comuns que serão compartilhados por um objeto;
    Objeto: é uma instância de uma classe. 

    */


}
