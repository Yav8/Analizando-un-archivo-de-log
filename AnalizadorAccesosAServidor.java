import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Clase AnalizadorAccesosAServidor.
 * @author Javier de Cea Domínguez.
 */
public class AnalizadorAccesosAServidor {
    private ArrayList<Acceso> listaDeDatosDeAcceso;
    
    /**
     * Constructor de la clase AnalizadorAccesosAServidor.
     */
    public AnalizadorAccesosAServidor() {
        listaDeDatosDeAcceso = new ArrayList<>();
    }
    
    /**
     * Lee el archivo de log introducido por parámetro y guarda sus datos.
     * @param nombreDelArchivoDeLog El nombre del archivo de log
     * que va a ser leído.
     */
    public void analizarArchivoDeLog(String nombreDelArchivoDeLog) {
        try {
            Scanner sc = new Scanner(new File(nombreDelArchivoDeLog));
            while(sc.hasNextLine()) {
                String[] arrayDeNumeros = sc.nextLine().split(" ");
                listaDeDatosDeAcceso.add(new Acceso(Integer.parseInt(arrayDeNumeros[0]), Integer.parseInt(arrayDeNumeros[1]), Integer.parseInt(arrayDeNumeros[2]), Integer.parseInt(arrayDeNumeros[3]), Integer.parseInt(arrayDeNumeros[4])));
            }
            sc.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Devuelve la hora con mas accesos y la muestra por pantalla,
     * en caso de no haber ningún acceso informa de dicho acontecimiento.
     * @return Devuelve un int que equivale a la hora con más accesos.
     * Si hay empate, devuelve la más alta.
     */
    public int obtenerHoraMasAccesos() {
        int horaConMasAccesos = -1;
        HashSet<Integer> conjuntoDeHoras = new HashSet<>();
        
        for(Acceso acceso : listaDeDatosDeAcceso) {
            conjuntoDeHoras.add(acceso.getHoraAcceso());
        }
        
        int contadorDeHorasIgualesMasAlto = 0;
        
        for(int hora : conjuntoDeHoras) {
            int contadorDeHorasIguales = 0;
            for(Acceso acceso : listaDeDatosDeAcceso) {
                if(hora == acceso.getHoraAcceso()) {
                    contadorDeHorasIguales += 1;
                }
            }
            if(contadorDeHorasIguales > contadorDeHorasIgualesMasAlto) {
                contadorDeHorasIgualesMasAlto = contadorDeHorasIguales;
                horaConMasAccesos = hora;
            }
            else if(contadorDeHorasIguales == contadorDeHorasIgualesMasAlto && horaConMasAccesos < hora) {
                horaConMasAccesos = hora;
            }
        }
        
        if(horaConMasAccesos == -1) {
            System.out.println("Todavía no ha habido ningún acceso.");
        }
        else {
            System.out.println(horaConMasAccesos);
        }
        
        listaDeDatosDeAcceso = new ArrayList<>();
        
        return horaConMasAccesos;
    }
}