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
@Table(name="EquipmentType")
public class EquipmentType {  
   @Id
   @Column (name="id")
   private int id; 
   
   @Column (name="type")
   private String type; 
   /**
    * Стандартная длина кабеля
    */
   @Column (name="length")
   private int length; 
   
   @Column (name="model")
   private String model; 

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public String getModel() {
        return model;
    }
    
}
