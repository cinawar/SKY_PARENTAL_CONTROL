package com.sky.app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.sky.controller.ParentalControlService;
import com.sky.exception.TechnicalFailureException;
import com.sky.exception.TitleNotFoundException;
import com.sky.objects.Client;
import com.sky.objects.Movies;

@RunWith(Parameterized.class)
public class ParentalControlServiceTest {
	
	private String inputNumber;
	   private String expectedResult;
	   private ParentalControlService parent;
       private static Client client;
       private static Movies[] movies = new Movies[7];
       
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = new Client().createClient("1", "12");
		
			movies[0] = new Movies().createMovies("Supernatural", "U", "1");
			movies[1] = new Movies().createMovies("Armageddon", "15", "2");
			movies[2] = new Movies().createMovies("Mario Bross", "PG", "3");
			movies[3] = new Movies().createMovies("Legend Of Batman", "18", "4");
			movies[4] = new Movies().createMovies("Legend Of Batman II", "12", "5");
			movies[5] = new Movies().createMovies("Unknown", "XX", "6");
			movies[6] = new Movies().createMovies("12 Monkeys", "12", "7");
	}

	@Before
	public void setUp() throws Exception {
		  parent = new ParentalControlService();
		  parent.setClient(client);
		  parent.setMovies(movies);
	}
	
	
	  public ParentalControlServiceTest(String inputNumber, String expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	  @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { new String ("1"), new String("U")},
	         { new String ("5"), "12" },
	         { new String ("4"), "18" },
	         {new String ("3"), "PG" },
	         { new String("23"), "CDD" }
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() throws TitleNotFoundException, TechnicalFailureException {
	      System.out.println("Parameterized Number is : " + inputNumber+" - "+expectedResult);
	      assertEquals(expectedResult, 
	    		 parent.getParentalControlLevel(inputNumber.toString()));
	      
	      //client = new Client().createClient("2", "15");
	  
	   }

}
