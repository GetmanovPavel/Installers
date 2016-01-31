/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class PurposeSeal {
   @Id
   @Column (name="id")
   private int id;
   
   @Column (name="purposeSeal")
   private String purposeSeal;
}
