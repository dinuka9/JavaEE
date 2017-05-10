package lk.dinuka.hibernate_only_xml.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//dinuka9@hotmail.com

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();

			// Hibernate 3.x.x
			// sessionFactory = new
			// Configuration().configure().buildSessionFactory();

			// Hibernate 4.0, 4.1, 4.2
			// ServiceRegistry serviceRegistry = new
			// ServiceRegistryBuilder().applySettings(
			// configuration.getProperties()). buildServiceRegistry();

			// Hibernate 4.3
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
