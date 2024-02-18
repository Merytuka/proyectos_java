import java.text.DecimalFormat;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc;
    private double velocidad, kmRecorridos;

    public Coche() {

    }

    public Coche(String marca, String modelo, String matricula, int cv, int cc, double velocidad, double kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCv() {
        return cv;
    }

    public int getCc() {
        return cc;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public String formatearDouble ( double datosMostrados){
        DecimalFormat formato = new DecimalFormat("#.##");
        String decimallFormateado = formato.format(datosMostrados);
        return decimallFormateado;
    }

    public String mostrarDatos() {

        return
                "Marca: " + this.getMarca() + "\n" +
                        "Modelo: " + this.getModelo() + "\n" +
                        "Matrícula: " + this.getMatricula() + "\n" +
                        "CC: " + this.getCc() + "\n" +
                        "CV: " + this.getCv() + "\n" +
                        "Velocidad atual: " + formatearDouble(this.getVelocidad()) + " Km/h" + "\n" +
                        "Km Recorridos: " + formatearDouble(this.getKmRecorridos()) + " Km";
    }

    public double acelerar(double aceleracion) {


        if (cv < 100) {
            velocidad += (Math.random() * aceleracion);
            kmRecorridos = velocidad / 2;
        } else {
            velocidad += (Math.random() * aceleracion) + 10;
            kmRecorridos = velocidad / 2;
        }

        return kmRecorridos;

    }

    public boolean validarAceleracon(double aceleracion) {
        if (aceleracion >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
