package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Pages;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class HomeStep {
    Pages page;

    @Given("User open application")
    public void user_open_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user has open the application");
    }
    @When("User on welcome screen")
    public void user_on_welcome_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Welcome");
    }
    @Given("User on welcome page")
    public void user_on_welcome_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("ml");
    }
    @Then("I login with {string} and {string}")
    public void i_login_with_and(String username, String pwd) {
       // System.out.println("My crendital::" +username + "and my password is ::"+pwd);
         page =new Pages();
        page.sam(username, pwd);
    }
    @Then("I login with joe and ml@{int}")
    public void i_login_with_joe_and_ml(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sc");
    }
    @Given("I enter my credentials")
    public void i_enter_my_credentials(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists(String.class);
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
       // System.out.println(list.get(0).get(2));
            }
    @Then("i verify login failed")
    public void i_verify_login_failed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("table");
    }



}
