// TODO: will be generated
package com.github.rognoni.generated.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.github.rognoni.generated.entities.User;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

}