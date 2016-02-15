package impl;

import dao.EquipmentDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Equipment;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class EquipmentImpl implements EquipmentDao {

    @Override
    public void addEquipment(Equipment equipment) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(equipment);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteEquipment(Equipment equipment) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(equipment);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Equipment getEquipment(int id) throws SQLException {
    Equipment result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Equipment) session.load(Equipment.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        
        return result;
    }

    @Override
    public List<Equipment> getEquipments() throws SQLException {
     List<Equipment> equipments = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          equipments = session.createCriteria(Equipment.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return equipments;
    }
    
}
