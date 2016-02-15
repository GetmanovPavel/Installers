package impl;

import dao.TypeSealDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.TypeSeal;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class TypeSealImpl implements TypeSealDao {

    @Override
    public void addTypeSeal(TypeSeal typeSeal) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(typeSeal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteTypeSeal(TypeSeal typeSeal) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(typeSeal);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public TypeSeal getTypeSeal(int id) throws SQLException {
        TypeSeal result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (TypeSeal) session.load(TypeSeal.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<TypeSeal> getTypeSeals() throws SQLException {
        List<TypeSeal> typeSeals = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          typeSeals = session.createCriteria(TypeSeal.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return typeSeals;
    }
    
}
