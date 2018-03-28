package com.jpa.demo.repo;

import com.jpa.demo.biDirection.Store;
import com.jpa.demo.oneToMany.Person;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by edison
 * On 2018/3/27 15:12
 */

@RepositoryRestResource(collectionResourceRel = "store", path = "store")
public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {

	@EntityGraph(value="products.all",type= EntityGraph.EntityGraphType.FETCH)
	Store findOneById(long id);
}
