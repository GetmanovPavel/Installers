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
@Table(name="Units")
public class Units implements Serializable {
    @Id @GeneratedValue
    @Column (name="Id")
    private int id;
    
    @Column (name="unitsName")
    private String unitsName;
    
    @Column (name="idFilial")
    private Filial idFilial;

    public int getId() {
        return id;
    }

    public String getUnitsName() {
        return unitsName;
    }

    public Filial getIdFilial() {
        return idFilial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUnitsName(String unitsName) {
        this.unitsName = unitsName;
    }

    public void setIdFilial(Filial idFilial) {
        this.idFilial = idFilial;
    }
    
}
