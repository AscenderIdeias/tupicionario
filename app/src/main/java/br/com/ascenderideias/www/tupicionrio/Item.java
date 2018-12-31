package br.com.ascenderideias.www.tupicionrio;

public class Item {
    private String titulo;
    private String descricao;

    public Item(String titulo, String descricao, int image) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.image = image;
    }

    private int image;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
