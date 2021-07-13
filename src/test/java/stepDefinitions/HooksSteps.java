package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import library.Driver;
import pages.HooksPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HooksSteps extends Driver {


    HooksPage myHooksPage = new HooksPage();
    String baseUrl = "https://www.mortgagecalculator.net/";
    String expectedTitle = "Mortgage Calculator 2021 - FREE Calculator Tool (ZERO Ads)";


    @Before
    public void setup() {
        myHooksPage.setUp();
        driver.get(baseUrl);
        assertThat(driver.getCurrentUrl(), equalTo(baseUrl));
        assertThat(driver.getTitle(), equalTo(expectedTitle));
    }

    @After
    public void tearDown() {
        myHooksPage.tearDown();
    }

}
