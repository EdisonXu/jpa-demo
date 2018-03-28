package com.jpa.demo.controller;

import com.jpa.demo.biDirection.Product;
import com.jpa.demo.biDirection.Store;
import com.jpa.demo.oneToMany.Person;
import com.jpa.demo.repo.PersonRepository;
import com.jpa.demo.repo.ProductRepository;
import com.jpa.demo.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by edison
 * On 2018/3/27 15:34
 */
@RestController
@RequestMapping("/api")
public class BaseController {

	@Autowired
	private PersonRepository repository;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private ProductRepository productRepository;

	/**
	 * 之所以还要写个Controller，是因为RestRepository传递的telephone要求是query的地址，而非数据
	 * @param p
	 */
	@PostMapping("/person")
	public void createPerson(@RequestBody Person p){
		System.out.println(p);
		repository.save(p);
	}

	@GetMapping("/person/{id}")
	public Person get(@PathVariable long id){
		Person p = repository.findById(id).get();
		p.getPhones();
		return p;
	}

	/**
	 * 使用EntityGraph触发Lazy加载
	 * @param id
	 * @return
	 */
	@GetMapping("/person2/{id}")
	public Person get2(@PathVariable long id){
		return repository.findOneById(id);
	}

	@PostMapping("/store")
	public void createStore(@RequestBody Store store){
		storeRepository.save(store);
	}

	@GetMapping("/store/{id}")
	public Store getSotreById(@PathVariable long id){
		return storeRepository.findOneById(id);
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable long id){
		return productRepository.findById(id).get();
	}
}
