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
@Table(name="Receive")
public class Receive {
   @Id
   @Column (name="id")
   private int id; 
   
   @Column (name="firstNameReceive")
   private String firstNameReceive;
   
   @Column (name="lastNameReceive")
   private String lastNameReceive;
    
   @Column (name="middleNameReceive")
   private String middleNameReceive; 
   /**
     * Должность человека, который принял работу
     */
   @Column (name="positionReceive")
   private String positionReceive; 

    public int getId() {
        return id;
    }

    public String getFirstNameReceive() {
        return firstNameReceive;
    }

    public String getLastNameReceive() {
        return lastNameReceive;
    }

    public String getMiddleNameReceive() {
        return middleNameReceive;
    }

    public String getPositionReceive() {
        return positionReceive;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstNameReceive(String firstNameReceive) {
        this.firstNameReceive = firstNameReceive;
    }

    public void setLastNameReceive(String lastNameReceive) {
        this.lastNameReceive = lastNameReceive;
    }

    public void setMiddleNameReceive(String middleNameReceive) {
        this.middleNameReceive = middleNameReceive;
    }

    public void setPositionReceive(String positionReceive) {
        this.positionReceive = positionReceive;
    }    
}
