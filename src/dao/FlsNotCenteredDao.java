package dao;

import java.sql.SQLException;
import java.util.List;
import table.FlsNotCentered;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface FlsNotCenteredDao {
    public void addFlsNotCentered(FlsNotCentered flsNotCentered) throws SQLException;
    public void deleteFlsNotCentered(FlsNotCentered flsNotCentered) throws SQLException;
    public FlsNotCentered getFlsNotCentered (int id) throws SQLException;
    public List<FlsNotCentered> getFlsNotCentereds() throws SQLException;
}
