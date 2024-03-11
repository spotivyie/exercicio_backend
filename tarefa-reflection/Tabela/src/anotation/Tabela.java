package anotation;

@Anotacao(value = "Algo", bairros = "Teste", numeroCasa = 50)
public class Tabela {
	
	@Anotacao(value = "ASD", bairros = {"Teste", "Teste1"}, numeroCasa = 30, valores = 10d)
    private String nome;

	@Anotacao(value = "Algo", bairros = "Teste", numeroCasa = 50)
    public Tabela() {
		
	}

}