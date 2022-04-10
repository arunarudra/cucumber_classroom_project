package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

public class CalculatorSteps {
	int result=0;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside calculator application");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	    result=int1+int2;
	}

	@Then("sum should be displayed as {int}")
	public void sum_should_be_displayed_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(res, result);
	}

	@When("I subtract {int} and {int}")
	public void i_subtract_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	    result= int1-int2;
	}

	@Then("result should be displayed as {int}")
	public void result_should_be_displayed_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(res, result);
	}
	
	@When("I add  below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
	    int rows= dataTable.height();
	    for(int i=0;i<rows;i++) {
	    	result=result+Integer.parseInt(dataTable.cell(i, 0));
	    }
	}
	
	@When("I add  below numbers using List")
	public void i_add_below_numbers_using_List(List<Integer> numbers) {
	    
		for(int num: numbers) {
			result=result+num;
	    }
	}
	
	@When("I order below items")
	public void i_order_below_items(Map<String,Integer> pricelist) {
		
		for(String key:pricelist.keySet()) {
			result=result+pricelist.get(key);
		}
	    
	}

	@Then("Order total should be {int}")
	public void order_total_should_be(int res) {
		
		Assert.assertEquals(res, result);
	    
	}
	
	@When("I order below items and quantity")
	public void i_order_below_items_and_quantity(DataTable table) {
	    int rows=table.height();
	    int j=1;
	    List <List<String>> tableList=table.cells();
	    for(int i=0;i<rows;i++) {
	    	result=result+(Integer.parseInt(table.cell(i, j))*Integer.parseInt(table.cell(i, j+1)));
	    	j=1;
	    }
		
	}
}
	