package impl;

import dao.FillingDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Filling;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class FillingImpl implements FillingDao {

    @Override
    public void addFilling(Filling flling) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(flling);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteFilling(Filling filling) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(filling);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Filling getFilling(int id) throws SQLException {
        Filling result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Filling) session.load(Filling.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Filling> getFillings() throws SQLException {
        List<Filling> fillings = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          fillings = session.createCriteria(Filling.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return fillings;
    }
}
