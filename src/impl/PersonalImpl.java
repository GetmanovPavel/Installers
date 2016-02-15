package impl;

import dao.PersonalDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Personal;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class PersonalImpl implements PersonalDao {

    @Override
    public void addPersonal(Personal personal) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(personal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deletePersonal(Personal personal) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(personal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Personal getPersonal(int id) throws SQLException {
     Personal result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Personal) session.load(Personal.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Personal> getPersonals() throws SQLException {
     List<Personal> personals = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          personals = session.createCriteria(Personal.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return personals;
    }
    
}
