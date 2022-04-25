package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Attaque;
import entity.TypeAtt;
import entity.TypeCible;

public class DAOAttaque implements IDAO<Attaque,Integer>{

	@Override
	public Attaque findById(Integer id) {
		
		Attaque a = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from attaque where id=?");
			ps.setInt(1, id);
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				
				a = new Attaque(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
				TypeCible.valueOf(rs.getString("type_cible")), TypeAtt.valueOf(rs.getString("type_att")), 
				rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
				rs.getDouble("chance_Touch"), rs.getDouble("critique"),
				rs.getInt("cout_PA"), rs.getInt("cout_PM"), rs.getInt("effet_PA"), rs.getInt("effet_PM"));

			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return a;
	}
	
	
	
	public List<Attaque> findByType(TypeAtt type) {
		
		List<Attaque> attaques = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from attaque where type_att=?");
			ps.setString(1, type.toString());
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				
				Attaque a = new Attaque(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
				TypeCible.valueOf(rs.getString("type_cible")), TypeAtt.valueOf(rs.getString("type_att")), 
				rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
				rs.getDouble("chance_Touch"), rs.getDouble("critique"),
				rs.getInt("cout_PA"), rs.getInt("cout_PM"), rs.getInt("effet_PA"), rs.getInt("effet_PM"));
				
				attaques.add(a);

			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return attaques;
	}
	


	@Override
	public List<Attaque> findAll() {
		
		List<Attaque> attaques = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from attaque");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				
				Attaque a = new Attaque(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
				TypeCible.valueOf(rs.getString("type_cible")), TypeAtt.valueOf(rs.getString("type_att")), 
				rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
				rs.getDouble("chance_Touch"), rs.getDouble("critique"),
				rs.getInt("cout_PA"), rs.getInt("cout_PM"), rs.getInt("effet_PA"), rs.getInt("effet_PM"));
					
				attaques.add(a);
				
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return attaques;
		
	}



	@Override
	public void insert(Attaque a) {
			
	/*		try {
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			
			PreparedStatement ps = conn.prepareStatement("INSERT into attaque (nom, description, puissance,	type, portee, degt_magique, degat_physique, degat_distance, accuracy, critique, cout_PA, cout_PM, malus_PA, malus_PM) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1,a.getNom());
			ps.setString(2,a.getDesription());
			
			ps.setInt(3,a.getNiveau());
			ps.setString(4,a.getTypeAtt().toString());
			//ps.setString(5,a.typeCible().toString());
			
			ps.setInt(6,a.getDegatMagique());
			ps.setInt(7,a.getDegatPhysique());	
			ps.setInt(8,a.getDegatDistance());
			
			ps.setDouble(9,a.getChanceTouch());
			ps.setDouble(10,a.getChanceCritique());
			
			ps.setInt(11,a.getCoutPA());	
			ps.setInt(12,a.getCoutPM());
			ps.setInt(13,a.getMalusPA());	
			ps.setInt(14,a.getMalusPM());
	
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()) 
			{
				a.setId(rs.getInt(1));
			}
			
				
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/
		
	}




	@Override
	public void update(Attaque a) {
				
/*		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			
			PreparedStatement ps = conn.prepareStatement("INSERT into attaque (nom, description, puissance,	type, portee, degt_magique, degat_physique, degat_distance, accuracy, critique, cout_PA, cout_PM, malus_PA, malus_PM) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1,a.getNom());
			ps.setString(2,a.getDesription());
			
			ps.setInt(3,a.getNiveau());
			ps.setString(4,a.getTypeAtt().toString());
			//ps.setString(5,a.typeCible().toString());
			
			ps.setInt(6,a.getDegatMagique());
			ps.setInt(7,a.getDegatPhysique());	
			ps.setInt(8,a.getDegatDistance());
			
			ps.setDouble(9,a.getChanceTouch());
			ps.setDouble(10,a.getChanceCritique());
			
			ps.setInt(11,a.getCoutPA());	
			ps.setInt(12,a.getCoutPM());
			ps.setInt(13,a.getMalusPA());	
			ps.setInt(14,a.getMalusPM());
			
					
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}

	@Override
	public void delete(Integer id) {
		
/*		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("DELETE FROM attaque where id=?");
			ps.setInt(1,id);
			ps.executeUpdate();
				
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}

}
