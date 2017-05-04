package com.esoft.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.esoft.dao.LoginDAO;
import com.esoft.model.Login;
import org.hibernate.Query;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public String varifyUser(String username, String password) {
        Query query = getSession().createQuery("FROM tbl_login WHERE username= :uname ");
        query.setParameter("uname", username);

        Login user = (Login) query.uniqueResult();

        String isVerified = "";
        if (user == null) {
            isVerified = "invalid";
        }
        else if ((user.getUsername().toString()).equals(username) && user.getPassword().toString().equals(password)) {
            isVerified = "valid";
        } else {
            isVerified = "invalid";
        }
        System.out.println("status : " + isVerified);
        return isVerified;
    }
}
