package com.jpa.demo.repo;

import com.jpa.demo.oneToMany.Telephone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by edison
 * On 2018/3/27 15:17
 */
@RepositoryRestResource(collectionResourceRel = "teles", path = "teles")
public interface TelephoneRepository extends PagingAndSortingRepository<Telephone, Long> {
}
