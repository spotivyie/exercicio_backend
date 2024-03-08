package fabrica;

import domain.Persistente;

public interface FabricaPersistente {

    Persistente criarObjeto(String dados[]);

}