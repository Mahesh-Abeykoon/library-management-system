package biz.affiniti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.affiniti.entity.Book;
import biz.affiniti.repository.LibraryRepository;


@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	public Book saveBook(Book book) {
		return libraryRepository.save(book);
	}
	
	
	public List<Book> getAllBooks() {
		
		return libraryRepository.findAll();
	}
	

	
	public Book getBookByID(long id) {
		
		return libraryRepository.findById(id).orElseThrow(null);
	
	}


	public Book updateBook(Book book, long id) {
		Book existingBook = libraryRepository.findById(id).orElseThrow(null);
		
		existingBook.setBookName(book.getBookName());
		existingBook.setIsbn(book.getIsbn());
		existingBook.setRegisterdNumber(book.getRegisterdNumber());
		existingBook.setIssuedDate(book.getIssuedDate());
		
		libraryRepository.save(existingBook);
		
		return existingBook;
	}

	
}
