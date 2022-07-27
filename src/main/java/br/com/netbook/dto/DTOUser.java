package br.com.netbook.dto;

import java.time.LocalDate;
import java.util.Set;

public class DTOUser {

	private String id;
	private String name;
	private LocalDate registrationDate;
	private String email;
	private Set<DTOBook> books;

	public DTOUser() {
	}

	public DTOUser(String id, String name, LocalDate registrationDate, String email, Set<DTOBook> books) {
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

	public void setId(String id) {
		this.id = id;
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

	public Set<DTOBook> getBooks() {
		return books;
	}

	public void setBooks(Set<DTOBook> books) {
		this.books = books;
	}

}
