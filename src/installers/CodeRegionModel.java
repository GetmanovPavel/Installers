package installers;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Гетманов Павел
 */
public class CodeRegionModel extends AbstractTableModel {

    public static int columnCount=2;

    public static void setColumnCount(int columnCount) {
        CodeRegionModel.columnCount = columnCount;
    }

   
    private ArrayList<String []> dataArrayList;
    
    public CodeRegionModel(){
        dataArrayList = new ArrayList<String[]>();
        for(int i = 0; i<dataArrayList.size(); i++){
          dataArrayList.add(new String[getColumnCount()]);
        }
    }
    
    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }
    @Override
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Код региона";
            case 1: return "Название";       
            
        }
        return "";
    }
    public void addData(String[] row){
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable);
    }
    
}
