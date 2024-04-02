package test.java;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.dao.IProdutoDAO;
import br.com.dao.ProdutoDAO;
import br.com.domain.Produto;

public class ProdutoTest {

    private IProdutoDAO ProdutoDao;

    @Before
    public void setUp() {
        ProdutoDao = new ProdutoDAO();
    }

    @Test
    public void cadastrarProduto() {
        Produto produto = new Produto();
        produto.setCodigo((long) 5); // Certifique-se de que o código não seja nulo
        produto.setNome("Produto Teste");
        produto.setPreco(50.0);
        produto.setQuantidadeEstoque(10);
        produto.setDescricao("Descrição do produto"); // Atribua um valor à descrição

        produto = ProdutoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }

    @Test
    public void listarProdutos() {
        List<Produto> produtos = ProdutoDao.buscarTodos();

        assertNotNull(produtos);
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() +
                    ", Preço: " + produto.getPreco() + ", Estoque: " + produto.getQuantidadeEstoque());
        }
    }
}