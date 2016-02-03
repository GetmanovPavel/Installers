package installers;

import impl.InstallActImpl;
import table.InstallAct;
import dao.InstallActDao;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class Factory {
    public static Factory instance = new Factory();
    public InstallActDao installActDao;
    
    
    private Factory(){
    
    }
    public static Factory getInstance(){
        return Factory.instance;
    }
    
    public InstallActDao getInstallActDao(){
        if (installActDao == null) installActDao = new InstallActImpl();
        return installActDao;
    }
}

