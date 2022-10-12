package it.Java.Evento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ProgrammEventi {

    private String titolo;
    private ArrayList<Evento> eventi;

    public ProgrammEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<>();
    }

    public void aggiungiEvento(Evento evento) {
        this.eventi.add(evento);
    }

    public Evento ritornaEventiData(LocalDate data) throws Exception {
        ArrayList<Evento> eventiData = new ArrayList<Evento>();
        for (Evento evento : eventi) {
            if (ChronoUnit.DAYS.between(data, evento.data) == 0) {
                return evento;
            }

        }
        return null;
    }

    public int numEventiProg() {
        return eventi.size();
    }

    public void svuotaLista() {

        this.eventi.clear();
    }

    public String ritornaStringa() {
        for (Evento evento : eventi) {
            return "" + this.titolo + ": " + evento.data + ", " + evento.titolo + "";

        }





