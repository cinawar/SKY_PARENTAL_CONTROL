package com.sky.controller;

import java.util.Scanner;

import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;
import com.sky.objects.Client;
import com.sky.objects.Movies;

public class Services {
	Scanner scanner = new Scanner(System.in);

	ParentalControlService service = new ParentalControlService();

	public void startParentalService(Client client, Movies[] movies)
			throws TechnicalFailureException, TitleNotFoundException {

		try {
			System.out.println("Please enter the Movie ID");
		} catch (Exception e) {
			throw new TechnicalFailureException();
		}

		String movieId = scanner.nextLine();

		service.setClient(client);
		service.setMovies(movies);

		String result = service.getParentalControlLevel(movieId);

		if (result != null) {
			System.out.println("Customer can watch and  parentalLevel is."
					+ result);
		}

	}

}
