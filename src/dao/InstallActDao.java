package dao;

import java.sql.SQLException;
import java.util.List;
import table.InstallAct;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface InstallActDao {
    public void addInstallAct(InstallAct installAct) throws SQLException;
    public void deleteInstallAct(InstallAct installAct) throws SQLException;
    public InstallAct getInstallAct (int id) throws SQLException;
    public List<InstallAct> getInstallActs() throws SQLException;
}
