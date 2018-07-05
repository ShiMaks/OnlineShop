package by.htp.shop.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class SessionFactoryManager {
	
	private static final String configXml = "hibernate.cfg.xml";

	@Bean
	public SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure(configXml);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}