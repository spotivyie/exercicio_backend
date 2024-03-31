package main.java.br.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.br.domain.Produto;

public class ProdutoFactory {

    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        // Adicione o novo campo quantidade
        prod.setQuantidade(rs.getInt("QUANTIDADE"));
        return prod;
    }
}