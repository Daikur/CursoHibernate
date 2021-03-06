package ejemplo02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Ejemplo02 {

    public static void main(String[] args) {

        SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Profesor profesor = new Profesor(102, "Juan", "Perez", "Garcia");
        //--Session--
        Session session = sessionFactory.openSession();
        //--GUARDAR--
        
//        
//        session.beginTransaction(); //crear nueva transaccion
//        
//        session.save(profesor);
//        
//        session.getTransaction().commit();

        //--LEER--
        Profesor profesorLeer = (Profesor) session.get(Profesor.class, 101);
//        System.out.println(profesorLeer.getNombre());

        //ACTUALIZAR
//        profesorLeer.setNombre("Juanito");
//        session.beginTransaction();
//        session.update(profesorLeer);
//        session.getTransaction().commit();
        
        //--BORRAR--
//        session.beginTransaction();
//        session.delete(profesor);
//        session.getTransaction().commit();
        //--GUARDAR Y ACTUALIZAR --
          
        session.beginTransaction();
        session.saveOrUpdate(profesor);
        session.getTransaction().commit();
    
//        
        session.close();
    
    }

}
