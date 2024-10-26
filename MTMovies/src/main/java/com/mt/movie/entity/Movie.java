package com.mt.movie.entity;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie implements Serializable{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long movieId;
	
	@Column(name="movieName")
	private String movieName;
	
	

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieName) {
		super();
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + "]";
	}


	

	
}
