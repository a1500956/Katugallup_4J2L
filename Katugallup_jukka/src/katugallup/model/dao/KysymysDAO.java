package katugallup.model.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import katugallup.model.Kysymys;
import katugallup.model.dao.DataAccessObject;




public class KysymysDAO extends DataAccessObject {
	
	public void deleteKysymys(Kysymys kysymys) throws SQLException {
		Connection connection = null;
		PreparedStatement stmtDeletev = null;
		PreparedStatement stmtDeletek = null;
		
		

		try {
			
			connection = getConnection();
			
			String sqlDeletev = "DELETE FROM vastaus WHERE kysymys_id =?";
			stmtDeletev = connection.prepareStatement(sqlDeletev);
			stmtDeletev.setInt(1, kysymys.getId());
			stmtDeletev.executeUpdate();
			
			
				
			String sqlDeletek = "DELETE FROM kysymys WHERE kysymys_id =?";
			stmtDeletek = connection.prepareStatement(sqlDeletek);
			stmtDeletek.setInt(1, kysymys.getId());
			stmtDeletek.executeUpdate();
			
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtDeletev, connection);
			close(stmtDeletek, connection);
			
		}
	}

	
	public void updateKysymys(Kysymys kysymys) throws SQLException {
		Connection connection = null;
		PreparedStatement stmtUpdate = null;
		PreparedStatement stmtDelete = null;
		

		try {
			
			connection = getConnection();
			
			String sqlUpdate = "UPDATE kysymys SET kysymysteksti = ? WHERE kysymys_id =?";
			stmtUpdate = connection.prepareStatement(sqlUpdate);
			stmtUpdate.setInt(2, kysymys.getId());
			stmtUpdate.setString(1, kysymys.getKysymysteksti());
			stmtUpdate.executeUpdate();
			
			String sqlDelete = "DELETE FROM vastaus WHERE kysymys_id =?";
			stmtDelete = connection.prepareStatement(sqlDelete);
			stmtDelete.setInt(1, kysymys.getId());
			
			stmtDelete.executeUpdate();
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtUpdate, connection); 
		}
	}


	
	public void addKysymys(Kysymys kysymys) throws SQLException {
		Connection connection = null;
		PreparedStatement stmtInsert = null;
	

		try {
			
			connection = getConnection();
			
			String sqlInsert = "INSERT INTO kysymys(kysymysteksti) VALUES (?)";
			stmtInsert = connection.prepareStatement(sqlInsert);
			stmtInsert.setString(1, kysymys.getKysymysteksti());
			stmtInsert.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtInsert, connection); 
		}
	}


	
	
	public ArrayList<Kysymys> findAll() {	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Kysymys> kysymykset = new ArrayList<Kysymys>();
		Kysymys kysymys = null; 
		try {
			
			conn = getConnection();
			
			String sqlSelect = "SELECT kysymys_id, kysymysteksti FROM kysymys;";
		
			stmt = conn.prepareStatement(sqlSelect);
			
			rs = stmt.executeQuery(sqlSelect);
		
			while (rs.next()) {
				kysymys = readKysymys(rs);
			
				kysymykset.add(kysymys);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn); 
		}
	
		return kysymykset;
	}
	
	public Kysymys readKysymys(ResultSet rs) {	
		try {
			
			int id = rs.getInt("kysymys_id");
			String kysymysteksti = rs.getString("kysymysteksti");
					
			
			return new Kysymys(id, kysymysteksti);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
