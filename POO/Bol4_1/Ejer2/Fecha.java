// TODO: Pendiente de validar

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
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre","diciembre"};
            return dia + " de " + meses[mes - 1] + " de " + year;
        }
    }

    /*
     public String obtenerFecha(int dia, int mes, int year) {
    String fecha;
    switch (mes) {
        case 1:
            fecha = dia + " de enero de " + year;
            break;
        case 2:
            fecha = dia + " de febrero de " + year;
            break;
        case 3:
            fecha = dia + " de marzo de " + year;
            break;
        case 4:
            fecha = dia + " de abril de " + year;
            break;
        case 5:
            fecha = dia + " de mayo de " + year;
            break;
        case 6:
            fecha = dia + " de junio de " + year;
            break;
        case 7:
            fecha = dia + " de julio de " + year;
            break;
        case 8:
            fecha = dia + " de agosto de " + year;
            break;
        case 9:
            fecha = dia + " de septiembre de " + year;
            break;
        case 10:
            fecha = dia + " de octubre de " + year;
            break;
        case 11:
            fecha = dia + " de noviembre de " + year;
            break;
        case 12:
            fecha = dia + " de diciembre de " + year;
            break;
        default:
            fecha = "Fecha inválida";
            break;
    }
    return fecha;
}

     */

    public static int diferenciaFechas(Fecha fecha1, Fecha fecha2) {
        return Math.abs(fecha1.getYear() - fecha2.getYear());
    }
}
