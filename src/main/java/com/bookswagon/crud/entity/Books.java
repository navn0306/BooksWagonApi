package com.bookswagon.crud.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue
	@Column(name = "bookId")
	private int bookId;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "author")
	private String author;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "releaseDate")
	private String releaseDate;

	@Column(name = "price")
	private double price;

	@Column(name = "rating")
	private String rating;

	public Books(int bookId, String name, String category, String author, String publisher, String releaseDate,
			double price, String rating) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.category = category;
		this.author = author;
		this.publisher = publisher;
		this.releaseDate = releaseDate;
		this.price = price;
		this.rating = rating;
	}

	public Books(Books s) {
		this.bookId = s.bookId;
		this.name = s.name;
		this.category = s.category;
		this.author = s.author;
		this.publisher = s.publisher;
		this.releaseDate = s.releaseDate;
		this.price = s.price;
		this.rating = s.rating;
	}

	public Books() {}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", name=" + name + ", category=" + category + ", author=" + author
				+ ", publisher=" + publisher + ", releaseDate=" + releaseDate + ", price=" + price + ", rating="
				+ rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, category, name, price, publisher, rating, releaseDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId
				&& Objects.equals(category, other.category) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(rating, other.rating)
				&& Objects.equals(releaseDate, other.releaseDate);
	}
}
