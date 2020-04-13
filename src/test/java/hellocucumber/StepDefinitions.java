package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
class IsItDay {
    static String isItFriday(String today) {
        if (today.equals("Friday")){
            return "Yes";
        }
        else {
            return "Nope";
        }
    }

    static String isItMonday(String today){
        if (today.equals("Monday")){
            return "Yes";
        }
        else {
            return "Nope";
        }
    }

}
public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is Monday")
    public void todayIsMonday() {
        today = "Monday";
    }

    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItIsFridayYet() {
        actualAnswer = IsItDay.isItFriday(today);
    }


    @When("I ask whether it's Monday yet")
    public void iAskWhetherItSMondayYet() {
        actualAnswer = IsItDay.isItMonday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
