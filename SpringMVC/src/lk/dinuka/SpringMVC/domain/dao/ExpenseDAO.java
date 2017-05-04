package lk.dinuka.SpringMVC.domain.dao;

import java.util.List;

import lk.dinuka.SpringMVC.domain.Expense;

public interface ExpenseDAO {
	public String addExpense(Expense expense);
	public List<Expense> getExpense();
}
