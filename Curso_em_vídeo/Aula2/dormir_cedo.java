package Aula2;

public class dormir_cedo {
    String dia_da_semana;
    String aula_do_dia;
    boolean dormir_bem;
    int horas_sono;
    boolean estar_pronto;

    void status(){
        System.out.println("Hoje é "+this.dia_da_semana);
        System.out.println("Pela manhã, você tem aula de "+this.aula_do_dia);
        System.out.println("Você dormiu bem? "+this.dormir_bem);
        System.out.println("Horas dormidas no dia: "+this.horas_sono+" horas");
        System.out.println("Se sente pronto? "+this.estar_pronto);
    }

    void cochilar(){
        if (this.horas_sono<8){
            System.out.printf("\nDormi menos de 8 horas! preciso descansar!\nDormi apenas %d horas!", this.horas_sono);
            this.horas_sono+=1;
            System.out.printf("\nDormi mais uma hora. Agora tenho %d horas de sono.",this.horas_sono);
        }else if (this.horas_sono==8){
            System.out.printf("\nNem preciso de cochilo! Dormi %d horas!",this.horas_sono);
            this.estar_pronto = true;
        }else{
            System.out.printf("\nDormi até demais! ");
            this.estar_pronto = true;
        }

    }
    void tomar_cafe(){
        this.estar_pronto = true;
    }
}
