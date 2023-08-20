package runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
	@CucumberOptions(features="src/test/resources/features/",glue={"steps"},tags="@datatable",plugin={"html:target/cucumber-reports/cucumber-html-report.html"})
	public class RunCuCukes extends AbstractTestNGCucumberTests{

	

	
}
