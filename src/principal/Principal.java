package principal;

import conversorMonedas.funcion;
import conversorTemperatura.funcionTemperatura;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        funcion monedas = new funcion();
        funcionTemperatura temperatura = new funcionTemperatura();

        boolean flag = true;
        while (flag) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                if (ValidarNumero(input)) {
                    double Minput = Double.parseDouble(input);
                    monedas.ConvertirMonedas(Minput);

                    int respuesta= 0;
                    respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversion?");
                    if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                    }else {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }
                    break;
            }

        }

    }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}