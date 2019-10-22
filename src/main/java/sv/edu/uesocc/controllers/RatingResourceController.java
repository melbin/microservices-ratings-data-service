package sv.edu.uesocc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.edu.uesocc.dto.Rating;

@RestController
@RequestMapping("/ratingData")
public class RatingResourceController {
	
	@GetMapping("/{movieId}")
	public Rating getRatingByMovieId(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,10);
	}
	
	@GetMapping("/users/{userId}")
	public List<Rating> getRatingsByUserId(@PathVariable("userId") String userId){
		return  (List<Rating>) Arrays.asList(
					new Rating("100",15)
					,new Rating("110",16)
				);
	}
	
}
