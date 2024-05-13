package A10;

public class Data {
    /*Variables de clase*/
    private int dia;
    private int mes;
    private int any;

    /**
     * S'inicialitza el constructor Data
     *
     * @param dia el dia de naixement
     * @param mes el mes de naixement
     * @param any l'any de naixement
     */
    public Data(int dia, int mes, int any) {
        setAny(any);
        setMes(mes);
        setDia(dia);
    }

    /**
     * Aquest mètode comprova si el més donat és valid
     *
     * @param mes mes de naixement
     * @return si és un mes vàlid
     */
    public boolean validarMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    /**
     * Aquest mètode comprova si el dia donat és valid
     *
     * @param dia dia de naixement
     * @return si és un dia vàlid
     */
    public boolean validarDia(int dia) {
        /* S'inicialitza una variable per determinar si el dia és vàlid */
        boolean diaValid = false;

        /*Es fa la comprovació només si el mes és valid*/
        if (dia >= 1 && validarMes(this.mes)) {
            if ((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) && dia <= 31) {
                diaValid = true;
            } else if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && dia <= 30) {
                diaValid = true;
            } else if (this.mes == 2) {
                if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                    if (dia <= 29) {
                        diaValid = true;
                    }
                } else if (dia <= 28) {
                    diaValid = true;
                }
            }
        }
        return diaValid;
    }

    /**
     * Aquesta funció afegeix un dia més a la variable de la classe
     */
    public void afegir1Dia() {
        dia = (dia + 1) % 31; // Es calcula el mòdul del dia posterior
        // Si el mòdul dona 1 s'afegeix un mes a la data
        if (dia == 1) {
            mes = (mes + 1) % 12;
            // Si el modul del mes es igual a 1 s'afegeix un any més
            if (mes == 1) {
                any++;
            }
        }
    }

    public void setDia(int dia) {
        /*Es valida la data, sino és correcta es posa 01/01/2021*/
        if (validarDia(dia) && validarMes(this.mes)) {
            this.dia = dia;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.any = 2021;
        }
    }

    public void setMes(int mes) {
        /*Es valida la data, sino és correcta es posa 01/01/2021*/
        if (validarMes(mes)) {
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.any = 2021;
        }
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    /**
     * Retorna el format corresponent de la instància
     */
    @Override
    public String toString() {
        String data;

        if (this.dia < 10 && this.mes < 10 && this.any < 10) {
            data = "0" + this.dia + "/0" + this.mes + "/0" + this.any;
        } else if (this.dia < 10 && this.mes < 10) {
            data = "0" + this.dia + "/0" + this.mes + "/" + this.any;
        } else if (this.dia < 10 && this.any < 10) {
            data = "0" + this.dia + "/" + this.mes + "/0" + this.any;
        } else if (this.dia < 10) {
            data = "0" + this.dia + "/" + this.mes + "/" + this.any;
        } else if (this.mes < 10) {
            data = this.dia + "/0" + this.mes + "/" + this.any;
        } else if (this.any < 10) {
            data = this.dia + "/" + this.mes + "/0" + this.any;
        } else {
            data = this.dia + "/" + this.mes + "/" + this.any;
        }

        return data;
    }
}