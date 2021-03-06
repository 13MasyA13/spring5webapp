package ua.golik.udemy.spring5webapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String isnb;
	
	private String publisher;
	
	@ManyToMany
	@JoinTable(name="mauthor_book", joinColumns=@JoinColumn(name="book_id")
	,inverseJoinColumns=@JoinColumn(name="author_id"))
	private Set<Author> authors = new HashSet<>();
	
	public Book() {
		
	}
	
	public Book(String title, String isbn, String publisher) {
		this.title = title;
		this.isnb = isbn;
		this.publisher = publisher;
	}

	public Book(String title, String isnb, String publisher, Set<Author> authors) {
		this.title = title;
		this.isnb = isnb;
		this.publisher = publisher;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsnb() {
		return isnb;
	}

	public void setIsnb(String isnb) {
		this.isnb = isnb;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
