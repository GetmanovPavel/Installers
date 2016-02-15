package impl;

import dao.ReceiveDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Receive;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class ReceiveImpl implements ReceiveDao {

    @Override
    public void addReceive(Receive receive) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(receive);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteReceive(Receive receive) throws SQLException {
     Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(receive);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Receive getReceive(int id) throws SQLException {
        Receive result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Receive) session.load(Receive.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Receive> getReceives() throws SQLException {
        List<Receive> receives = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          receives = session.createCriteria(Receive.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return receives;
    }
    
}
