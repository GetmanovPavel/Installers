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
@Table(name="GuideTechnique")
public class GuideTechnique implements Serializable {
    @Id @GeneratedValue
    @Column (name="id")
    private int id;
    
    @Column (name="Mark")
    private String mark;
    
    @Column (name="Model")
    private String model;
    
    @Column (name="Type")
    private String type;

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
