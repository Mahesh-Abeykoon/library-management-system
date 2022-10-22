package biz.affiniti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biz.affiniti.entity.Book;
import biz.affiniti.service.LibraryService;

@RestController
@RequestMapping("api/library")
public class LibraryController {
	
	@Autowired
	public LibraryService libraryService;
	
	@PostMapping("/create")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		return new ResponseEntity<>(libraryService.saveBook(book),HttpStatus.CREATED);
	}
	
	@GetMapping("/show_books")
	public List<Book> getAll(){
		return libraryService.getAllBooks();
	}
	
	@GetMapping("/show_book/{id}")
	public ResponseEntity<Book> getStudentById(@PathVariable("id") long bookID){
		return new ResponseEntity<>(libraryService.getBookByID(bookID), HttpStatus.OK);
	}
	
	@PutMapping("/update_book/{id}") 
	public ResponseEntity<Book> updateBook(@PathVariable("id")long id 
				,@RequestBody Book book){
		return new ResponseEntity<Book>(libraryService.updateBook(book, id), HttpStatus.OK );
		
	}
	
	@DeleteMapping("/delete_book/{id}")
	public ResponseEntity<String> deleteBook (@PathVariable("id")long id){
		
		libraryService.deleteBook(id);
		return new ResponseEntity<String>("Book is removed sucessfully !...", HttpStatus.OK);
		
	}
}

