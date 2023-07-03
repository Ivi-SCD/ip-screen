package br.com.ip.ipscreen.domain.movies;

public class Movie {
    private String name;
    private Integer duration;
    private Integer releaseYear;
    private String movieGenre;

    public Movie() {
    }

    public Movie(String name, Integer duration, Integer releaseYear, String movieGenre) {
        this.name = name;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.movieGenre = movieGenre;
    }

    public Movie(MovieDTO movieDTO) {
        this.name = movieDTO.name();
        this.duration = movieDTO.duration();
        this.releaseYear = movieDTO.releaseYear();
        this.movieGenre = movieDTO.movieGenre();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", releaseYear=" + releaseYear +
                ", movieGenre='" + movieGenre + '\'' +
                '}';
    }

}