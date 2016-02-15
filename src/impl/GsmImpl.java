package impl;

import dao.GsmDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Gsm;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class GsmImpl implements GsmDao {
    
    @Override
    public void addGsm(Gsm gsm) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(gsm);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteGsm(Gsm gsm) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(gsm);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Gsm getGsm(int id) throws SQLException {
    Gsm result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Gsm) session.load(Gsm.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Gsm> getGsms() throws SQLException {
       List<Gsm> gsms = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          gsms = session.createCriteria(Gsm.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return gsms;
    }
}
