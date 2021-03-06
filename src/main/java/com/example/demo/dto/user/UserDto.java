package com.example.demo.dto.user;

import java.util.List;

public class UserDto {
	
	private String id;
	private String username;
	private List<String> roles;
	private String name;
	private String surname;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "UserGetDto [id=" + id + ", username=" + username + ", roles=" + roles + ", name=" + name + ", surname="
				+ surname + "]";
	}

}
