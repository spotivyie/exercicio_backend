package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.ICarroDao;
import br.com.rpires.dao.CarroDao;
import br.com.rpires.domain.Carro;
import br.com.rpires.domain.Marca;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrarCarro() {
        Carro carro = new Carro();
        carro.setModelo("Modelo Teste");
        
        
        Marca marca = new Marca();
        marca.setId(1L);
        carro.setMarca(marca);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
