package br.com.netbook.jpa;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "books")
public class JPABook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String title;
	@NotNull
	private String author;
	@NotNull
	private String publisher;
	@NotNull
	@Column(name = "published_date")
	private String publishedDate;
	@Length(max = 10000)
	private String description;
	@NotNull
	@Column(unique = true)
	private String isbn;
	@Column(name = "page_count")
	private Long pageCount;
	private String height;
	private String width;
	private String thickness;
	@Column(name = "average_rating", precision = 2, scale = 2)
	private Double averageRating;
	private String language;
	@NotNull
	private String thumbnail;
	@ManyToMany(mappedBy = "books")
	private Set<JPAUser> users;

	public JPABook() {
	}

	public JPABook(Long id, String title, String author, String publisher, String publishedDate, String description,
			String isbn, Long pageCount, String height, String width, String thickness, Double averageRating,
			String language, String thumbnail, Set<JPAUser> users) {
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

	public Set<JPAUser> getUsers() {
		return users;
	}

	public void setUsers(Set<JPAUser> users) {
		this.users = users;
	}
}
