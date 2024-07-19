package main.java.logic;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Bus {
    private String patente;
    private String lugarInicio;
    private String lugarDestino;
    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;
    private ArrayList<Seat> seats;

    public Bus(String patente, String lugarInicio, String lugarDestino, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        this.patente = patente;
        this.lugarInicio = lugarInicio;
        this.lugarDestino = lugarDestino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.seats = new ArrayList<>();
    }

    public Object[] getBusInfo(){
        return new Object[]{this.getLugarInicio(),this.getLugarDestino(),this.getHoraSalida(),this.getHoraLlegada(),this.getPatente()};
    }
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getLugarInicio() {
        return lugarInicio;
    }

    public void setLugarInicio(String lugarInicio) {
        this.lugarInicio = lugarInicio;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}
