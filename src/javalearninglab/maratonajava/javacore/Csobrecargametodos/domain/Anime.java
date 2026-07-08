package javalearninglab.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    // Sobrecarga: metodo com o mesmo nome, só que com a quantidade de parametros ou tipo diferentes
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setEpisodios(int episodios){ this.episodios = episodios; }

    public String getTipo(){ return this.tipo; }
    public int getEpisodios(){ return this.episodios; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
