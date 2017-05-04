package lk.dinuka.SpringMVC.domain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import lk.dinuka.SpringMVC.domain.Expense;
import lk.dinuka.SpringMVC.domain.dao.ExpenseDAO;
import lk.dinuka.SpringMVC.util.mapper.ExpenseMapper;

@Repository
public class ExpenseDAOImol implements ExpenseDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public String addExpense(Expense expense) {

		System.out.println("Expense addes successfully : " + expense.getItemName());

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String SQL = "INSERT INTO tbl_expense (itemName, itmeAmount) VALUES (?,?)";

		try {
			jdbcTemplate.update(SQL, expense.getItemName(), expense.getItemAmount());
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

		return "success";
	}

	@Override
	public List<Expense> getExpense() {
		List<Expense> allExpenses = null;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String SQL = "SELECT * FROM tbl_expense";

		try {
//			allExpenses = jdbcTemplate.query(SQL, new RowMapper<Expense>() {
//				@Override
//				public Expense mapRow(ResultSet resultSet, int i) throws SQLException {
//					Expense expense = new Expense();
//					expense.setItemName(resultSet.getString(2));
//					expense.setItemAmount(resultSet.getDouble(3));
//					return expense;
//				}
//			});
			allExpenses = jdbcTemplate.query(SQL, new ExpenseMapper());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return allExpenses;
	}
}



