package com.jodrix.movieProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jodrix.movieProject.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{


}
