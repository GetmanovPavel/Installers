package impl;

import dao.VehicleDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Vehicle;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class VehicleImpl implements VehicleDao {

    @Override
    public void addVehicle(Vehicle vehicle) throws SQLException {
         Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(vehicle);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteVehicle(Vehicle vehicle) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(vehicle);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Vehicle getVehicle(int id) throws SQLException {
        Vehicle result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Vehicle) session.load(Vehicle.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Vehicle> getVehicles() throws SQLException {
        List<Vehicle> vehicles = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          vehicles = session.createCriteria(Vehicle.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return vehicles;
    }
    
}
