/**
 * La clase Acceso recoge datos relacionados al momento 
 * que se accede al servidor (año, mes, día, hora, minutos).
 * @author Javier de Cea Domínguez.
 * @version 2018.02.25
 */
public class Acceso {
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    /**
     * Constructor para objetos de la clase Acceso.
     * @param ano El año en el que el usuario ha accedido al servidor.
     * @param mes El mes en el que el usuario ha accedido al servidor.
     * @param dia El día en el que el usuario ha accedido al servidor.
     * @param hora La hora en la que el usuario ha accedido al servidor.
     * @param minutos El minuto en el que el usuario ha accedido al servidor.
     */
    public Acceso(int ano, int mes, int dia, int hora, int minutos) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    /**
     * Devuelve la hora en la que el usuario ha accedido al servidor.
     * @return Devuelve un int que es la hora en la que el usuario ha accedido al servidor.
     */
    public int getHoraAcceso() {
        return hora;
    }
}