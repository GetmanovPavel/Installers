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
@Table(name="Calibration")
public class Calibration implements Serializable {
    @GeneratedValue
    @Id
    @Column (name="Id")
    private int id;
    /**
    * Название тарировки(одновременная,последовательная и пр.)
    */
    @Column (name="calibrationName")
    private String calibrationName;

    public void setId(int id) {
        this.id = id;
    }

    public void setCalibrationName(String calibrationName) {
        this.calibrationName = calibrationName;
    }

    public int getId() {
        return id;
    }

    public String getCalibrationName() {
        return calibrationName;
    }

}
