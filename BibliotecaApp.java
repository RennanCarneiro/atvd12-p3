package atvd12;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro("Pessoas normais", 2018, 7, "Sally Rooney");
        Revista revista = new Revista("Mad", 1952, 7, "Willian Gaines");
        DVD dvd = new DVD("Fantasma da Opera", 2004, 8, 143);
        
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Livro");
            System.out.println("2 - DVD");
            System.out.println("3 - Revista");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();    
          
            switch (opcao) {
                case 1:
                    int opcaoLivro;
                    do {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Empréstimo");
                        System.out.println("2 - Devolução");
                        System.out.println("3 - Sair");
                        opcaoLivro = sc.nextInt();
            
                        switch (opcaoLivro) {
                            case 1:
                                livro.emprestar();
                                break;
                            case 2:
                                System.out.println("Informe a data de devolução (Formato: ano-mes-dia): ");
                                String dataDevolucaoString = sc.next();
                                LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoString);
                                livro.calcularMulta(dataDevolucao);
                                livro.devolver();
                                break;
                            case 3:
                                System.out.println("Saindo do programa.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (opcao != 4);
                    break;
                case 2:
                    int opcaoDvd;
                    do {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Empréstimo");
                        System.out.println("2 - Devolução");
                        System.out.println("3 - Sair");
                        opcaoDvd = sc.nextInt();
            
                        switch (opcaoDvd) {
                            case 1:
                                revista.emprestar();
                                break;
                            case 2:
                                System.out.println("Informe a data de devolução (Formato: ano-mes-dia): ");
                                String dataDevolucaoString = sc.next();
                                LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoString);
                                dvd.calcularMulta(dataDevolucao);
                                dvd.devolver();
                                break;
                            case 3:
                                System.out.println("Saindo do programa.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (opcao != 4);
                    break;
                case 3:
                    int opcaoRevista;
                    do {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Empréstimo");
                        System.out.println("2 - Devolução");
                        System.out.println("3 - Sair");
                        opcaoRevista = sc.nextInt();
            
                        switch (opcaoRevista) {
                            case 1:
                                revista.emprestar();
                                break;
                            case 2:
                                System.out.println("Informe a data de devolução (Formato: ano-mes-dia): ");
                                String dataDevolucaoString = sc.next();
                                LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoString);
                                revista.calcularMulta(dataDevolucao);
                                revista.devolver();
                                break;
                            case 3:
                                System.out.println("Saindo do programa.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (opcao != 4);
                    break;
            
                default:
                    break;
            }
        }while (opcao != 4);
    }
}
