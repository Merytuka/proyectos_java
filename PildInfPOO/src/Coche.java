

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche(){ //<- Constructor//
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }

    public String dime_datosgenerales(){ //GETTER
        return "La plataforma del vehícuelo tiene "+ruedas+" ruedas. Mide "+largo/1000+
                " meetros con un ancho de "+ancho+" cm y un peso de plataforma de "+peso_plataforma+" Kg";

    }

    public void establece_color( String color_coche ) { //SETTER
        this.color = color_coche;
    }

    public String dme_color(){
        return "El color del coche es "+color;
    }

    public void configura_asientos(String asientos_cuero){//SETTER
        if (asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    public String dime_asientos(){
        if(asientos_cuero==true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de serie";
        }
    }

    public String isClimatizador() {
        if(climatizador==true){
            return "El coche tiene climatizador";
        }else{
            return "El coche tiene aire acondicionado";
        }
    }

    public void setClimatizador(String climatizador) {
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String pesoCoche(){
        int pesoCarroceria=500;
        peso_total=peso_plataforma+pesoCarroceria;
        if(asientos_cuero==true){
            peso_total+=50;
        }
        if(climatizador==true){
            peso_total+=20;
        }
        return "el peso del coche es "+peso_total;
    }

    public int precioCoche(){
        int precioFinal = 10000;
        if(asientos_cuero==true){
            precioFinal+=2000;
        }
        if(climatizador==true){
            precioFinal+=1500;
        }
        return precioFinal;
    }

}
