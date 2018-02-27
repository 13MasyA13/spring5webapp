package ua.golik.udemy.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import ua.golik.udemy.spring5webapp.entities.Author;
import ua.golik.udemy.spring5webapp.entities.Book;
import ua.golik.udemy.spring5webapp.repositories.AuthorRepository;
import ua.golik.udemy.spring5webapp.repositories.BookRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRep;
	private BookRepository bookRep;
		
	public DevBootStrap(AuthorRepository authorRep, BookRepository bookRep) {
		this.authorRep = authorRep;
		this.bookRep = bookRep;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
	
	private void initData() {
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driver Design", "1234", "Harper Colins");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRep.save(eric);
		bookRep.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Programming without EJB", "2344", "Wox");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		authorRep.save(rod);
		bookRep.save(noEJB);
	}

}
