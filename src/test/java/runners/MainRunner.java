package runners;

		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

/**
 * Created by pAmbekar on 27-06-2021
 * 
 */

 
 

@RunWith(Cucumber.class) 
 
@CucumberOptions(features="src\\test\\resources\\features",glue={"stepDefinitions"},format = {"pretty", "html:target/Destination"} )


public class MainRunner {}