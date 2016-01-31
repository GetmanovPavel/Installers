package table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */

@Entity
@Table(name="installAct")
public class InstallAct {
    /**
    * Код региона
    */
    @Column (name="IdcodeRegion")
    private CodeRegion IdcodeRegion;
    /**
    * Дата заполнения акта
    */
    @Column (name="date")
    private Date date;
    /**
    * Номер акта внутри телеметрикс
    */
    @Column (name="number")
    private int number;
    
    /**
    * Ключевое поле
    * Серийный номер контроллера 
    */
    @Id
    @Column (name="controllerSerialNumber")
    private String controllerSerialNumber;
    /**
    * Абонентский номер Sim карты 1
    */
    @Column (name="simCardAbonentNumber1")
    private String simCardAbonentNumber1;
    
    /**
    * Абонентский номер Sim карты 2
    */
    @Column (name="simCardAbonentNumber2")
    private String simCardAbonentNumber2;
    
    /**
    * номер Sim карты внутри мобильного оператора
    */
    @Column (name="simCardNumberMobOperator")
    private String simCardNumberMobOperator;
    
    
    
    //в отдельную сущность модели
    // ex modelDUT1
//    @Column (name="fuelLevelSensorModel1")
//    private String fuelLevelSensorModel1;
//    @Column (name="fuelLevelSensorSerial1")
//    private String fuelLevelSensorSerial1;
//
//    @Column (name="fuelLevelSensorModel2")
//    private String fuelLevelSensorModel2;
//    @Column (name="fuelLevelSensorSerial2")
//    private String fuelLevelSensorSerial2;
   
    /**
    * Индикация системы GSM в отдельной сущности
    */
    @Column (name="idGsm")
    private Gsm idGsm;
    
    /**
    * Индикация системы GPS в отдельной сущности
    */
    @Column (name="idGps")
    private Gps idGps;
//    /**
//    * Установленное оборудование
//    */
//    @Column (name="IdEquipment")
//    private Equipment IdEquipment;

    @Column (name="installOrRepairComment")
    private String installOrRepairComment;
      /**
      * количество установленного оборудования
      */
    @Column (name="kolvoEquipment")
    private int kolvoEquipment;
    
    /**
    * Лицо, принимающее акт
    */
    @Column (name="idRecipient")
    private Receive idRecipient;
    
    /**
    * Флаг подписанности акта с принимающей стороны
    */
    @Column (name="receive")
    private boolean receive;


    /**
    * Комментарий
    */
    @Column (name="description")
    private String description;
    /**
    * Подразделение
    */
    @Column (name="idUnits")
    private Units idUnits;
    /**
    * Флаг заполненности акта
    */
    @Column (name="completenessFlag")
    private boolean completenessFlag;
    
    /**
    * Бригада, которая смонтировала оборудование
    * удалить и сделать через array list
    */
//    @Column (name="idBrigade")
//    private Brigade idBrigade;

    public int getCodeRegion() {
        return codeRegion;
    }

    public Date getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public String getControllerSerialNumber() {
        return controllerSerialNumber;
    }

    public String getSimCardAbonentNumber1() {
        return simCardAbonentNumber1;
    }

    public String getSimCardAbonentNumber2() {
        return simCardAbonentNumber2;
    }

    public String getSimCardNumberMobOperator() {
        return simCardNumberMobOperator;
    }

    public Gsm getIdGsm() {
        return IdGsm;
    }

    public Equipment getIdEquipment() {
        return IdEquipment;
    }

    public String getInstallOrRepairComment() {
        return installOrRepairComment;
    }

    public Receive getIdRecipient() {
        return idRecipient;
    }

    public boolean isReceive() {
        return receive;
    }

    public String getDescription() {
        return description;
    }

    public Filial getIdFilial() {
        return idFilial;
    }

    public boolean isCompletenessFlag() {
        return completenessFlag;
    }

    public Brigade getIdBrigade() {
        return idBrigade;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setControllerSerialNumber(String controllerSerialNumber) {
        this.controllerSerialNumber = controllerSerialNumber;
    }

    public void setSimCardAbonentNumber1(String simCardAbonentNumber1) {
        this.simCardAbonentNumber1 = simCardAbonentNumber1;
    }

    public void setSimCardAbonentNumber2(String simCardAbonentNumber2) {
        this.simCardAbonentNumber2 = simCardAbonentNumber2;
    }

    public void setSimCardNumberMobOperator(String simCardNumberMobOperator) {
        this.simCardNumberMobOperator = simCardNumberMobOperator;
    }

    public void setIdGsm(Gsm IdGsm) {
        this.IdGsm = IdGsm;
    }

    public void setIdEquipment(Equipment IdEquipment) {
        this.IdEquipment = IdEquipment;
    }

    public void setInstallOrRepairComment(String installOrRepairComment) {
        this.installOrRepairComment = installOrRepairComment;
    }

    public void setIdRecipient(Receive idRecipient) {
        this.idRecipient = idRecipient;
    }

    public void setReceive(boolean receive) {
        this.receive = receive;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdFilial(Filial idFilial) {
        this.idFilial = idFilial;
    }

    public void setCompletenessFlag(boolean completenessFlag) {
        this.completenessFlag = completenessFlag;
    }

    public void setIdBrigade(Brigade idBrigade) {
        this.idBrigade = idBrigade;
    }
}