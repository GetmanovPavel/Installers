
package installers;

import java.awt.Color;
import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
/**
 *
 * @author Павел
 */
public class Renderer extends DefaultTableCellRenderer{
  
    
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column){
        Component cell = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
        
        cell.setBackground(Color.GREEN);
        
        return cell;
    }
}
