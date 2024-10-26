package com.mt.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.movie.entity.Movie;
import com.mt.movie.service.MovieService;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

	@Autowired
	MovieService movieService;

	@GetMapping("/test")
	public String test() {
		System.out.println("called");
		return "success";
	}

	@GetMapping("/movie")
	public List<Movie> movie() {
		System.out.println("called all movie");
		return movieService.fetchAll();
	}
	
	@GetMapping("/movie/{id}")
	public Movie movieById(@PathVariable Long id) {
		System.out.println("called movie by id");
		return movieService.fetchById(id);
	}

	@GetMapping("/movie/auto")
	public String movieAuto() {
		movieService.saveAuto();
		return "success movie auto";
	}

}
