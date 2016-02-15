package impl;

import dao.OrganizationDao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import table.Organization;
import util.HibernateUtil;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class OrganizationImpl implements OrganizationDao {

    @Override
    public void addOrganization(Organization organization) throws SQLException {
      Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(organization);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public void deleteOrganization(Organization organization) throws SQLException {
    Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(organization);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public Organization getOrganization(int id) throws SQLException {
        Organization result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (Organization) session.load(Organization.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return result;
    }

    @Override
    public List<Organization> getOrganizations() throws SQLException {
        List<Organization> organizations = null;
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          organizations = session.createCriteria(Organization.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return organizations;
    }
    
}
