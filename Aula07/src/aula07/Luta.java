package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && !(l1.equals(l2))){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ####");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("============ RESULTADO DO DIA ============");
            switch(vencedor){
                case 0://empate
                    System.out.println("EMPATOU!!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1://ganhou desafiado
                    System.out.println(desafiado.getNome() + " venceu!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2://ganhou desafiante
                    System.out.println(desafiante.getNome() + " venceu!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("============================================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }


    }
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
