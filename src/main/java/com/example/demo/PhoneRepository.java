package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "phone", path = "phone")
@CrossOrigin("*")
public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {

    List<Phone> findByFio(@Param("fio") String name);
    List<Phone> findByNumContains(@Param("num") String name);

}
