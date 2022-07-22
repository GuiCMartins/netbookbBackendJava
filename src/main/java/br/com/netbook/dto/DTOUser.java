package br.com.netbook.dto;

import java.time.LocalDate;

import br.com.netbook.jpa.JPAUser;

public class DTOUser {

	private Long id;
	private String firebaseId;
	private String name;
	private LocalDate registrationDate;
	private String email;

	public DTOUser() {
	}

	public DTOUser(Long id, String firebaseId, String name, String email, LocalDate registrationDate) {
		this.id = id;
		this.firebaseId = firebaseId;
		this.name = name;
		this.registrationDate = registrationDate;
		this.email = email;
	}

	public DTOUser(JPAUser jpaUser) {
		this.id = jpaUser.getId();
		this.firebaseId = jpaUser.getFirebaseId();
		this.name = jpaUser.getName();
		this.registrationDate = jpaUser.getRegistrationDate();
		this.email = jpaUser.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirebaseId() {
		return firebaseId;
	}

	public void setFirebaseId(String firebaseId) {
		this.firebaseId = firebaseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
