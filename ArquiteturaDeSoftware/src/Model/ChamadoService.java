package Model;

import java.util.ArrayList;

import model.OrganizacaoSocial;

public class ChamadoService {
	ChamadoDAO dao;
	
	public ChamadoService(){
		dao = new ChamadoDAO();
	}
	 
	public int abrir(Chamado chamado) {
		return dao.abrir(chamado);
	}
	
	public void consultar(Chamado chamado){
		dao.consultar(chamado);
	}
	
	
	public void fechar(int id){
		dao.fechar(id);
	}
	
	public ArrayList<Chamado> listarOrganiChamado(String id_chamado, String descricao){
		return dao.listarChamado(id_chamado, descricao);
	}



}
