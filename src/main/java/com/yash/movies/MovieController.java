package com.yash.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<Movies>> getMovies() {
		return new ResponseEntity<List<Movies>>(service.findAllMovies(), HttpStatus.OK);
	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Optional<Movies>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
	}
}