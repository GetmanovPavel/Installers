package table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;
/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */

@Entity
@Table(name="installAct")
public class InstallAct implements Serializable {
    /**
      * Код региона
      */
    @ManyToOne
    @Column (name="IdcodeRegion")
    private CodeRegion IdcodeRegion;
    
    /**
      * Номер акта внутри телеметрикс
      */
    @Id
    @Column (name="number")
    private int number;
    
    /**
      * Дата заполнения акта
      */
    @Temporal(TIMESTAMP)
    @Column (name="date")
    private Date date;
    
    /**
     * Ссылка на технику, на которую устанавливается оборудование
     */
    @ManyToOne
    @Column (name="idVehicle")
    private Vehicle idVehicle;
    
    /**
      * Серийный номер контроллера 
      */
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
   
    /**
     * Индикация системы GSM в отдельной сущности
     */
    @ManyToOne
    @Column (name="idGsm")
    private Gsm idGsm;
    
    /**
     * Индикация системы GPS в отдельной сущности
     */
    @ManyToOne
    @Column (name="idGps")
    private Gps idGps;

    /**
     * Установили или отремонтировали
     */
    @Column (name="installOrRepairComment")
    private String installOrRepairComment;
    
    /**
      * Количество установленного оборудования
      */
    @Column (name="kolvoEquipment")
    private int kolvoEquipment;
    
    /**
     * Лицо, принимающее акт
     */
    @ManyToOne
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
    @Lob
    @Column (name="description")
    private String description;
    
    /**
     * Подразделение
     */
    @ManyToOne
    @Column (name="idUnits")
    private Units idUnits;
    
    /**
     * Флаг заполненности акта
     */
    @Column (name="completenessFlag")
    private boolean completenessFlag;
    
    /**
     * Монтажники
     */
    @Column (name="personal")
    private ArrayList <Personal> personal;
    
    public CodeRegion getIdcodeRegion() {
        return IdcodeRegion;
    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public Vehicle idVehicle() {
        return idVehicle;
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
        return idGsm;
    }

    public Gps getIdGps() {
        return idGps;
    }

    public String getInstallOrRepairComment() {
        return installOrRepairComment;
    }

    public int getKolvoEquipment() {
        return kolvoEquipment;
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

    public Units getIdUnits() {
        return idUnits;
    }

    public boolean isCompletenessFlag() {
        return completenessFlag;
    }

    public void setIdcodeRegion(CodeRegion IdcodeRegion) {
        this.IdcodeRegion = IdcodeRegion;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIdVehicle(Vehicle idVehicle) {
        this.idVehicle = idVehicle;
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

    public void setIdGsm(Gsm idGsm) {
        this.idGsm = idGsm;
    }

    public void setIdGps(Gps idGps) {
        this.idGps = idGps;
    }

    public void setInstallOrRepairComment(String installOrRepairComment) {
        this.installOrRepairComment = installOrRepairComment;
    }

    public void setKolvoEquipment(int kolvoEquipment) {
        this.kolvoEquipment = kolvoEquipment;
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

    public void setIdUnits(Units idUnits) {
        this.idUnits = idUnits;
    }

    public void setCompletenessFlag(boolean completenessFlag) {
        this.completenessFlag = completenessFlag;
    }
    
    /**
    * Бригада, которая смонтировала оборудование
    * удалить и сделать через array list
    */
//    @Column (name="idBrigade")
//    private Brigade idBrigade;

}