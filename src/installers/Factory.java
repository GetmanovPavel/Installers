package installers;

import dao.CalibrationActDao;
import dao.CalibrationDao;
import dao.CodeRegionDao;
import dao.EquipmentDao;
import dao.EquipmentTypeDao;
import dao.FilialDao;
import dao.FillingDao;
import dao.FlsNotCenteredDao;
import dao.GpsDao;
import dao.GsmDao;
import dao.GuideTechniqueDao;
import dao.ImagesDao;
import impl.InstallActImpl;
import dao.InstallActDao;
import dao.OrganizationDao;
import dao.PersonalDao;
import dao.PurposeSealDao;
import dao.ReceiveDao;
import dao.RepeatCalibrationDao;
import dao.TypeSealDao;
import dao.VehicleDao;
import impl.CalibrationActImpl;
import impl.CalibrationImpl;
import impl.CodeRegionImpl;
import impl.EquipmentImpl;
import impl.EquipmentTypeImpl;
import impl.FilialImpl;
import impl.FlsNotCenteredImpl;
import impl.GpsImpl;
import impl.GsmImpl;
import impl.GuideTechniqueImpl;
import impl.ImagesImpl;
import impl.OrganizationImpl;
import impl.PersonalImpl;
import impl.PurposeSealImpl;
import impl.ReceiveImpl;
import impl.RepeatCalibrationImpl;
import impl.TypeSealImpl;
import impl.VehicleImpl;


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
    public EquipmentDao equipmentDao;
    public EquipmentTypeDao equipmentTypeDao;
    public FilialDao filialDao;
    public FillingDao fillingDao;
    public FlsNotCenteredDao flsNotCenteredDao;
    public GpsDao gpsDao;
    public GsmDao gsmDao;
    public GuideTechniqueDao guideTechniqueDao;
    public ImagesDao imagesDao;
    public OrganizationDao organizationDao;
    public PersonalDao personalDao;
    public PurposeSealDao purposeSealDao;
    public RepeatCalibrationDao repeatCalibrationDao;
    public TypeSealDao typeSealDao;
    public VehicleDao vehicleDao;
    public ReceiveDao receiveDao;
    
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
     public EquipmentDao getEquipmentDao(){
        if (equipmentDao == null) equipmentDao = new EquipmentImpl();
        return equipmentDao;
    }
     public EquipmentTypeDao getEquipmentTypeDao(){
        if (equipmentTypeDao == null) equipmentTypeDao = new EquipmentTypeImpl();
        return equipmentTypeDao;
    }
     public FilialDao getFilialDao(){
        if (filialDao == null) filialDao = new FilialImpl();
        return filialDao;
    }
     
      public FlsNotCenteredDao getFlsNotCenteredDao(){
        if (flsNotCenteredDao == null) flsNotCenteredDao = new FlsNotCenteredImpl();
        return flsNotCenteredDao;
    }
      
       public GpsDao getGpsDao(){
        if (gpsDao == null) gpsDao = new GpsImpl();
        return gpsDao;
    }
        public GsmDao getGsmDao(){
        if (gsmDao == null) gsmDao = new GsmImpl();
        return gsmDao;
    }
        
        public GuideTechniqueDao getGuideTechniqueDao(){
        if (guideTechniqueDao == null) guideTechniqueDao = new GuideTechniqueImpl();
        return guideTechniqueDao;
    }    
        public ImagesDao getImagesDao(){
        if (imagesDao == null) imagesDao = new ImagesImpl();
        return imagesDao;
    }  
        public OrganizationDao getOrganizationDao(){
        if (organizationDao == null) organizationDao = new OrganizationImpl();
        return organizationDao;
    }  
        public PersonalDao getPersonalDao(){
        if (personalDao == null) personalDao = new PersonalImpl();
        return personalDao;
    } 
        public PurposeSealDao getPurposeSealDao(){
        if (purposeSealDao == null) purposeSealDao = new PurposeSealImpl();
        return purposeSealDao;
    }
        public RepeatCalibrationDao getRepeatCalibrationDao(){
        if (repeatCalibrationDao == null) repeatCalibrationDao = new RepeatCalibrationImpl();
        return repeatCalibrationDao;
    }
        public TypeSealDao getTypeSealDao(){
        if (typeSealDao == null) typeSealDao = new TypeSealImpl();
        return typeSealDao;
    }
        public VehicleDao getVehicleDao(){
        if (vehicleDao == null) vehicleDao = new VehicleImpl();
        return vehicleDao;
    }
        public ReceiveDao getReceiveDao(){
        if (receiveDao == null) receiveDao = new ReceiveImpl();
        return receiveDao;
    }
}

