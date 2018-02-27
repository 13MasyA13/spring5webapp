package ua.golik.udemy.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.golik.udemy.spring5webapp.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
