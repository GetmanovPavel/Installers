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

/**
 * Пломбирование
 */
@Entity
@Table(name="Filling")
public class Filling implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id; 
   
   /**
    * Назначение пломбы
    */
   @ManyToOne
   @JoinColumn  (name="idPurposeSeal")
   private PurposeSeal idPurposeSeal;
   
   /**
    * Тип пломбы
    */
   @ManyToOne
   @JoinColumn  (name="idTypeSeal")
   private TypeSeal idTypeSeal;
   
   /**
    * Номер пломбы
    */
   @Column (name="sealNumber")
   private String sealNumber;
   
   /**
    * Данные пломбировщика
    */
   @ManyToOne
   @JoinColumn  (name="idPersonal")
   private Personal idPersonal; 
   
   /**
    * Связь с актом монтажа
    */
   @ManyToOne
   @JoinColumn  (name="numberInstallAct")
   private InstallAct numberInstallAct;
   //подпись решили оставить в фотографиях?

    public int getId() {
        return id;
    }

    public PurposeSeal getIdPurposeSeal() {
        return idPurposeSeal;
    }

    public TypeSeal getIdTypeSeal() {
        return idTypeSeal;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public Personal getIdPersonal() {
        return idPersonal;
    }

    public InstallAct getNumberInstallAct() {
        return numberInstallAct;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdPurposeSeal(PurposeSeal idPurposeSeal) {
        this.idPurposeSeal = idPurposeSeal;
    }

    public void setIdTypeSeal(TypeSeal idTypeSeal) {
        this.idTypeSeal = idTypeSeal;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public void setIdPersonal(Personal idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setNumberInstallAct(InstallAct numberInstallAct) {
        this.numberInstallAct = numberInstallAct;
    }

}
