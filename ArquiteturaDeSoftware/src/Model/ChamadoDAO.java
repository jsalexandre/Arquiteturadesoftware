package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;


public class ChamadoDAO {
	public int abrir(Chamado chamado) {
		String sqlInsert = "INSERT INTO chamado(descricao, status, DataHora, DataAberturaFechamento) VALUES (?, ?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = (Connection) ConnectionFactory.obtemConexao();
				PreparedStatement stm = (PreparedStatement) conn.prepareStatement(sqlInsert);) {
			stm.setString(1, chamado.getDescricao());
			stm.setString(2, chamado.getStatus());
			stm.setLong(3, chamado.getDataHora());
			stm.setString(3, chamado.getDataAberturaFechamento());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = (PreparedStatement) conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					chamado.setIdChamado(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chamado.getIdChamado();
	}

	public void consultar(Chamado chamado) {
		
	}

	public void fechar(int id_Chamado) {
		String sqlDelete = "DELETE FROM chamado WHERE id_Chamado = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = (Connection) ConnectionFactory.obtemConexao();
				PreparedStatement stm = (PreparedStatement) conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id_Chamado);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public ArrayList<Chamado> listarChamado(String id_chamado, String descricao) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	}


