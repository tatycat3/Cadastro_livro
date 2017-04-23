package br.com.cadastro_livro.controle;

import br.com.cadastro_livro.modelo.Livro;
import br.com.cadastro_livro.dao.LivroDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="bean")
@SessionScoped

public class LivroBean {
    Livro livro;
    LivroDAO livroDAO;
    
    public LivroBean(){
        livro = new Livro();
        livroDAO = new LivroDAO();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public String cadastrar(){
        livroDAO.cadastrar(livro);
        livro = new Livro();
        return null;
    }
}
