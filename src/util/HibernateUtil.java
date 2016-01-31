
package util;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    
    private HibernateUtil(){}
    
   static{
       try{
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
       }catch(Throwable e){
            throw new ExceptionInInitializerError(e);
        } 
    
    }
    
    public static SessionFactory getSessionFactory(){
            return sessionFactory;
    }
}

