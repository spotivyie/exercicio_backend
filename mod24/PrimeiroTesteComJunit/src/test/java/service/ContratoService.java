package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
    
    public String buscar() {
    	contratoDao.buscar();
        return "Buscar";
    }
    
    public String excluir() {
    	contratoDao.excluir();
        return "Excluido";
    }
    
    public String atualizar() {
    	contratoDao.atualizar();
        return "Atualizar";
    }
}