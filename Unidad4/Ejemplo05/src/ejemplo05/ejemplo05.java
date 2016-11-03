package ejemplo05;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ejemplo05 {

    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Profesor profesor = new Profesor("Gabriel", "Sáez", "Izquierdo");
        Profesor profesor1 = new Profesor("David", "Ortega", "Sanchez");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(profesor);
        session.save(profesor1);

        session.getTransaction().commit();
        session.close();

    }

}
