package com.bookswagon.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookswagon.crud.entity.Books;
import com.bookswagon.crud.service.BooksServiceImpl;

@RestController
public class BooksController {

	@Autowired
	private BooksServiceImpl service;

	@PostMapping("/addBook")
	public Books addBook(@RequestBody Books book) {
		return service.saveBook(book);
	}

	@PostMapping("/addBooks")
	public List<Books> addBooks(@RequestBody List<Books> books) {
		return service.saveBooks(books);
	}

	@GetMapping("/getBooks")
	public List<Books> findAllBooks() {
		return service.getBooks();
	}

	@GetMapping("/getBookByID/{id}")
	public Books findBooktbyId(@PathVariable ("id") int id) {
		return service.getBooksByID(id);
	}

	@PutMapping("/update")
	public Books updateBook(@RequestBody Books book) {
		return service.updateBook(book);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable ("id") int id) {
		return service.deleteBooks(id);
	}

}
