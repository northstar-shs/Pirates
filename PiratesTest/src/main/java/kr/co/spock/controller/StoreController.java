package kr.co.spock.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import kr.co.spock.model.*;
import kr.co.spock.repository.*;


//@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	StoreRepository storeRepository;
	
	@GetMapping("/store")
	public ResponseEntity<List<Store>> getAllStores(){
		try {
			List<Store> stores = new ArrayList<Store>();
			storeRepository.findAll().forEach(stores::add);
			if(stores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(stores, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/store/{id}")
	public ResponseEntity<Store> getStoreById(@PathVariable("id") long id){
		Optional<Store> storeData = storeRepository.findById(id);
		
		if(storeData.isPresent()) {
			return new ResponseEntity<>(storeData.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/store")
	public ResponseEntity<Store> createStore(@RequestBody Store store){
		try {
			Store _store = storeRepository.save(new Store(store.getName(), store.getOwner(), store.getDescription(), 
					store.getLevel(), store.getAddress(), store.getPhone(), store.getBusinessTimes(), store.getHolidays()));
			return new ResponseEntity<>(_store, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/sotre/{id}")
	public ResponseEntity<Store> updateStore(@PathVariable("id") long id, @RequestBody Store store){
		Optional<Store> storeData = storeRepository.findById(id);
		
		if(storeData.isPresent()) {
			Store _store = storeData.get();
			_store.setHolidays(store.getHolidays());
			return new ResponseEntity<>(storeRepository.save(_store), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/store/{id}")
	public ResponseEntity<HttpStatus> deleteStore(@PathVariable("id") long id){
		try {
			storeRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
