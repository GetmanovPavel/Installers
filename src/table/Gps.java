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
@Table(name="Gps")
public class Gps {
   @Id
   @Column (name="id")
   private int id;  
    
   @Column (name="gpsState")
   private String gpsState;


  
}
