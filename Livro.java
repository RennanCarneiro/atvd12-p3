package atvd12;

import java.time.LocalDate;

public class Livro extends ItemBiblioteca {
   private String autor;

public Livro(String titulo, int ano, int copiasDisponiveis, String autor) {
    super(titulo, ano, copiasDisponiveis);
    this.autor = autor;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}
public void calcularMulta(LocalDate dataDevolucao) {
        LocalDate dataAtual = LocalDate.now();
        if (dataDevolucao.isAfter(dataAtual)) {
            int diasAtraso = dataDevolucao.getDayOfMonth() - dataAtual.getDayOfMonth();
            int multa = diasAtraso * 4; 
            System.out.println("Multa: R$" + multa);
        } else {
            System.out.println("Sem multa.");
        }
    }
}
