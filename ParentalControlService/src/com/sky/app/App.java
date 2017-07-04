package com.sky.app;

import com.sky.controller.Services;
import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;
import com.sky.objects.Client;
import com.sky.objects.Movies;

public class App {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Set the default values Create a Client and Movies list
		 */

		Client client = new Client().createClient("1", "12");

		Movies[] movies = new Movies[7]; 

		movies[0] = new Movies().createMovies("Supernatural", "U", "1");
		movies[1] = new Movies().createMovies("Armageddon", "15", "2");
		movies[2] = new Movies().createMovies("Mario Bross", "PG", "3");
		movies[3] = new Movies().createMovies("Legend Of Batman", "18", "4");
		movies[4] = new Movies().createMovies("Legend Of Batman II", "12", "5");
		movies[5] = new Movies().createMovies("Unknown", "XX", "6");
		
		Services service = new Services();

		try {
			// call the api with given data
			service.startParentalService(client, movies);
		} catch (Exception e) {
			// handle out the technical failure with meesage
			e.getMessage();
		}  

	}
}
