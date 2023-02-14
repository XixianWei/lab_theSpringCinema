package com.example.the_spring_cinema.service;

import com.example.the_spring_cinema.model.Movie;
import com.example.the_spring_cinema.repositories.MovieRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {


    @Autowired
    MovieRepository movieRepository;
    //constructor


    public MovieService() {

    }

    //methods
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id){
        return movieRepository.findById(id).get();
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }


}
