/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import table.CalibrationAct;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface CalibrationActDao {
    public void addCalibrationAct(CalibrationAct calibrationAct) throws SQLException;
    public void deleteCalibrationAct(CalibrationAct calibrationAct) throws SQLException;
    public CalibrationAct getCalibrationAct (int id) throws SQLException;
    public List<CalibrationAct> getCalibrationActs() throws SQLException;
}
