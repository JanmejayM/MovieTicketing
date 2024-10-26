package com.mt.movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mt.movie.dao.MoviesDao;
import com.mt.movie.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MoviesDao moviesDao;

	public void saveAuto() {
		List<String> movieNames = new ArrayList<>();
		movieNames.add("abc");
		movieNames.add("xyz");

		movieNames.forEach(x -> {
			moviesDao.save(new Movie(x));
		});
	}

	@Cacheable(value="movie", key="'allmovie'")
	public List<Movie> fetchAll() {
		return moviesDao.findAll();
	}

	@Cacheable(value = "movie", key = "#id")
	public Movie fetchById(Long id) {
		return moviesDao.findById(id).get();
	}

}
