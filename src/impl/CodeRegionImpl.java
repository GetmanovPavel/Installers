package impl;

import dao.CodeRegionDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.CalibrationAct;
import table.CodeRegion;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class CodeRegionImpl implements CodeRegionDao {

    @Override
    public void addCodeRegion(CodeRegion codeRegion) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(codeRegion);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteCodeRegion(CodeRegion codeRegion) throws SQLException {
           Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(codeRegion);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public CodeRegion getCodeRegion(int id) throws SQLException {
        CodeRegion result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (CodeRegion) session.load(CodeRegion.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        //    if((session!=null)&&(session.isOpen())) session.close();
        }
        
        return result;
    }

    @Override
    public List<CodeRegion> getCodeRegions() throws SQLException {
        List<CodeRegion> codeRegions = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          codeRegions = session.createCriteria(CodeRegion.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return codeRegions;
    }
    
}
