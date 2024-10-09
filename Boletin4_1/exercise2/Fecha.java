package Boletin4_1.exercise2;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor vacío que inicializa a una fecha por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2000;
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        setDia(dia);
        setMes(mes);
        this.año = año;
    }

    // Getters y setters con validaciones
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método para devolver la fecha formateada
    public String fechaFormateada(boolean formatoCorto) {
        if (formatoCorto) {
            return dia + "/" + mes + "/" + año;
        } else {
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                              "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            return dia + " de " + meses[mes - 1] + " de " + año;
        }
    }

    // Método estático para calcular la diferencia en años entre dos fechas
    public static int diferenciaFechas(Fecha f1, Fecha f2) {
        return Math.abs(f1.getAño() - f2.getAño());
    }
}
