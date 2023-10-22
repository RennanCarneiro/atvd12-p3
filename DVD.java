package atvd12;

import java.time.LocalDate;

public class DVD extends ItemBiblioteca {
    private int duracao; // em minutos

    public DVD(String titulo, int ano, int copiasDisponiveis, int duracao) {
        super(titulo, ano, copiasDisponiveis);
        this.duracao = duracao;
    }
    
    public int calcular_multa(){
        return 0;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void calcularMulta(LocalDate dataDevolucao) {
        LocalDate dataAtual = LocalDate.now();
        if (dataDevolucao.isAfter(dataAtual)) {
            int diasAtraso = dataDevolucao.getDayOfMonth() - dataAtual.getDayOfMonth();
            int multa = diasAtraso * 3; 
            System.out.println("Multa: R$" + multa);
        } else {
            System.out.println("Sem multa.");
        }
    }
}
