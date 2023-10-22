package atvd12;

public class ItemBiblioteca {
    private String titulo;
    private int ano;
    private int copiasDisponiveis;
    public ItemBiblioteca(String titulo, int ano, int copiasDisponiveis) {
        this.titulo = titulo;
        this.ano = ano;
        this.copiasDisponiveis = copiasDisponiveis;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }
    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
    public void emprestar(){
        if(copiasDisponiveis > 0){
            copiasDisponiveis--;
            System.out.println("Item emprestado: " + getTitulo());
        }else {
            System.out.println("Não há cópias disponíveis deste item.");
        }
    }
    public void devolver(){
        copiasDisponiveis++;
        System.out.println("Item devolvido: " + getTitulo());
    }
}
