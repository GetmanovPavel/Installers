package dao;

import java.sql.SQLException;
import java.util.List;
import table.RepeatCalibration;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface RepeatCalibrationDao {
    public void addRepeatCalibration(RepeatCalibration repeatCalibration) throws SQLException;
    public void deleteRepeatCalibration(RepeatCalibration repeatCalibration) throws SQLException;
    public RepeatCalibration getRepeatCalibration (int id) throws SQLException;
    public List<RepeatCalibration> getRepeatCalibrations() throws SQLException;
}
