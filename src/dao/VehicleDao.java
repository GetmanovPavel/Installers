package dao;

import java.sql.SQLException;
import java.util.List;
import table.Vehicle;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface VehicleDao {
    public void addVehicle(Vehicle vehicle) throws SQLException;
    public void deleteVehicle(Vehicle vehicle) throws SQLException;
    public Vehicle getVehicle(int id) throws SQLException;
    public List<Vehicle> getVehicles() throws SQLException; 
}
