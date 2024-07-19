package main.java.gui;

import main.java.logic.Bus;
import main.java.logic.BusA;
import main.java.logic.BusB;
import main.java.logic.BusC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainPanel extends JLayeredPane  implements MouseListener{

    private JTable table;
    private JScrollPane scroll;
    private ArrayList<Bus> buses = new ArrayList<>();
    private String[] titles = {"Inicio","Destino","Hora Salida","Hora Llegada", "Patente", "Ver"};
    MyTableModel model;
    private BusAPanel A;
    private BusBPanel B;
    private BusCPanel C;


    public MainPanel() {
        super();
        this.setSize(GuiUtil.WIDTH,GuiUtil.HEIGHT);
        this.setBackground(Color.gray);
        this.setLayout(new BorderLayout());

        this.initializeComponents();
        this.makeTable();
        scroll = new JScrollPane(table);

        this.A = new BusAPanel((BusA) buses.get(0));
        this.B = new BusBPanel((BusB) buses.get(1));
        this.C = new BusCPanel((BusC) buses.get(2));

        this.add(A);
        this.add(scroll);
        setLayer(A,MODAL_LAYER);
        setLayer(scroll,DEFAULT_LAYER);
    }

    private void initializeComponents(){
        scroll = new JScrollPane();
        this.add(scroll);


        table = new JTable();
        table.addMouseListener(this);
        scroll.setViewportView(table);
    }
    private void initializeBuses(){
        this.buses.add(new BusA("PG-TR-45","Concepcion","Santiago",LocalDateTime.of(2024,7,20,15,30),LocalDateTime.of(2024,7,20,21,30)));
        this.buses.add(new BusB("HV-FJ-14","Concepcion","Chillan",LocalDateTime.of(2024,7,20,10,0),LocalDateTime.of(2024,7,20,11,30)));
        this.buses.add(new BusC("TY-DC-83","Concepcion","Puerto Montt",LocalDateTime.of(2024,7,20,1,0),LocalDateTime.of(2024,7,20,9,30)));

    }
    private Object[][] getData(){
        Object[][] data = new Object[buses.size()][titles.length];
        for(int i = 0; i < data.length; i++){
            data[i][GuiUtil.LUGARINICIO] = buses.get(i).getLugarInicio();
            data[i][GuiUtil.LUGARDESTINO] = buses.get(i).getLugarDestino();
            data[i][GuiUtil.HORASALIDA] = buses.get(i).getHoraSalida();
            data[i][GuiUtil.HORALLEGADA] = buses.get(i).getHoraLlegada();
            data[i][GuiUtil.PATENTE] = buses.get(i).getPatente();
            data[i][GuiUtil.EVENTO] = null;
        }
        return data;
    }
    private void makeTable(){
        initializeBuses();
        Object[][] data = getData();
        makeTable(data,titles);
    }

    private void makeTable(Object[][] data, String[] titles){
        model = new MyTableModel(data, titles);
        table.setModel(model);
        table.getColumn("Ver").setCellRenderer(new ButtonRenderer());
        table.getColumn("Ver").setCellEditor(new ButtonEditor(new JCheckBox()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = table.rowAtPoint(e.getPoint());
        int col = table.columnAtPoint(e.getPoint());

        if(col == GuiUtil.EVENTO){
            switch (row){
                case 0:
                    A.setVisible(true);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
