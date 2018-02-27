package ua.golik.udemy.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.golik.udemy.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRep;
	
	public BookController(BookRepository bookRep) {
		this.bookRep = bookRep;
	}

	@RequestMapping("/books")
	public String getAllBooks(Model model) {
		
		model.addAttribute("books", bookRep.findAll());
		return "books";
	}
}
