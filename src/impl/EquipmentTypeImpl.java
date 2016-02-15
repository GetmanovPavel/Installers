package impl;

import dao.EquipmentTypeDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.EquipmentType;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class EquipmentTypeImpl implements EquipmentTypeDao {

    @Override
    public void addEquipmentType(EquipmentType equipmentType) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(equipmentType);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteEquipmentType(EquipmentType equipmentType) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(equipmentType);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public EquipmentType getEquipmentType(int id) throws SQLException {
        EquipmentType result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (EquipmentType) session.load(EquipmentType.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<EquipmentType> getEquipmentTypes() throws SQLException {
      List<EquipmentType> equipmentTypes = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          equipmentTypes = session.createCriteria(EquipmentType.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return equipmentTypes;
    }
}
    
