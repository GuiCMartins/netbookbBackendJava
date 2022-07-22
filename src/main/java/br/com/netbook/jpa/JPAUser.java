package br.com.netbook.jpa;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class JPAUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String firebaseId;
	@NotNull
	@Size(min = 3, max = 255)
	private String name;
	@NotNull
	private LocalDate registrationDate;
	@NotNull
	private String email;

	public JPAUser() {
	}

	public JPAUser(String firebaseId, String name, String email) {
		this.firebaseId = firebaseId;
		this.name = name;
		this.email = email;
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

	@PrePersist
	private void prePersist() {
		this.registrationDate = LocalDate.now();
	}
}
