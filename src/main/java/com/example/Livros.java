package com.example;



public class Livros {
    private String nome;
    private String autor;
    private String editora;


public Livros() {

    }

    public Livros(String nome, String autor, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
       
    }


    /**
     * @return String return the Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the Nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the Autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param idade the Autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the Editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param sexo the Editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    
    }

    public String toString() {
        return "Livros [Nome = "+ nome + ", Autor = " + autor +", Editora = "+ editora +"]";
    }



}
