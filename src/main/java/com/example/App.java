package com.example;

import java.sql.SQLException;
import java.util.List;

import com.example.DAO.LivrosDAO;

public class App {
    public static void main(String[] args) throws SQLException {

        Livros livro = new Livros("Lento e Devagar", "Paulo Freire", "Saraiva");

        LivrosDAO dDao = new LivrosDAO();

        dDao.inserirLivros(livro);



        LivrosDAO dao = new LivrosDAO();
        List<Livros> livro = dao.backcup();
        for (Livros livro2 : livro) {
            System.out.println(livro2);
        }

    }
}
