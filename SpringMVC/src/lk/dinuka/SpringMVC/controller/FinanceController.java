package lk.dinuka.SpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lk.dinuka.SpringMVC.domain.Expense;
import lk.dinuka.SpringMVC.service.FinanceService;

@Controller
public class FinanceController {

	// this injects a FinanceService instance
	// must use @Service in FinanceServiceImpl
	// or this wouldnt be autowired correctly
	// there can be only one impl of the interface
	@Autowired
	FinanceService financeservice;

	// this will be called if the url is localhsot/project/getBudget
	@RequestMapping(value = "/getBudget", method = RequestMethod.GET)
	public String getBudget(ModelMap model) {

		// put the attributes into model to send to budget.jsp
		// view them with ${}
		// model.addAttribute("message", "hello world !");

		String result = financeservice.getBudget();
		if (result.equals("success")) {
			model.addAttribute("message", "hello world !");
			return "budget";
		} else {
			model.addAttribute("message", "something went wrong !");
			return "error";
		}

	}

	@RequestMapping(value = "/expense", method = RequestMethod.POST)
	public String addExpense(ModelMap model, @ModelAttribute Expense expense) {
		// @ModelAttribute can get a Expense object created with req parameters

		String result = financeservice.addExpense(expense);

		if (result.equals("success")) {
			model.addAttribute("message", expense.getItemName());
			return "budget";
		} else {
			model.addAttribute("message", "somthing went wrong");
			return "error";
		}

	}

	@RequestMapping(value = "/getExpense", method = RequestMethod.GET)
	public String getExpense(ModelMap model) {

		List<Expense> expenseList = financeservice.getExpense();

		for (Expense expense : expenseList) {
			System.out.println(expense.getItemName());
		}
		model.addAttribute("expenses", expenseList);
		return "expensesList";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRoot() {
		return "budget";
	}
	
}
