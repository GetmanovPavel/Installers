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

/**
 * Назначение пломбы
 */

@Entity
@Table(name="PurposeSeal")
public class PurposeSeal implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id;
   
   @Column (name="purposeSeal")
   private String purposeSeal;

    public int getId() {
        return id;
    }

    public String getPurposeSeal() {
        return purposeSeal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPurposeSeal(String purposeSeal) {
        this.purposeSeal = purposeSeal;
    }
   
}
