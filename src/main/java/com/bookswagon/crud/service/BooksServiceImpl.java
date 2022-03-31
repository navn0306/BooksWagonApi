package com.bookswagon.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookswagon.crud.entity.Books;
import com.bookswagon.crud.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BookService{

	@Autowired
	private BooksRepository booksRepo;

	@Override
	public Books saveBook(Books books) {
		return booksRepo.save(books);
	}

	@Override
	public List<Books> saveBooks(List<Books> books) {
		return booksRepo.saveAll(books);
	}

	@Override
	public List<Books> getBooks() {
		return booksRepo.findAll();
	}

	@Override
	public Books getBooksByID(int id) {
		return booksRepo.findById(id).orElse(null);
	}

	@Override
	public String deleteBooks(int id) {
		booksRepo.deleteById(id);
		return "Book Deleted !!!";
	}
	
	public Books updateBook(Books book) {
		Books existingBook = booksRepo.findById(book.getBookId()).orElse(null);
		existingBook.setCategory(book.getCategory());
		existingBook.setPrice(book.getPrice());
		return booksRepo.save(existingBook);
	}
}
