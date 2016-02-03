package installers;

import java.sql.SQLException; 
import java.util.List;
import table.InstallAct;
import dao.InstallActDao;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class Installers {

    public static void main(String[] args) throws SQLException {
            Factory factory = Factory.getInstance();
             InstallActDao aktInstallDao = factory.getInstallActDao();
        
   List <InstallAct> installActs = aktInstallDao.getInstallActs();
      for (InstallAct installAct:installActs) {
         System.out.println(installAct.getDate()+" " );
       }
    }
    
}
