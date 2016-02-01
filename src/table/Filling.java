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

/**
 * Пломбирование
 */
@Entity
@Table(name="Filling")
public class Filling {
   @Id
   @Column (name="id")
   private int id; 
   
   /**
    * Назначение пломбы
    */
   @Column (name="idPurposeSeal")
   private PurposeSeal idPurposeSeal;
   
   /**
    * Тип пломбы
    */
   @Column (name="idTypeSeal")
   private TypeSeal idTypeSeal;
   
   /**
    * Номер пломбы
    */
   @Column (name="sealNumber")
   private String sealNumber;
   
   /**
    * Данные пломбировщика
    */
   @Column (name="id")
   private Personal idPersonal; 
   
   /**
    * Связь с актом монтажа
    */
   @Column (name="serialNumberController")
   private InstallAct serialNumberController;
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

    public InstallAct getSerialNumberController() {
        return serialNumberController;
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

    public void setSerialNumberController(InstallAct serialNumberController) {
        this.serialNumberController = serialNumberController;
    }

}
