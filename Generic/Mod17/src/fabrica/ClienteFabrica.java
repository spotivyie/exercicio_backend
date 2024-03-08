package fabrica;

import domain.Cliente;
import domain.Persistente;

public class ClienteFabrica implements FabricaPersistente{

    @Override
    public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }
}