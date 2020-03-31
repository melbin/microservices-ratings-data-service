package sv.edu.uesocc.controllers;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.edu.uesocc.dto.Rating;

@RestController
@RequestMapping("/ratingData")
public class RatingResourceController {
	
	Logger logger = LogManager.getLogger(RatingResourceController.class);
	
	@GetMapping("/{movieId}")
	public Rating getRatingByMovieId(@PathVariable("movieId") String movieId) {
		logger.info("Test1");
		return new Rating(movieId,10);
	}
	
	@GetMapping("/users/{userId}")
	public List<Rating> getRatingsByUserId(@PathVariable("userId") String userId){
		logger.info("Test2");
		return  (List<Rating>) Arrays.asList(
					new Rating("100",15)
					,new Rating("110",16)
				);
	}
	
}
