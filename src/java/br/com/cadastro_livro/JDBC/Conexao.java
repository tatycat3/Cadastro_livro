package br.com.cadastro_livro.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String USER = "root";
    private static final String PSW = "mysql";
    private static final String BD = "jdbc:mysql://localost:3306/atividadeJSF";
    private static Connection con;
    
    public static Connection conectar() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(BD,USER,PSW);
            return con;
        }catch(ClassNotFoundException erro){
            
        }catch(SQLException erro){
        
        }return null;
    }
}
