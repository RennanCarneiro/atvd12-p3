package atvd12;

import java.time.LocalDate;

public class Revista extends ItemBiblioteca {
    public String edicao;

    public Revista(String titulo, int ano, int copiasDisponiveis, String edicao) {
        super(titulo, ano, copiasDisponiveis);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void calcularMulta(LocalDate dataDevolucao) {
        LocalDate dataAtual = LocalDate.now();
        if (dataDevolucao.isAfter(dataAtual)) {
            int diasAtraso = dataDevolucao.getDayOfMonth() - dataAtual.getDayOfMonth();
            int multa = diasAtraso * 2; 
            System.out.println("Multa: R$" + multa);
        } else {
            System.out.println("Sem multa.");
        }
    }
}
