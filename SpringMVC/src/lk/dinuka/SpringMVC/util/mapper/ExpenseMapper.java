package lk.dinuka.SpringMVC.util.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import lk.dinuka.SpringMVC.domain.Expense;

public class ExpenseMapper implements RowMapper<Expense>{

	@Override
	public Expense mapRow(ResultSet resultSet, int i) throws SQLException {
		Expense expense = new Expense();
		expense.setId(resultSet.getInt(1));
		expense.setItemName(resultSet.getString(2));
		expense.setItemAmount(resultSet.getDouble(3));
		return expense;
	}

}
