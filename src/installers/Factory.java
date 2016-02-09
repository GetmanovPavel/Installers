package installers;

import dao.CalibrationActDao;
import dao.CalibrationDao;
import dao.CodeRegionDao;
import impl.InstallActImpl;
import dao.InstallActDao;
import impl.CalibrationActImpl;
import impl.CalibrationImpl;
import impl.CodeRegionImpl;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class Factory {
    public static Factory instance = new Factory();
    public InstallActDao installActDao;
    public CalibrationDao calibrationDao;
    public CalibrationActDao calibrationActDao;
    public CodeRegionDao codeRegionDao;
    
    private Factory(){
    
    }
    public static Factory getInstance(){
        return Factory.instance;
    }
    
    public InstallActDao getInstallActDao(){
        if (installActDao == null) installActDao = new InstallActImpl();
        return installActDao;
    }
    
    public CalibrationDao getCalibrationDao(){
        if (calibrationDao == null) calibrationDao = new CalibrationImpl();
        return calibrationDao;
    }
    
     public CalibrationActDao getCalibrationActDao(){
        if (calibrationActDao == null) calibrationActDao = new CalibrationActImpl();
        return calibrationActDao;
    }
     
     public CodeRegionDao getCodeRegionDao(){
        if (codeRegionDao == null) codeRegionDao = new CodeRegionImpl();
        return codeRegionDao;
    }
}

