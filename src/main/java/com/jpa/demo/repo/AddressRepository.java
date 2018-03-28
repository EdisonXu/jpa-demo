package com.jpa.demo.repo;

import com.jpa.demo.manyToOne.Address;
import com.jpa.demo.manyToOne.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by edison
 * On 2018/3/27 19:18
 */
@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
}
