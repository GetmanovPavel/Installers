package impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;
import dao.InstallActDao;
import table.InstallAct;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class InstallActImpl implements InstallActDao{

    @Override
    public void addInstallAct(InstallAct installAct) throws SQLException {
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.save(installAct);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
       
    }

    @Override
    public void deleteInstallAct(InstallAct installAct) throws SQLException {
          Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          session.beginTransaction();
          session.delete(installAct);
          session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
    }

    @Override
    public InstallAct getInstallAct(int id) throws SQLException {
        InstallAct result = null;
        Session session = null;
        try{
          session= HibernateUtil.getSessionFactory().openSession();
          result = (InstallAct) session.load(InstallAct.class,id);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        
        return result;
    }

    @Override
    public List<InstallAct> getInstallActs() throws SQLException {
        List<InstallAct> installActs = null;
        
        Session session= null;
         try{
          session= HibernateUtil.getSessionFactory().openSession();
          installActs = session.createCriteria(InstallAct.class).list();
          
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return installActs;
    }
    
}
