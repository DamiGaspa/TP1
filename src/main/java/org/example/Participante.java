package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Participante {
    private LocalDateTime fecha;
    private boolean inscripto;
    private int puntos;

    public Participante () {
        this.inscripto = false;
        this.puntos = 0;
    }

    public void seInscribio() {
        this.inscripto = true;
    }

    public LocalDateTime fechaInscripcion () {
        return this.fecha;
    }

    public void fechaManual () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese año: ");
        int anio = sc.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese dia: ");
        int dia = sc.nextInt();
        this.fecha = LocalDateTime.of(anio, mes, dia, 12, 0);
    }

    public void fechaValida () {
        this.puntos = 10;
    }
}
