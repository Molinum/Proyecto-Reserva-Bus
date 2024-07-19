package main.java.logic;

public class Seat {
    private boolean available;
    private Passenger passenger;
    private int id;
    private String tipo;

    public Seat(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void clear(){
        this.available = false;
        this.passenger = null;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
