package main.java.gui;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
    String[] columnNames;
    Object[][] data;
    public MyTableModel(Object[][] data,String[] columnNames) {
        super();
        this.data = data;
        this.columnNames = columnNames;
        setDataVector(data,columnNames);
    }

    public boolean isCellEditable(int row, int column){
        return false;
    }

}
