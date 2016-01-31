package table;

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
@Table(name="Equipment")//спорное выделение в отдельную сущность.
class Equipment {
   @Id
   @Column (name="id")
   private int id; 
   
   /**
    * Назначение оборудования
    */
   @Column (name="purposeEquipment")
    private String purposeEquipment;
   /**
    * Связь с актом монтажа
    */
    @Column (name="serialNumberController")
    private InstallAct serialNumberController;
   
   @Column (name="idType")
   private EquipmentType idType; 
    /**
    * Длина установленной линейки
    */
   @Column (name="lengthInstallLine")
    private int lengthInstallLine;
    /**
    * Серийный номер оборудования
    */
   @Column (name="serial")
   private String serial; 

    public int getId() {
        return id;
    }

    public String getPurposeEquipment() {
        return purposeEquipment;
    }


    public EquipmentType getIdType() {
        return idType;
    }

    public int getLengthInstallLine() {
        return lengthInstallLine;
    }

    public String getSerial() {
        return serial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPurposeEquipment(String purposeEquipment) {
        this.purposeEquipment = purposeEquipment;
    }

    public void setKolvoEquipment(int kolvoEquipment) {
        this.kolvoEquipment = kolvoEquipment;
    }

    public void setIdType(EquipmentType idType) {
        this.idType = idType;
    }

    public void setLengthInstallLine(int lengthInstallLine) {
        this.lengthInstallLine = lengthInstallLine;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
   
}
