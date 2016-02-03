package table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="RepeatCalibration")
public class RepeatCalibration implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id; 
   
   /**
    * Тарировка(первичная или повторная)
    */
   @Column (name="calibrationCount")
   private String calibrationCount;

    public int getId() {
        return id;
    }

    public String getCalibrationCount() {
        return calibrationCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalibrationCount(String calibrationCount) {
        this.calibrationCount = calibrationCount;
    }
   
}
