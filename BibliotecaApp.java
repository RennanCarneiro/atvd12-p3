package atvd12;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro("Pessoas normais", 2018, 7, "Sally Rooney");
        Revista revista = new Revista("Mad", 1952, 7, "Willian Gaines");
        DVD dvd = new DVD("Fantasma da Opera", 2004, 8, 143);

        livro.emprestar();
        dvd.emprestar();
        revista.emprestar();

        System.out.println("Informe a data de devolução (Formato: ano-mes-dia): ");
        String dataDevolucaoString = sc.next();
        LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoString);

        livro.devolver();
        dvd.devolver();
        revista.devolver();

        livro.calcularMulta(dataDevolucao);
        dvd.calcularMulta(dataDevolucao);
        revista.calcularMulta(dataDevolucao);
    }
}
