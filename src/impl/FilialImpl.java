package impl;

import dao.FilialDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Filial;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class FilialImpl implements FilialDao {

    @Override
    public void addFilial(Filial filial) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(filial);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteFilial(Filial filial) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(filial);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Filial getFilial(int id) throws SQLException {
        Filial result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Filial) session.load(Filial.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Filial> getFilials() throws SQLException {
        List<Filial> filials = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          filials = session.createCriteria(Filial.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return filials;
    }
    
}
