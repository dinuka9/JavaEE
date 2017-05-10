package lk.dinuka.hibernate_only_annotation;

import org.hibernate.Session;

import lk.dinuka.hibernate_only_annotation.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	Department department = new Department(5, "Insurance", "Insurance Department");
    	session.saveOrUpdate(department);
        session.getTransaction().commit();
    }
}
