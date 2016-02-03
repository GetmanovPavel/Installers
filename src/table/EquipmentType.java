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
@Table(name="EquipmentType")
public class EquipmentType implements Serializable {  
   @Id @GeneratedValue
   @Column (name="id")
   private int id; 
   /**
    * Тип оборудования (Омником,Техноком)
    */
   @Column (name="type")
   private String type; 
   /**
    * Стандартная длина линейки
    */
   @Column (name="length")
   private int length; 
   
   @Column (name="model")
   private String model; 

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

}
