package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

import model.Admin;
import model.Compte;
import model.Joueur;


public class DAOCompte implements IDAO<Compte,Integer> {

	@Override
	public Compte findById(Integer id) {

		Compte c = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where id=?");
			ps.setInt(1, id);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				if(rs.getString("type_compte").equals("Joueur")) 
				{
					c = new Joueur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
				else 
				{
					c = new Admin(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return c;
	}


	public List<Compte> findAll() {

		List<Compte> comptes = new ArrayList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);

			PreparedStatement ps = conn.prepareStatement("SELECT * from compte");

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				Compte c=null;

				if(rs.getString("type_compte").equals("Joueur")) 
				{
					c = new Joueur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
				else 
				{
					c = new Admin(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}

				comptes.add(c);
			}


			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return comptes;
	}


	public List<Compte> findByType(String type) {

		List<Compte> comptes = new ArrayList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);

			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where type_compte=?");
			ps.setString(1, type);


			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				Compte c = null;

				if(rs.getString("type_compte").equals("Joueur")) 
				{
					c = new Joueur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
				else 
				{
					c = new Admin(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
				comptes.add(c);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return comptes;
	}



	@Override
	public void insert(Compte c) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);

			PreparedStatement ps = conn.prepareStatement("INSERT into compte (login, password, type_compte, mail, pseudo) VALUES (?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);

			ps.setString(1,c.getNom());
			ps.setString(2,c.getPrenom());
			ps.setString(3,c.getClass().getSimpleName());
			ps.setString(4,c.getMail());
			ps.setString(5,c.getPseudo());			

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) 
			{
				c.setId(rs.getInt(1));
			}


			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	@Override
	public void update(Compte c) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);

			PreparedStatement ps = conn.prepareStatement("INSERT into compte (login, password, type_compte, mail, pseudo, id) VALUES (?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);

			ps.setString(1,c.getNom());
			ps.setString(2,c.getPrenom());
			ps.setString(3,c.getClass().getSimpleName());
			ps.setString(4,c.getMail());
			ps.setString(5,c.getPseudo());
			ps.setInt(5,c.getId());

			ps.executeUpdate();


			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	@Override
	public void delete(Integer id) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("DELETE FROM compte where id=?");
			ps.setInt(1,id);
			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	public Compte seConnecter(String login,String password) 
	{
		Compte c = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where login=? and password=?");
			ps.setString(1,login);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{

				if(rs.getString("type_compte").equals("Joueur")) 
				{
					c = new Joueur(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}
				else 
				{
					c = new Admin(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("mail"), rs.getString("pseudo"));
				}

			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return c;

	}
}

