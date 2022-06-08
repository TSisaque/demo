package com.example.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import demo.Conn;
import demo.Livros;

public class LivrosDAO {

    public void inserirDiscente(Livros livro) {
        try {
            Conn con = new Conn();
            Connection conn = con.get();
            String sql = "INSERT INTO livro( `nome`, `autor`, `editora`) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, discente.getNome());
            stmt.setString(2, discente.getAutor());
            stmt.setString(3, discente.getEditora());
            
            stmt.execute();
            stmt.close();

            conn.close();

        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }

    public List<Livros> backcup() {
        List<Livros> livro = new LinkedList<Livros>();
        Conn con = new Conn();
        Connection conn = con.get();
        String sql = "SELECT * FROM livro";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Livros livro2 = new Livros();
                livro2.setNome(rs.getString("nome"));
                livro2.setAutor(rs.getString("autor"));
                livro2.setEditora(rs.getString("editora"));
                
                livro.add(livro2);

            }
            stmt.close();
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
        return livro;
    }

}
