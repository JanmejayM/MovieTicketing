package com.mt.movie.service;

import java.util.List;

import com.mt.movie.entity.Movie;

public interface MovieService {
	public void saveAuto();
	public List<Movie> fetchAll();
	public Movie fetchById(Long id);

}
