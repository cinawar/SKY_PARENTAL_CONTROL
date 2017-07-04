package com.sky.app;

import com.sky.controller.ParentalControlService;
import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;
import com.sky.objects.Client;
import com.sky.objects.Movies;

public class TestCode {
 
	
	/**
	 * @param args
	 * @throws TechnicalFailureException
	 * @throws TitleNotFoundException
	 */
	public static void main(String[] args) throws TitleNotFoundException,
			TechnicalFailureException {
		// TODO Auto-generated method stub

		Client client = new Client().createClient("1", "12");

		Movies[] movies = new Movies[7];

		movies[0] = new Movies().createMovies("Supernatural", "U", "1");
		movies[1] = new Movies().createMovies("Armageddon", "15", "2");
		movies[2] = new Movies().createMovies("Mario Bross", "PG", "3");
		movies[3] = new Movies().createMovies("Legend Of Batman", "18", "4");
		movies[4] = new Movies().createMovies("Legend Of Batman II", "12", "5");
		movies[5] = new Movies().createMovies("Unknown", "XX", "6");

		try {
			ParentalControlService service = new ParentalControlService();
			service.setClient(client);
			service.setMovies(movies);

			String result = service.getParentalControlLevel("5");
			
			if (result != null) {
				System.out.println("Customer can watch and  parentalLevel is."
						+ result);
			}
				
			result = service.getParentalControlLevel("6");
				if (result != null) {
					System.out.println("Customer can watch and  parentalLevel is."
							+ result);
			}
		} catch (Exception e) {
			// handle out the technical failure with meesage
			e.getMessage();
		}

	}

}
