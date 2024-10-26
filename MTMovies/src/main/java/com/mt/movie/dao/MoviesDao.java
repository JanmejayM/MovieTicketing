package com.mt.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.movie.entity.Movie;

@Repository
public interface MoviesDao extends JpaRepository<Movie,Long>{

}
