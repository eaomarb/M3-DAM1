package A10;

public class Data {
    private int dia;
    private int mes;
    private int any;

    public Data(int dia, int mes, int any) {
        if (!validarDia(dia) && !validarMes(mes)) {
            setDia(1);
            setMes(1);
            setAny(2021);
        } else {
            setDia(dia);
            setMes(mes);
            setAny(any);
        }
    }

    private boolean validarMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    private boolean validarDia(int dia) {
        boolean diaValid = false;

        if (dia >= 1) {
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

    public void afegir1Dia() {
        int dies = dia;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dies = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dies = 30;
        } else if (mes == 2) {
            if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                dies = 29;
            } else {
                dies = 28;
            }
        }

        dia = (dia + 1) % dies;

        if (dia == 0) {
            mes = (mes + 1) % 12;
            if (mes == 0) {
                any = any + 1;
            }
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (validarDia(dia)) {
            this.dia = dia;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.any = 2021;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if (validarMes(mes)) {
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.any = 2021;
        }
    }

    public int getAny() {
        return this.any;
    }

    public void setAny(int any) {
        this.any = any;
    }

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