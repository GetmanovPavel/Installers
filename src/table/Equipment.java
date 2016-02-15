package table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="Equipment")
public class Equipment implements Serializable { 
   @Id @GeneratedValue
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
   @ManyToOne
   @JoinColumn (name="numberInstallAct")
   private InstallAct numberInstallAct;
   
   /**
    * Связь с типом оборудования
    */
   @ManyToOne
   @JoinColumn  (name="idType")
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

    public InstallAct getNumberInstallAct() {
        return numberInstallAct;
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

    public void setNumberInstallAct(InstallAct numberInstallAct) {
        this.numberInstallAct = numberInstallAct;
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
