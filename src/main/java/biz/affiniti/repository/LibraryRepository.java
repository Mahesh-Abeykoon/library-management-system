package biz.affiniti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import biz.affiniti.entity.Book;

public interface LibraryRepository extends JpaRepository<Book, Long> {

}
