package com.vti.ecommerce.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users", catalog = "express_typeorm_database")
public class UsersEntity {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Short id;

	@Column(name = "firstName", length = 100, nullable = false)
	private String firstName;

	@Column(name = "lastName", length = 100, nullable = false)
	private String lastName;

	@NotEmpty
	@Email
	@Size(max = 255)
	@Column(name = "email", unique = true)
	private String email;

	@NotEmpty
	@Size(max = 255)
	@Column(name = "password", unique = true)
	private String password;

	@Column(name = "status", length = 100, nullable = false)
	private short status;

	@Column(name = "avatar", length = 1000, nullable = false)
	private String avatar;

	@Column(name = "language", length = 100, nullable = false)
	private short language;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "user_role",
				joinColumns = @JoinColumn(name = "user_id"),
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public short getLanguage() {
		return language;
	}

	public void setLanguage(short language) {
		this.language = language;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
