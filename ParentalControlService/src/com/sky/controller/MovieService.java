/**
 * 
 */
package com.sky.controller;

import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;

/**
 * @author Ozgur Arslan
 *
 */
public interface MovieService {
	
	String getParentalControlLevel(String movieId)
			throws TitleNotFoundException,
			TechnicalFailureException;
}
