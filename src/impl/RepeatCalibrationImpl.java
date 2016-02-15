package impl;

import dao.RepeatCalibrationDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.RepeatCalibration;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class RepeatCalibrationImpl implements RepeatCalibrationDao {

    @Override
    public void addRepeatCalibration(RepeatCalibration repeatCalibration) throws SQLException {
      Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(repeatCalibration);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteRepeatCalibration(RepeatCalibration repeatCalibration) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(repeatCalibration);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public RepeatCalibration getRepeatCalibration(int id) throws SQLException {
        RepeatCalibration result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (RepeatCalibration) session.load(RepeatCalibration.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<RepeatCalibration> getRepeatCalibrations() throws SQLException {
    List<RepeatCalibration> repeatCalibrations = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          repeatCalibrations = session.createCriteria(RepeatCalibration.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return repeatCalibrations;
    }
    
}
