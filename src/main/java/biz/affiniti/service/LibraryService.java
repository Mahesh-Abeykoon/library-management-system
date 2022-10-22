package biz.affiniti.service;

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
	
	
}
