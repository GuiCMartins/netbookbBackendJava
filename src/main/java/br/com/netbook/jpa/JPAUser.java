package br.com.netbook.jpa;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class JPAUser {

	@Id
	@NotNull
	private String id;
	@NotNull
	@Size(min = 3, max = 255)
	private String name;
	@NotNull
	@Column(name = "registration_date")
	private LocalDate registrationDate;
	@NotNull
	private String email;
	@ManyToMany
	@JoinTable(name = "user_x_book")
	private Set<JPABook> books;

	public JPAUser() {
	}

	public JPAUser(String id, String name, LocalDate registrationDate, String email, Set<JPABook> books) {
		super();
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
		this.email = email;
		this.books = books;
	}

	public String getId() {
		return id;
	}

	public void setId(String firebaseId) {
		this.id = firebaseId;
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

	public Set<JPABook> getBooks() {
		return books;
	}

	public void setBooks(Set<JPABook> books) {
		this.books = books;
	}

	@PrePersist
	private void prePersist() {
		this.registrationDate = LocalDate.now();
	}
}
