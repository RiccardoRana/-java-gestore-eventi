package it.Java.Evento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgrammEventi {

    private String titolo;
    private ArrayList<Evento> eventi;

    public ProgrammEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<Evento>();
    }

    public void aggiungiEvento(Evento evento) {
        this.eventi.add(evento);
    }

    public void ritornaEventiData(LocalDate data) throws Exception {
        ArrayList<Evento> eventiData = new ArrayList<Evento>();
        Iterator<Evento> iterator = eventiData.iterator();
        while (iterator.hasNext()) {
            Evento eventOne = iterator.next();
            if (ChronoUnit.DAYS.between(data, eventOne.data) == 0) {
                eventiData.add(eventOne);
            }
        }
        System.out.println(eventiData);
    }

    public int numEventiProg() {
        return eventi.size();
    }

    public void svuotaLista() {
        this.eventi.clear();
    }

    public void ritornaStringa() {
        Iterator<Evento> iterator = this.eventi.iterator();
        for (Evento evento: this.eventi) {
            String stringa = "" + this.titolo + ": " + evento.data + ", " + evento.titolo + "";
            System.out.println(stringa);

        }

    }
}










