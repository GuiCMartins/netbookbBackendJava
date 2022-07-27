package br.com.netbook.dto;

import java.util.Set;

public class DTOBook {

	private Long id;
	private String title;
	private String author;
	private String publisher;
	private String publishedDate;
	private String description;
	private String isbn;
	private Long pageCount;
	private String height;
	private String width;
	private String thickness;
	private Double averageRating;
	private String language;
	private String thumbnail;
	private Set<DTOUser> users;

	public DTOBook() {
	}

	public DTOBook(Long id, String title, String author, String publisher, String publishedDate, String description,
			String isbn, Long pageCount, String height, String width, String thickness, Double averageRating,
			String language, String thumbnail, Set<DTOUser> users) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.description = description;
		this.isbn = isbn;
		this.pageCount = pageCount;
		this.height = height;
		this.width = width;
		this.thickness = thickness;
		this.averageRating = averageRating;
		this.language = language;
		this.thumbnail = thumbnail;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Set<DTOUser> getUsers() {
		return users;
	}

	public void setUsers(Set<DTOUser> users) {
		this.users = users;
	}

}
