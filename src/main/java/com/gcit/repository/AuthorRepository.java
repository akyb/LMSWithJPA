package com.gcit.repository;

import org.springframework.data.repository.CrudRepository;

import com.gcit.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {

}
