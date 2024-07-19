package main.java.logic;

import java.time.Instant;
import java.time.LocalDateTime;

public class BusA extends Bus{
    private static final int seatAmount = 30;

    public BusA(String patente, String lugarInicio, String lugarDestino, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        super(patente, lugarInicio, lugarDestino, horaSalida, horaLlegada);
        for (int i = 0; i < seatAmount; i++){
            if (i<seatAmount/2){
                getSeats().add(new Seat(i,"Semi Cama"));
            } else{
                getSeats().add(new Seat(i,"Salon Cama"));
            }
        }
    }
}
