package main.java.gui;

import main.java.logic.Bus;
import main.java.logic.BusA;
import main.java.logic.BusB;
import main.java.logic.BusC;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainPanel extends JPanel {

    private JTable table;
    private JScrollPane scroll;
    private ArrayList<Bus> buses = new ArrayList<>();
    private String[] titles = {"Inicio","Destino","Hora Salida","Hora Llegada", "Patente"};
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
        this.add(scroll);

    }

    private void initializeComponents(){
        scroll = new JScrollPane();
        this.add(scroll);

        table = new JTable();
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

    }
}
