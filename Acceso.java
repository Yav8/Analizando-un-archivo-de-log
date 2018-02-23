/**
 * Clase Acceso.
 * @author Javier de Cea Domínguez.
 */
public class Acceso {
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    /**
     * Constructor de la clase Acceso.
     * @param ano El año en el que el usuario ha accedido.
     * @param mes El mes en el que el usuario ha accedido.
     * @param dia El día en el que el usuario ha accedido.
     * @param hora La hora en la que el usuario ha accedido.
     * @param minutos El minuto en el que el usuario ha accedido.
     */
    public Acceso(int ano, int mes, int dia, int hora, int minutos) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    /**
     * Devuelve la hora en la que el usuario ha accedido.
     * @return Devuelve un int que es la hora en la que el usuario ha accedido.
     */
    public int getHoraAcceso() {
        return hora;
    }
}