package RecomendadorDeLivros.Service;

public class Livro {
    private String titulo;
    private String sinopse;

    // Construtor, getters e setters
    public Livro() {}

    public Livro(String titulo, String sinopse) {
        this.titulo = titulo;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
