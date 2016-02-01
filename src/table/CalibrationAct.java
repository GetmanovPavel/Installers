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
    * Номер
    */
    @Id
    @Column (name="id")
    private int id;
    
    /**
    * Дата заполнения акта
    */
    @Column (name="date")
    private Date date;
    
    /**
    * Подразделение
    */
    @Column (name="idUnits")
    private Units idUnits;
    
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
    * Место установки
    */
    @Column (name="installPlace")
    private String installPlace;
    
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
    *Государственный номер топливозаправщика, предоставившего топливо
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
    *Серийный номер контроллера
    */
    @Column (name="controllerSerialNumber")
    private InstallAct controllerSerialNumber;
    
    /**
    * Тарировка
    */
    @Column (name="calibration")
    private Calibration calibration;
    
    /**
    * Повторная Тарировка
    */
    @Column (name="repeatCalibration")
    private RepeatCalibration repeatCalibration;
    
    /**
    * Причина тарировки
    */
    @Column (name="reasonCalibration")
    private String reasonCalibration;
    
    /**
    * Тарировка сделана заказчиком 
    */
    @Column (name="customerCalibration")
    private boolean customerCalibration;

    /**
    *Комментарий
    */
    @Column (name="description")
    private String description;
    
    /**
    *Флаг заполненности акта
    */
    @Column (name="completenessFlag")
    private boolean completenessFlag;

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIdUnits(Units idUnits) {
        this.idUnits = idUnits;
    }

    public void setStateNumber(Vehicle stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setInstallPlace(String installPlace) {
        this.installPlace = installPlace;
    }

    public void setAvtografNumber(String avtografNumber) {
        this.avtografNumber = avtografNumber;
    }

    public void setTanksNumber(int tanksNumber) {
        this.tanksNumber = tanksNumber;
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

    public void setControllerSerialNumber(InstallAct controllerSerialNumber) {
        this.controllerSerialNumber = controllerSerialNumber;
    }

    public void setCalibration(Calibration calibration) {
        this.calibration = calibration;
    }

    public void setRepeatCalibration(RepeatCalibration repeatCalibration) {
        this.repeatCalibration = repeatCalibration;
    }

    public void setReasonCalibration(String reasonCalibration) {
        this.reasonCalibration = reasonCalibration;
    }

    public void setCustomerCalibration(boolean customerCalibration) {
        this.customerCalibration = customerCalibration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompletenessFlag(boolean completenessFlag) {
        this.completenessFlag = completenessFlag;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Units getIdUnits() {
        return idUnits;
    }

    public Vehicle getStateNumber() {
        return stateNumber;
    }

    public String getInstallPlace() {
        return installPlace;
    }

    public String getAvtografNumber() {
        return avtografNumber;
    }

    public int getTanksNumber() {
        return tanksNumber;
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

    public InstallAct getControllerSerialNumber() {
        return controllerSerialNumber;
    }

    public Calibration getCalibration() {
        return calibration;
    }

    public RepeatCalibration getRepeatCalibration() {
        return repeatCalibration;
    }

    public String getReasonCalibration() {
        return reasonCalibration;
    }

    public boolean isCustomerCalibration() {
        return customerCalibration;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompletenessFlag() {
        return completenessFlag;
    }
    
}
