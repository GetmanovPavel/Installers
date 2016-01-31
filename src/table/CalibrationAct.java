package table;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="CalibrationAct")
public class CalibrationAct {
    
    /**
    * Ключевое поле
    * номер
    */
    @Id
    @Column (name="id")
    private int id;
    
    
    /**
   
    * ссылка на акт мотажа по номеру внутри телеметрикс, а акты тарировки просто нумерую и добавляю ссылке на людей
    */
    
    /**
    * Подразделение
    */
    @Column (name="idUnits")
    private Units idUnits;
    /**
    * Место установки
    */
    @Column (name="installPlace")
    private String installPlace;
    /**
    * Дата заполнения акта
    */
    @Column (name="date")
    private Date date;
//    /**
//    * Id бригады тарировщиков
//    */
//    @Column (name="idBrigade")
//    private Brigade idBrigade;
    /**
    * Государственный номер
    */
    @Column (name="stateNumber")
    private Vehicle stateNumber;
    /**
    * Номер автографа
    */
    @Column (name="avtografNumber")
    private String avtografNumber;
    /**
    * Количество топливных баков
    */
    @Column (name="tanksNumber")
    private int tanksNumber;
    /**
    * Тарировка
    */
    @Column (name="calibration")
    private Calibration calibration;
    // решить вопрос с сущностью повторной тарировки
    
    @Column (name="repeatCalibration")
    private RepeatCalibration repeatCalibration;
    /**
    * Температура окружающей среды
    */
    @Column (name="ambientTemperature")
    private double ambientTemperature;
    /**
    * Температура топлива
    */
    @Column (name="fuelTemperature")
    private double fuelTemperature; 
    /**
    *Состояние топлива слито/не слито
    */ 
    @Column (name="fuelCondition")
    private boolean fuelCondition; 
    /**
    *Объем слитого топлива
    */  
    @Column (name="fuelVolumeStolen")
    private double fuelVolumeStolen; 
    /**
    *Объем бака
    */ 
    @Column (name="tankVolume")
    private double tankVolume;  
    
    /**
    *Государственный номер топливозаправщика предоставившего топливо
    */     
    @Column (name="stateNumberTanker")
    private Vehicle stateNumberTanker;    
    /**
    *Количество топлива для тарировки
    */ 
    @Column (name="calibrationFuelVolume")
    private double calibrationFuelVolume; 
    /**
    *Заполненность бака в %
    */
    @Column (name="fuelLevel")
    private double fuelLevel; 
    /**
    *Наличие бумажной тарировки
    */ 
    @Column (name="paperCalibration")
    private boolean paperCalibration; 
    /**
    *Наличие тарировки в мониторинге
    */ 
    @Column (name="monitoringCalibration")
    private boolean monitoringCalibration;
    /**
    *Наличие паспорта
    */
    @Column (name="passport")
    private boolean passport;
    /**
    *Дут не по центру
    */
    @Column (name="idFlsNotCentered")
    private FlsNotCentered idFlsNotCentered;
    /**
    *Комментарий
    */
    @Column (name="description")
    private String description;
    /**
    *Серийный номер контроллера
    */
    @Column (name="controllerSerialNumber")
    private InstallAct controllerSerialNumber;
    /**
    *Флаг заполненности акта
    */
    @Column (name="completenessFlag")
    private boolean completenessFlag;
    /**
    * Причина тарировки
    */
    @Column (name="reasonCalibration")
    private String reasonCalibration;

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Filial getFilial() {
        return filial;
    }

    public String getInstallPlace() {
        return installPlace;
    }

    public Date getDate() {
        return date;
    }

    public Brigade getIdBrigade() {
        return idBrigade;
    }

    public Vehicle getStateNumber() {
        return stateNumber;
    }

    public String getAvtografNumber() {
        return avtografNumber;
    }

    public int getTanksNumber() {
        return tanksNumber;
    }

    public Calibration getCalibration() {
        return calibration;
    }

    public double getAmbientTemperature() {
        return ambientTemperature;
    }

    public double getFuelTemperature() {
        return fuelTemperature;
    }

    public boolean isFuelCondition() {
        return fuelCondition;
    }

    public double getFuelVolumeStolen() {
        return fuelVolumeStolen;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public Vehicle getStateNumberTanker() {
        return stateNumberTanker;
    }

    public double getCalibrationFuelVolume() {
        return calibrationFuelVolume;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isPaperCalibration() {
        return paperCalibration;
    }

    public boolean isMonitoringCalibration() {
        return monitoringCalibration;
    }

    public boolean isPassport() {
        return passport;
    }

    public FlsNotCentered getIdFlsNotCentered() {
        return idFlsNotCentered;
    }

    public String getDescription() {
        return description;
    }

    public InstallAct getControllerSerialNumber() {
        return controllerSerialNumber;
    }

    public boolean isCompletenessFlag() {
        return completenessFlag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public void setInstallPlace(String installPlace) {
        this.installPlace = installPlace;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIdBrigade(Brigade idBrigade) {
        this.idBrigade = idBrigade;
    }

    public void setStateNumber(Vehicle stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setAvtografNumber(String avtografNumber) {
        this.avtografNumber = avtografNumber;
    }

    public void setTanksNumber(int tanksNumber) {
        this.tanksNumber = tanksNumber;
    }

    public void setCalibration(Calibration calibration) {
        this.calibration = calibration;
    }

    public void setAmbientTemperature(double ambientTemperature) {
        this.ambientTemperature = ambientTemperature;
    }

    public void setFuelTemperature(double fuelTemperature) {
        this.fuelTemperature = fuelTemperature;
    }

    public void setFuelCondition(boolean fuelCondition) {
        this.fuelCondition = fuelCondition;
    }

    public void setFuelVolumeStolen(double fuelVolumeStolen) {
        this.fuelVolumeStolen = fuelVolumeStolen;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setStateNumberTanker(Vehicle stateNumberTanker) {
        this.stateNumberTanker = stateNumberTanker;
    }

    public void setCalibrationFuelVolume(double calibrationFuelVolume) {
        this.calibrationFuelVolume = calibrationFuelVolume;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setPaperCalibration(boolean paperCalibration) {
        this.paperCalibration = paperCalibration;
    }

    public void setMonitoringCalibration(boolean monitoringCalibration) {
        this.monitoringCalibration = monitoringCalibration;
    }

    public void setPassport(boolean passport) {
        this.passport = passport;
    }

    public void setIdFlsNotCentered(FlsNotCentered idFlsNotCentered) {
        this.idFlsNotCentered = idFlsNotCentered;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setControllerSerialNumber(InstallAct controllerSerialNumber) {
        this.controllerSerialNumber = controllerSerialNumber;
    }

    public void setCompletenessFlag(boolean completenessFlag) {
        this.completenessFlag = completenessFlag;
    } 
}
