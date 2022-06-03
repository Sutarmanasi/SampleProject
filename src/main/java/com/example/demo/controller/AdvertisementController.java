package com.example.demo.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Advertisement;

// UNIT-2 (CREATING ADVERTISEMENT ENDPOINTS)
@RestController
@RequestMapping("/api/v1/ads")
public class AdvertisementController {
	public static final String PATH = "/api/v1/ads";

	@GetMapping
	public List<Advertisement> advertisements() {
		List<Advertisement> list = new ArrayList<>();
		list.add(new Advertisement("java", 1));
		return list;
	}

	@GetMapping("/{id}")
	public Advertisement advertisementById(@PathVariable("id") int id) {
		List<Advertisement> list = advertisements();
		if (list.get(0).getId() == id) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * @RequestBody is bound to the method argument. HttpMessageConverter resolves
	 *              method argument depending on the content type.
	 */
	@PostMapping
	public HeadersBuilder<BodyBuilder> add(@RequestBody Advertisement advertisement) throws URISyntaxException {
		return ResponseEntity.ok();

	}
}
