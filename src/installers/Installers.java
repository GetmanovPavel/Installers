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
             InstallActDao aktInstallDao = factory.getAktInstallDao();
//        
//     List <InstallAct> installActs = InstallActDao.getInstallActs();
//      for (InstallAct installAct:installActs) {
//          System.out.println(InstallAct.getId()+ " "+InstallAct.getStateNumber()+ " "
//                        +InstallAct.getDate());
//       }
    }
    
}
