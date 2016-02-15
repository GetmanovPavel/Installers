package dao;

import java.sql.SQLException;
import java.util.List;
import table.Gps;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface GpsDao {
    public void addGps(Gps gps) throws SQLException;
    public void deleteGps(Gps gps) throws SQLException;
    public Gps getGps (int id) throws SQLException;
    public List<Gps> getGpss() throws SQLException;
}
