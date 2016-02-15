package impl;

import dao.FlsNotCenteredDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.FlsNotCentered;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class FlsNotCenteredImpl implements FlsNotCenteredDao {

    @Override
    public void addFlsNotCentered(FlsNotCentered flsNotCentered) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(flsNotCentered);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteFlsNotCentered(FlsNotCentered flsNotCentered) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(flsNotCentered);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public FlsNotCentered getFlsNotCentered(int id) throws SQLException {
        FlsNotCentered result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (FlsNotCentered) session.load(FlsNotCentered.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }
    
    @Override
    public List<FlsNotCentered> getFlsNotCentereds() throws SQLException {
       List<FlsNotCentered> flsNotCentereds = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          flsNotCentereds = session.createCriteria(FlsNotCentered.class).list();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return flsNotCentereds;
    }
}    
