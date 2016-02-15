package dao;

import java.sql.SQLException;
import java.util.List;
import table.Organization;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface OrganizationDao {
    public void addOrganization(Organization organization) throws SQLException;
    public void deleteOrganization(Organization organization) throws SQLException;
    public Organization getOrganization (int id) throws SQLException;
    public List<Organization> getOrganizations() throws SQLException;
}
