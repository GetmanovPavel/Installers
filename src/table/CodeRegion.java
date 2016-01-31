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
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="CodeRegion")
public class CodeRegion {
 /**
 * Код региона
 */
    @Id
    @Column (name="Id")
    private int id;
    
 /**
 * Название региона
 */   
   @Column (name="regionName")
   private String regionName; 
}
