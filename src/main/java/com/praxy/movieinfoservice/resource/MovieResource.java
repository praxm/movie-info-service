package com.praxy.movieinfoservice.resource;

import com.praxy.movieinfoservice.model.Movie;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    Logger logger = LoggerFactory.getLogger(MovieResource.class);

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        logger.info("Movie service is being called for {}", movieId);
        return new Movie("Border", "Patriotic movie",movieId);
    }
}
