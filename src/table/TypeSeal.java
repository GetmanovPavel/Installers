/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * Тип пломбы
 */

@Entity
@Table(name="TypeSeal")
public class TypeSeal implements Serializable {
   @Id @GeneratedValue
   @Column (name="id")
   private int id;
   
   @Column (name="typeSeal")
   private String typeSeal;

    public int getId() {
        return id;
    }

    public String getTypeSeal() {
        return typeSeal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypeSeal(String typeSeal) {
        this.typeSeal = typeSeal;
    }
   
}
