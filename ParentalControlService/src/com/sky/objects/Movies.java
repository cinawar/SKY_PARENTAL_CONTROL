package com.sky.objects;

public class Movies {

	private String movieName;
	private String parentalCode;
	private String movieId;

	public Movies createMovies(String movieName, String parentalCode, String movieId) {
		this.movieName = movieName;
		this.parentalCode = parentalCode;
		this.movieId = movieId;

		return this;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getParentalCode() {
		

		return parentalCode;
	}

	public void setParentalCode(String parentalCode) {
		this.parentalCode = parentalCode;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

}
