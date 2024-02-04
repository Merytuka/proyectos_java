import javax.swing.*;

public class Carrera {
    private Coche participante1, participante2, ganador;
    private int kmTotales, vueltas;

    public void setParticipante1(Coche participante1) {
        this.participante1 = participante1;
    }

    public void setParticipante2(Coche participante2) {
        this.participante2 = participante2;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public String mostrarParticipantes() {

        return "🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️Estos son los datos de los Participantes 🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️\n\n\n" +
                participante1.mostrarDatos() + "\n\n" + participante2.mostrarDatos();

    }

    public int aceleracion(Coche participante) {
        int aceleracionIntroducida = 0;

        do {
            aceleracionIntroducida = Integer.parseInt(JOptionPane.showInputDialog("Introduce Aceleración del " + participante.getMarca()));
            if (participante.validarAceleracon(aceleracionIntroducida)) {

                participante.acelerar(aceleracionIntroducida);


            } else {
                System.out.println("La aceleración debe ser mayor de 10 k/h, vuelva a intentarlo");
            }
        } while (!participante.validarAceleracon(aceleracionIntroducida));
        return participante.getKmRecorridos();
    }

    public void datosVuelta(Coche participante, int vuelta) {
        System.out.println("Vuelta " + vuelta + " Participante-->" + participante.getMarca() + " Km recorridos: " + participante.getKmRecorridos());

    }

    public void iniciarCarrera() {

        for (int i = 0; i < vueltas; i++) {
            aceleracion(participante1);
            aceleracion(participante2);
            datosVuelta(participante1, (i + 1));
            datosVuelta(participante2, (i + 1));
        }
        while (participante1.getKmRecorridos() < kmTotales && participante2.getKmRecorridos() < kmTotales) {
            aceleracion(participante1);
            aceleracion(participante2);
            vueltas++; // Incrementar el contador de vueltas
            datosVuelta(participante1, vueltas);
            datosVuelta(participante2, vueltas);
        }

        if (participante1.getKmRecorridos() > participante2.getKmRecorridos()) {
            ganador = participante1;
        } else if (participante1.getKmRecorridos() == participante2.getKmRecorridos()) {
            System.out.println("Ha habido empate");
        } else {
            ganador = participante2;
        }


    }

    public Coche getGanador() {
        return ganador;
    }

    public String mostrarDatosGanador() {
        return
                "Marca: " + ganador.getMarca() + "\n" +
                        "Modelo: " + ganador.getModelo() + "\n" +
                        "Matrícula: " + ganador.getMatricula() + "\n" +
                        "CC: " + ganador.getCc() + "\n" +
                        "CV: " + ganador.getCv() + "\n" +
                        "Velocidad máxima: " + ganador.getVelocidad() + " Km/h" + "\n" +
                        "Km Recorridos: " + ganador.getKmRecorridos() + " Km";
    }

    public Carrera(Coche participante1, Coche participante2, int kmTotales, int vueltas) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.kmTotales = kmTotales;
        this.vueltas = vueltas;
    }
}
