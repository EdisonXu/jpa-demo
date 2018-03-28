package com.jpa.demo.repo;

import com.jpa.demo.oneToMany.Person;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by edison
 * On 2018/3/27 15:12
 */

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	@EntityGraph(value="phones.all",type= EntityGraph.EntityGraphType.FETCH)
	Person findOneById(long id);
}
