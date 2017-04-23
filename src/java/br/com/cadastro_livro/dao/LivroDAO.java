package br.com.cadastro_livro.dao;

import br.com.cadastro_livro.JDBC.Conexao;
import br.com.cadastro_livro.modelo.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    PreparedStatement pstm;
    Connection con;
    String sql;
    
    public boolean cadastrar(Livro livro){
        sql= "insert into livro(titulo,paginas,isbn,autor)"
                + " values (?,?,?,?)";
        
        try{
            con = Conexao.conectar();
            pstm = con.prepareStatement(sql);
            pstm.setString(1,livro.getTitulo());
            pstm.setInt(2,livro.getPaginas());
            pstm.setString(3,livro.getIsbn());
            pstm.setString(4,livro.getAutor());
            return pstm.execute();
            
        }catch(SQLException erro){
            System.out.println(erro);
            return false;
        }
    }
}
