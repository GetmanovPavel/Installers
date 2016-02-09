/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import dao.CalibrationDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Calibration;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class CalibrationImpl implements CalibrationDao{

    @Override
    public void addCalibration(Calibration calibration) throws SQLException {
          Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(calibration);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteCalibration(Calibration calibration) throws SQLException {
           Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(calibration);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Calibration getCalibration(int id) throws SQLException {
        Calibration result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Calibration) session.load(Calibration.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        
        return result;
    }

    @Override
    public List<Calibration> getCalibrations() throws SQLException {
        List<Calibration> calibrations = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          calibrations = session.createCriteria(Calibration.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return calibrations;
    }
    
}
