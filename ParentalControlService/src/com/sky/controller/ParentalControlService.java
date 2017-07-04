/**
 * 
 */
package com.sky.controller;

import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;
import com.sky.objects.Client;
import com.sky.objects.Movies;
import com.sky.objects.ParentalLevels;

/**
 * @author Ozgur Arslan
 * 
 */
public class ParentalControlService implements MovieService {

	private Movies[] movie;
	private Client client;
	private boolean founded;

	public String getParentalControlLevel(String movieId)
			throws TitleNotFoundException, TechnicalFailureException {
		// System.out.println("servis started with Movies object:= "
		// +this.movie.getMovieId()+"-"+movieId);

		founded = false;
		/*
		 * if given movie Id is equal to Movie database then OK
		 */
		for (int i = 0; i < movie.length; i++) {
			try {
				if (this.movie[i].getMovieId().equals(movieId)) {
					founded = true;

					if (ParentalLevels.getLevelForType(this.movie[i]
							.getParentalCode()) <= ParentalLevels
							.getLevelForType(this.client.getParentalLevel())) {
						return movie[i].getParentalCode();
					}

				}
			} catch (Exception e) {
				if (!founded)
					throw new TitleNotFoundException();
				if (founded)
					throw new TechnicalFailureException();
			}

		}
		return null;

	}

	// get the client info
	public void setClient(Client client) {
		this.client = client;
	}

	// get the movie info
	public void setMovies(Movies[] movie) {
		this.movie = movie;
	}

}
