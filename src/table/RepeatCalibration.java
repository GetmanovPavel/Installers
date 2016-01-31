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
@Table(name="RepeatCalibration")
public class RepeatCalibration {
   @Id
   @Column (name="id")
   private int id; 
   /**
    * Тарировка(первичная или повторная)
    */
   @Column (name="calibrationCount")
   private String calibrationCount;
}
