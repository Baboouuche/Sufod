package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.*;

import java.sql.Statement;

public class DAOVivant  implements IDAO<Vivant,Integer>  {

	@Override
	public Vivant findById(Integer id) {
		
		Vivant v = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from vivant where id=?");
			ps.setInt(1, id);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				if(rs.getString("type_personnage").equals("Personnage")) 
				{
					v = new Personnage(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
									rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
									rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"),
									rs.getInt("pc"), Metier.valueOf(rs.getString("metier")), rs.getInt("id_compte"));
					
				}
				else 
				{
					v = new Monstre(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
							rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
							rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"), rs.getInt("min_drop"), rs.getInt("max_drop"));
				}
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return v;
	}
	
	
	
	public List<Personnage> findByIdCompte(Integer id) {

		List<Personnage> personnages = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from vivant where id_compte=?");
			ps.setInt(1, id);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
					Personnage p = new Personnage(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
									rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
									rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"),
									rs.getInt("pc"), Metier.valueOf(rs.getString("metier")), rs.getInt("id_compte"));

					personnages.add(p);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return personnages;
	}

	
	public List<Personnage> findPersoToCompte(int id) {

		List<Personnage> personnages = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from vivant where id_compte=?");
			ps.setInt(1, id);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
					Personnage p = new Personnage(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
									rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
									rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"),
									rs.getInt("pc"), Metier.valueOf(rs.getString("metier")), rs.getInt("id_compte"));

					personnages.add(p);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return personnages;
	}
	
	@Override
	public List<Vivant> findAll() {
		
		List<Vivant> vivants = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			
			PreparedStatement ps = conn.prepareStatement("SELECT * from vivant");

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				Vivant v = null;
				
				if(rs.getString("type_personnage").equals("Personnage")) 
				{
					v = new Personnage(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
									rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
									rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"),
									rs.getInt("pc"), Metier.valueOf(rs.getString("metier")), rs.getInt("id_compte"));
					
				}
				else 
				{
					v = new Monstre(rs.getInt("id"), rs.getString("nom"), rs.getString("description"), rs.getInt("niveau"),
							Classe.valueOf(rs.getString("classe")), rs.getInt("pv"), rs.getInt("esquive"), rs.getInt("vitesse"),
							rs.getInt("pa"), rs.getInt("pm"), rs.getInt("att_magique"), rs.getInt("att_physique"), rs.getInt("att_distance"),
							rs.getInt("def_magique"), rs.getInt("def_physique"), rs.getInt("def_distance"), rs.getInt("min_drop"), rs.getInt("max_drop"));
				}
				
				vivants.add(v);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return vivants;
	}

	
	@Override
	public void insert(Vivant v) {
		// TODO Auto-generated method stub
	}
	
	
	public void insertPersonnage(Personnage p) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);

			PreparedStatement ps = conn.prepareStatement("INSERT into vivant (id_compte, nom, description, classe, att_magique, att_physique, att_distance, def_magique, def_physique, def_distance, vitesse, esquive, pv, pa, pm, metier, attaque_1) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);			

			ps.setInt(1,p.getIdCompte());
			ps.setString(2,p.getNom());
			ps.setString(3,p.getDescription());
			ps.setString(4,p.getClasse().toString());
			ps.setInt(5,p.getAttMagique());
			ps.setInt(6,p.getAttPhysique());
			ps.setInt(7,p.getAttDistance());
			ps.setInt(8,p.getDefMagique());
			ps.setInt(9,p.getDefPhysique());
			ps.setInt(10,p.getDefDistance());
			ps.setInt(11,p.getVitesse());
			ps.setInt(12,p.getEsquive());
			ps.setInt(13,p.getPvMax());
			ps.setInt(14,p.getPaMax());
			ps.setInt(15,p.getPmMax());
			ps.setString(16,p.getMetier().toString());
			ps.setInt(17,0);
			
			
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) 
			{
				p.setId(rs.getInt(1));
			}


			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Vivant o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
