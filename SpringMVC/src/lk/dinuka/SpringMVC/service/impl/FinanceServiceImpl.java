package lk.dinuka.SpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.dinuka.SpringMVC.domain.Expense;
import lk.dinuka.SpringMVC.domain.dao.ExpenseDAO;
import lk.dinuka.SpringMVC.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	ExpenseDAO expenseDAO;

	@Override
	public String getBudget() {
		return "success";
	}

	@Override
	public String addExpense(Expense expense) {
		String name = expense.getItemName();
		expense.setItemName(name.toUpperCase());
		return expenseDAO.addExpense(expense);
	}

	@Override
	public List<Expense> getExpense() {

		List<Expense> expenseList = expenseDAO.getExpense();

//		for (Expense expense : expenseList) {
//			System.out.println(expense.getItemName());
//		}
		
		return expenseList;
	}

}
