package table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn (name="IdcodeRegion")
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
    @JoinColumn (name="idVehicle")
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
    @Column (name="simCardNumberMobOperator1")
    private String simCardNumberMobOperator1;
   
     /**
      * номер Sim карты внутри мобильного оператора
      */
    @Column (name="simCardNumberMobOperator2")
    private String simCardNumberMobOperator2;

    
    /**
     * Индикация системы GSM в отдельной сущности
     */
    @ManyToOne
    @JoinColumn (name="idGsm")
    private Gsm idGsm;
    
    /**
     * Индикация системы GPS в отдельной сущности
     */
    @ManyToOne
    @JoinColumn (name="idGps")
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
    @JoinColumn (name="idRecipient")
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
    @JoinColumn (name="idUnits")
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

    public Date getDate(Date d) {
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

    public String getSimCardNumberMobOperator1() {
        return simCardNumberMobOperator1;
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

    public String getSimCardNumberMobOperator2() {
        return simCardNumberMobOperator2;
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

    public void setSimCardNumberMobOperator1(String simCardNumberMobOperator1) {
        this.simCardNumberMobOperator1 = simCardNumberMobOperator1;
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

     public void setSimCardNumberMobOperator2(String simCardNumberMobOperator2) {
        this.simCardNumberMobOperator2 = simCardNumberMobOperator2;
    }

    
    /**
    * Бригада, которая смонтировала оборудование
    * удалить и сделать через array list
    */
//    @Column (name="idBrigade")
//    private Brigade idBrigade;

}