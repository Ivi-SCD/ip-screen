package br.com.ip.ipscreen.controller;

import br.com.ip.ipscreen.domain.movies.Movie;
import br.com.ip.ipscreen.domain.movies.MovieDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    @GetMapping
    public String loadFormPage() {
        return "movies/form";
    }

    @PostMapping
    public String registerMovie(MovieDTO movieDTO) {
        var movie = new Movie(movieDTO);
        movies.add(movie);

        System.out.println(movies);

        return "movies/form";
    }

}
