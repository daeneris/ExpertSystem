package ru.margarita.ExpertSystem;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.margarita.ExpertSystem.config.HibernateUtil;

@SpringBootApplication
public class ExpertSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpertSystemApplication.class, args);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
