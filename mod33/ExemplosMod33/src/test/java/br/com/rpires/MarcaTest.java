package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.IMarcaDao;
import br.com.rpires.dao.MarcaDao;
import br.com.rpires.domain.Marca;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrarMarca() {
        Marca marca = new Marca();
        marca.setNome("Marca Teste");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
