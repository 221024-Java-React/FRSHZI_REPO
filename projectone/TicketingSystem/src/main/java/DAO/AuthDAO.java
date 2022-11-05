package DAO;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Address;
import Model.Person;
import Model.Role;
import Utils.Helper;
import Utils.JDBCConnectionUtil;

public class AuthDAO implements IAuthDAO {
	private JDBCConnectionUtil conUtil = JDBCConnectionUtil.getInstance();
	Connection connection = conUtil.getConnection();
	String sql = "";
	PreparedStatement prepared;

	public Person LoginWithUsernameAndPassword(String email, String password) {
		Person person = null;
		Address address;
		sql = "SELECT * FROM Person p inner join Address a on p.address_id=a.address_id  WHERE p.email=? and p.password=?";
		try {
			prepared = connection.prepareStatement(sql);

			prepared.setString(1, email);
			prepared.setString(2, password);

			ResultSet result = prepared.executeQuery();

			while (result.next()) {
				person = new Person();
				address = new Address();
				person.setID(result.getInt(1));
				person.setName(result.getString(2));
				person.setEmail(result.getString(3));
				person.setPassword(result.getString(4));
				person.setPicture(result.getString(5));
				if (result.getInt(7) == 1) {
					person.setRole(Role.MANAGER);
				} else {
					person.setRole(Role.EMPLOYEE);
				}
				address.setId(result.getInt(8));
				address.setStreet(result.getString(9));
				address.setCity(result.getString(10));
				address.setState(result.getString(11));
				address.setZipcode(result.getInt(12));
				person.setAddress(address);
				System.out.println(person.toString());
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		Helper.setPerson(person);
		return person;
	}

	public boolean RegisterWithUsernameAndPassword(Person user) {

		try {
			if (checkEmailIsAvailable(user.getEmail())) {

				int address_id = insertAddress(user);

				sql = "insert into Person(name, email, password,picture, address_id, role_id)" + "VALUES (?,?,?,?,?,?)";

				prepared = connection.prepareStatement(sql);

				int role = user.getRole().ordinal() + 1;

				prepared.setString(1, user.getName());
				prepared.setString(2, user.getEmail());
				prepared.setString(3, user.getPassword());
				prepared.setString(4, user.getPicture());
				prepared.setInt(5, address_id);
				prepared.setInt(6, role);

				prepared.execute();
				return false;
			} else
			{
				System.out.println("email already exist");
			return true;
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	

	public boolean uploadUserPicture(Image image) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ManagerChangeRole(Person user) {
		// TODO Auto-generated method stub
		return false;
	}

	private int insertAddress(Person user) throws SQLException {
		sql = "insert into Address(street, city, state,zipcode)" + "VALUES (?,?,?,?)";
		prepared = connection.prepareStatement(sql);

		prepared.setString(1, user.getAddress().getStreet());
		prepared.setString(2, user.getAddress().getCity());
		prepared.setString(3, user.getAddress().getState());
		prepared.setInt(4, user.getAddress().getZipcode());
		prepared.execute();

		sql = "select Max(address_id) from Address";
		prepared = connection.prepareStatement(sql);
		ResultSet result = prepared.executeQuery();
		int address_id = 0;
		if (result.next())
			address_id = result.getInt(1);
		return address_id;
	}

	public boolean checkEmailIsAvailable(String email) throws SQLException {
		sql = "select * from Person where email='" + email + "'";
		prepared = connection.prepareStatement(sql);
		ResultSet result = prepared.executeQuery();
		if (result.next())
			return false;
		return true;
	}

	@Override
	public boolean updateUserProfile(Person user) {
		// TODO Auto-generated method stub
		return false;
	}

}
