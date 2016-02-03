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
/**
 * Дут не по центру
 */
@Entity
@Table(name="FlsNotCentered")
public class FlsNotCentered implements Serializable {
    
   @Id @GeneratedValue
   @Column (name="id")
   private int id; 
   
   /**
    *Причина расположения не по центру
    */
   @Column (name="reasonNotCentered")
   private String reasonNotCentered;
   
   /**
    *Описание
    */
   @Column (name="description")
   private String description;

    public int getId() {
        return id;
    }

    public String getReasonNotCentered() {
        return reasonNotCentered;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReasonNotCentered(String reasonNotCentered) {
        this.reasonNotCentered = reasonNotCentered;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
   
}
