package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class hooks {
	/*
	@BeforeAll
	public static void before_all() {
		System.out.println("@BeforeAll hook");
	}
	
	@AfterAll
	public static void after_all() {
		System.out.println("@AfterAll hook");
	}
	*/
	@Before("@staging")
	public void setUp0() {
		
		System.out.println("setup0");
	}
	/*@Before(order = 1)
	public void setUp1() {
		
		System.out.println("setup1");
	}
	*/
	@After("@staging")
	public void tearDown0() {
		System.out.println("teardown0");
		
	}
	
	/*@After(order = 1)
	public void teardown1() {
		System.out.println("teardown1");
	}
	
	*/
	/*
	@BeforeStep
	public void before_step() {
		System.out.println("@BeforeStep --- beforestep");
	}
	
	@AfterStep
	public void after_step() {
		System.out.println("@AfterStep --- afterstep");
	}

*/
}
