package com.example.the_spring_cinema.repositories;

import com.example.the_spring_cinema.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Integer> {

}
