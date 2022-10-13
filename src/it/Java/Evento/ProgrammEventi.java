package it.Java.Evento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgrammEventi implements Comparable<Evento> {

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
        for (Evento evento : this.eventi) {
            String stringa = "" + this.titolo + ": " + evento.data + ", " + evento.titolo + "";
            System.out.println(stringa);

        }

    }

    public void salvaEvento(String filePath) {

    }

    @Override
    public int compareTo(Evento o) {
        ArrayList<Evento> eventiCopia = this.eventi;
        for (Evento evento : eventiCopia) {
            if (evento.data.isBefore(o.data)) {
                return 1;
            } else if (evento.data.isAfter(o.data)) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;


    }
}














