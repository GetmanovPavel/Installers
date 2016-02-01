package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */

@Entity
@Table(name="Vehicle")
public class Vehicle {
    @Column (name="idGuideTechnique")
    private GuideTechnique idGuideTechnique;
    
    @Id
    @Column (name="StateNumber")
    private String stateNumber;
    
    @Column (name="InventoryNumber")
    private String inventoryNumber;
    
    @Column (name="firstNameDriver")
    private String firstNameDriver;
    
    @Column (name="lastNameDriver")
    private String lastNameDriver;
    
    @Column (name="middleNameDriver")
    private String middleNameDriver;
     
    @Column (name="numberPhoneDriver")
    private String numberPhoneDriver;

    public GuideTechnique getIdGuideTechnique() {
        return idGuideTechnique;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getFirstNameDriver() {
        return firstNameDriver;
    }

    public String getLastNameDriver() {
        return lastNameDriver;
    }

    public String getMiddleNameDriver() {
        return middleNameDriver;
    }

    public String getNumberPhoneDriver() {
        return numberPhoneDriver;
    }

    public void setIdGuideTechnique(GuideTechnique idGuideTechnique) {
        this.idGuideTechnique = idGuideTechnique;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setFirstNameDriver(String firstNameDriver) {
        this.firstNameDriver = firstNameDriver;
    }

    public void setLastNameDriver(String lastNameDriver) {
        this.lastNameDriver = lastNameDriver;
    }

    public void setMiddleNameDriver(String middleNameDriver) {
        this.middleNameDriver = middleNameDriver;
    }

    public void setNumberPhoneDriver(String numberPhoneDriver) {
        this.numberPhoneDriver = numberPhoneDriver;
    }

   
}
