package dao;

import java.sql.SQLException;
import java.util.List;
import table.Calibration;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface CalibrationDao {
    public void addCalibration(Calibration calibration) throws SQLException;
    public void deleteCalibration(Calibration calibration) throws SQLException;
    public Calibration getCalibration (int id) throws SQLException;
    public List<Calibration> getCalibrations() throws SQLException;
}
