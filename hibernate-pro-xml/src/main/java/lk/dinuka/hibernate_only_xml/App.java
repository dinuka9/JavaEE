package lk.dinuka.hibernate_only_xml;

import org.hibernate.Session;

import lk.dinuka.hibernate_only_xml.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	Department department = new Department(4, "Marketing", "Marketing Department");
    	session.saveOrUpdate(department);
        session.getTransaction().commit();
    }
}
