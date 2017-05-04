package lk.dinuka.SpringMVC.service;

import java.util.List;

import lk.dinuka.SpringMVC.domain.Expense;

public interface FinanceService {
	
	public String getBudget();
	public String addExpense(Expense expense);
	public List<Expense> getExpense();
	
}
