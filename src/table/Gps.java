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
@Table(name="Gps")
public class Gps implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id;  
    
   @Column (name="gpsState")
   private String gpsState;

    public int getId() {
        return id;
    }

    public String getGpsState() {
        return gpsState;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpsState(String gpsState) {
        this.gpsState = gpsState;
    }
   
}
