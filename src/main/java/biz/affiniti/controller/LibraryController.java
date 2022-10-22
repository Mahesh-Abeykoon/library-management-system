package biz.affiniti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}

