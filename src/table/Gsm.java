package table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="Gsm")
public class Gsm implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id;  
    
   @Column (name="gsmState")
   private String gsmState;

    public int getId() {
        return id;
    }

    public String getGsmState() {
        return gsmState;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setGsmState(String gsmState) {
        this.gsmState = gsmState;
    }

}
