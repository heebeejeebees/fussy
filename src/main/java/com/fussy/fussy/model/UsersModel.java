package com.fussy.fussy.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UsersModel {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id")
  private UUID id;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "role")
  private String role;

  @Column(name = "verified")
  private Boolean verified;

  public UUID getId() {
	  return id;
  }

  public void setId(UUID id) {
	  this.id = id;
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

  public String getRole() {
	  return role;
  }

  public void setRole(String role) {
	  this.role = role;
  }

  public Boolean getVerified() {
	  return verified;
  }

  public void setVerified(Boolean verified) {
	  this.verified = verified;
  }
}
