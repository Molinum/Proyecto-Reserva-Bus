package main.java.gui;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class MyTableHeader implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel jcomponent = null;

        if (value instanceof String) {
            jcomponent = new JLabel((String) value);
            jcomponent.setHorizontalAlignment(SwingConstants.CENTER);
            jcomponent.setSize(jcomponent.getWidth(),30);
            jcomponent.setPreferredSize(new Dimension(6,jcomponent.getHeight()));
        }

        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0,0,1,1, new java.awt.Color(255,255,255)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground(new Color(65,65,65));

        return jcomponent;
    }
}
