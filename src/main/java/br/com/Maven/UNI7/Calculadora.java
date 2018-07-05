/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Maven.UNI7;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;

/**
 *
 * @author gustavoscipiao
 */
@ManagedBean(name = "calc")
@SessionScoped
public class Calculadora implements Serializable {

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    private double resultado;

    public double getValor_x() {
        return valor_x;
    }

    public void setValor_x(double valor_x) {
        this.valor_x = valor_x;
    }

    public double getValor_y() {
        return valor_y;
    }

    public void setValor_y(double valor_y) {
        this.valor_y = valor_y;
    }

    private double valor_x;
    private double valor_y;

    public double somar(double a, double b) {
        return (int) (a + b);
    }

    public double subtrair(double a, double b) {
        return (int) (a - b);
    }

    /**
     *
     * @param operacao
     * @param a
     * @param valor_y
     * @param valor_x
     * @param b
     * @return
     * @throws java.lang.Exception
     * @ret
     */
    public double calcula(String operacao, double valor_x, double valor_y) throws NumberFormatException, Exception {
        Calculadora calc = new Calculadora();
        //double resultado = 0;
        switch (operacao) {
            case "SOMAR":
                double resultado;
                resultado = calc.somar(valor_x, valor_x);
                return resultado;
            case "SUBTRAIR":
                double resul = calc.subtrair(valor_x, valor_y);
                return resul;
        }
        return resultado;
    }

    private double somar_valor(double valor_x, double valor_x0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double subtrair_valor(double valor_x, double valor_y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


/*
    public double somar(double a, double b) {
        return a + b;
        //UIForm form = form.getParent().getChildren();
        //  FacesContext.getCurrentInstance().getExternalContext().redirect("");
    }

    public double subtrair(double a, double b) {
        return a - b;
    }
/*
    /*
    public void somar_valores(ActionEvent event){
        if (event.getActionCommand().)
    }
 */
