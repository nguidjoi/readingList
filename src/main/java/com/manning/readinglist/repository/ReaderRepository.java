package com.manning.readinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manning.readinglist.model.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
