package impl;

import dao.PurposeSealDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.PurposeSeal;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class PurposeSealImpl implements PurposeSealDao {

    @Override
    public void addPurposeSeal(PurposeSeal purposeSeal) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(purposeSeal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deletePurposeSeal(PurposeSeal purposeSeal) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(purposeSeal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public PurposeSeal getPurposeSeal(int id) throws SQLException {
       PurposeSeal result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (PurposeSeal) session.load(PurposeSeal.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<PurposeSeal> getPurposeSeals() throws SQLException {
        List<PurposeSeal> purposeSeals = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          purposeSeals = session.createCriteria(PurposeSeal.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return purposeSeals;
    }
    
}
