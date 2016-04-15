package installers;

import dao.CodeRegionDao;
import java.sql.SQLException; 
import java.util.List;
import table.InstallAct;
import installers.Renderer;
import dao.InstallActDao;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import table.CodeRegion;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class Installers {

    public static void main(String[] args) throws SQLException {
            Factory factory = Factory.getInstance();
            CodeRegionDao codeRegionDao = factory.getCodeRegionDao();
            
      JFrame frame = new JFrame ("Коды регионов");
      frame.setSize(new Dimension(600,400));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setLayout(new GridBagLayout());
      
      JButton addButton = new JButton("Добавить");
      JButton deleteButton = new JButton("Удалить");
      JButton clearButton = new JButton("Очистить");
      JComboBox comboBox = null;
      
      
      CodeRegionModel crm = new CodeRegionModel();
      JTable codeRegionTable = new JTable(crm);
      JScrollPane codeRegionTableScrollPane = new JScrollPane(codeRegionTable);
      codeRegionTableScrollPane.setPreferredSize(new Dimension(400,400));
      codeRegionTable.getColumnModel().getColumn(1).setCellRenderer(new Renderer());
      List <CodeRegion> codeRegions = codeRegionDao.getCodeRegions();
   
   int k=0;
   ArrayList<String> myArrayList=new ArrayList<String>();

     String str1;
     String str2;
    String [] comboRow = new String[codeRegions.size()];
      for (CodeRegion codeRegion:codeRegions) {
         System.out.println(codeRegion.getRegionName()+" "+codeRegion.getId());
         String []row={
                 Integer.toString(codeRegion.getId()),
                 codeRegion.getRegionName()};
         String []str= {codeRegion.getRegionName()};
         k=k+1;
             comboRow[k-1]=codeRegion.getRegionName();
         
         crm.addData(row);
        };
        comboBox = new JComboBox();
        comboBox.setModel(new CodeRegionModel2(codeRegions));
        comboBox.setEditable(true);
        CodeRegion cr = (CodeRegion) (comboBox.getSelectedItem());
      
        
      frame.add(codeRegionTableScrollPane,new GridBagConstraints(0,0,3,1,1,1,
              GridBagConstraints.NORTH, GridBagConstraints.BOTH,
              new Insets (1,1,1,1),0,0));
      
      frame.add(addButton,new GridBagConstraints(0,1,1,1,1,1,
              GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
              new Insets (1,1,1,1),0,0));
       
      frame.add(deleteButton,new GridBagConstraints(1,1,1,1,1,1,
              GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
              new Insets (1,1,1,1),0,0));
         
//      frame.add(clearButton,new GridBagConstraints(2,1,1,1,1,1,
//              GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
//              new Insets (1,1,1,1),0,0));
      
      frame.add(comboBox,new GridBagConstraints(2,1,1,1,1,1,
              GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
              new Insets (1,1,1,1),0,0));
      
      frame.setVisible(true);
      frame.pack();
      
    }
}
