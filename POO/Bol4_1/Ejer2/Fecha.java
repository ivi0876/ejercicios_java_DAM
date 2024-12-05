package POO.Bol4_1.Ejer2;

public class Fecha {
    private int dia;
    private int mes;
    private int year;

    // Constructor vacío que inicializa a una fecha por defecto
    public Fecha() {
        this.dia = 3;
        this.mes = 12;
        this.year = 2024;
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int year) {
        setDia(dia);
        setMes(mes);
        this.year = year;
    }

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

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String fechaFormateada(boolean formato) {
        if (formato) {
            return dia + "/" + mes + "/" + year;
        } else {
            
        }
    }

    public static int diferenciaFechas(Fecha fecha1, Fecha fecha2) {
        return Math.abs(fecha1.getYear() - fecha2.getYear());
    }
}
