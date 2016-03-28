package com.manning.readinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manning.readinglist.model.Book;

import java.util.List;

/**
 * Created by sogla on 26/03/2016.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String readerv);
}
