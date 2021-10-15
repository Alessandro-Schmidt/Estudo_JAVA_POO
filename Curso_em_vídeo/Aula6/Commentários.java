package Aula6;

public class Commentários {
    /*
    Aula sobre encapsulamento. 
    Pilares da Programação Orientada a Objetos:
    1. E (Encapsulamento);
    2. H (Herança);
    3. P (Polimorfismo);
    4. A (Abstração);

    Encapsulamento:
    -Capsula;
    Ex: pilha;
    As cápsulas servem para proteção e para padronização.
    Se a capsula for padrão (ex: diferentes tipos de pilhas AA), o seu funcionamento é o mesmo.
    Um software encapsulado segue o mesmo padrão.
    Um software em uma capsula proteje o usuário do software e o software do usuário;
    Não importa o molde, o resultado é sempre o mesmo.
    Encapsular: ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior;
    Para o correto encapsulamento, ele é protegido através da interface, que é como o objeto se comunica com o mundo externo;
    Interface: Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode
    ser feito com um objeto dessa classe;
    Vantagens do encapsulamento:
    1 - Torna mudanças invisíveis (troca a pilha e controle remoto nem se toca disso);
    2 - Facilita a reutilização de código (todas as pilhas do formato AA sào iguais e servem para todos os eletônicos
    que usem uma pilha AA);
    3 - Reduzir o efeito colateral (Encostar na pilha, pode causar danos a pilha e ao usuário);
    EX:
    O chasssi do carro é uma capsula para o que acontece no motor, e os pedais e setas, são as interfaces.

    Diagrama UML:
    interface se declara parecido com uma classe, mas ela não possui atributos, apenas métodos;
    <<interface>>
    Controlador
    métodos:
    + ligar() (public);
    + Desligar();
    + Abrir menu()
    + mutar();
    + Play()
    + pause()
    + mais_vol()
    + menos_vol() -- Estes são todos métodos abstratos, pois eles não serào desenvolvidos na inetrface,
    mas vão existir na classe

    Definir a classe:
    Controle
    atributos:
    - volume (private)
    - ligado
    - tocando
    Métodos:
    + ligar() (public);
    + Desligar();
    + Abrir menu()
    + mutar();
    + Play()
    + pause()
    + mais_vol()
    + menos_vol()
    getter e setter de cada atributo privados! 



    * */
}
