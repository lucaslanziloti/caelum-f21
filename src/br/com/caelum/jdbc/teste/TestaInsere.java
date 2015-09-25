package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import java.util.Calendar;

/**
 * @author lucas
 */
public class TestaInsere {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Caelum");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj57");
        contato.setDataNascimento(Calendar.getInstance());

        // grave nessa conexão!!!
        ContatoDao dao = new ContatoDao();

        // método elegante
        dao.adiciona(contato);

        System.out.println("Gravado!");
    }
}
