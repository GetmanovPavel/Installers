package dao;

import java.sql.SQLException;
import java.util.List;
import table.Gsm;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface GsmDao {
    public void addGsm(Gsm gsm) throws SQLException;
    public void deleteGsm(Gsm gsm) throws SQLException;
    public Gsm getGsm (int id) throws SQLException;
    public List<Gsm> getGsms() throws SQLException;
}
