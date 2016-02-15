package dao;

import java.sql.SQLException;
import java.util.List;
import table.Personal;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface PersonalDao {
    public void addPersonal(Personal personal) throws SQLException;
    public void deletePersonal(Personal personal) throws SQLException;
    public Personal getPersonal (int id) throws SQLException;
    public List<Personal> getPersonals() throws SQLException;
}
