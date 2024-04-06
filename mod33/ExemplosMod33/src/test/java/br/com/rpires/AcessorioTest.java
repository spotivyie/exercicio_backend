package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.IAcessorioDao;
import br.com.rpires.dao.AcessorioDao;
import br.com.rpires.domain.Acessorio;

public class AcessorioTest {

    private IAcessorioDao acessorioDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrarAcessorio() {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Acessorio Teste");
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
