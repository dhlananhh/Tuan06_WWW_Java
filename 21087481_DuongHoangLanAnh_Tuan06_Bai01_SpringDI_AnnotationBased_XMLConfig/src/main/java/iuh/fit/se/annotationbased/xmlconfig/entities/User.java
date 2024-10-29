package iuh.fit.se.annotationbased.xmlconfig.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("user")
public class User {
	private int id;
	private String username;
	private String password;
	@Autowired
	private Group group;
	
	public User() {
		super();
	}
	
	@Autowired
	public User(Group group) {
		super();
		this.group = group;
	}

	public User(int id, String username, String password, Group group) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.group = group;
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
