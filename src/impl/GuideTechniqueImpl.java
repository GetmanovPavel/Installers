package impl;

import dao.GuideTechniqueDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.GuideTechnique;
import util.HibernateUtil;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class GuideTechniqueImpl implements GuideTechniqueDao {

    @Override
    public void addGuideTechnique(GuideTechnique guideTechnique) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(guideTechnique);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteGuideTechnique(GuideTechnique guideTechnique) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(guideTechnique);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public GuideTechnique getGuideTechnique(int id) throws SQLException {
     GuideTechnique result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (GuideTechnique) session.load(GuideTechnique.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<GuideTechnique> getGuideTechniques() throws SQLException {
        List<GuideTechnique> guideTechniques = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          guideTechniques = session.createCriteria(GuideTechnique.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return guideTechniques;
    }
    
}
