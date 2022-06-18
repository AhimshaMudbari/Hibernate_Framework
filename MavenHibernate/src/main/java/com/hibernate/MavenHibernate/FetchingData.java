package com.hibernate.MavenHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		// get for data fetching ---> in case data not found return null
		DirectorName dn = (DirectorName) session.get(DirectorName.class, 1);
		System.out.println(dn.getAddedDate() + " : " + dn.getFirstName());

		// load for data fetching ---> in case data not found return exception
		Movie movie = (Movie) session.load(Movie.class, 1);
		System.out.println(movie);
		session.close();
		factory.close();
	}

}
