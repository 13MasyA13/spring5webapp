package ua.golik.udemy.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import ua.golik.udemy.spring5webapp.entities.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
