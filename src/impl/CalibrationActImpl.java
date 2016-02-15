package impl;

import dao.CalibrationActDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.CalibrationAct;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class CalibrationActImpl implements CalibrationActDao {

    @Override
    public void addCalibrationAct(CalibrationAct calibrationAct) throws SQLException {
      Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(calibrationAct);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteCalibrationAct(CalibrationAct calibrationAct) throws SQLException {
           Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(calibrationAct);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public CalibrationAct getCalibrationAct(int id) throws SQLException {
    CalibrationAct result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (CalibrationAct) session.load(CalibrationAct.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        
        return result;
    }

    @Override
    public List<CalibrationAct> getCalibrationActs() throws SQLException {
        List<CalibrationAct> calibrationActs = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          calibrationActs = session.createCriteria(CalibrationAct.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return calibrationActs;
    }
}
    

