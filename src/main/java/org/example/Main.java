package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;

        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos: ");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();



        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

        //PROCESOS DE ALGORITMO

        //1. CALCULAR LA EDAD DEL USUARIO
        int edadUsuario= anioActual-anioNacimientoCliente;

        System.out.println("Apreciado "+nombresCompletosCliente+" usted tiene "+edadUsuario+" años");

        //2. Comparar y decidir sobre el salario
        final double valorSalarioMinimo=1300000;

        double numeroSalarios=salarioCliente/valorSalarioMinimo;


        // Redondear a dos cifras decimales
        // Definir el formato con dos cifras decimales y redondeo hacia arriba

        /*DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00", simbolos);
        df.setRoundingMode(RoundingMode.HALF_UP); // Puedes cambiar el modo de redondeo según necesites

        String numeroSalariosFormateado = df.format(numeroSalarios);

        System.out.println("Usted gana: " + numeroSalariosFormateado + " SMLV");*/

        String formatoDos=String.format("%.2f", numeroSalarios);
        System.out.println("Usted gana: " + formatoDos + " SMLV");

        //condicion logica para validar si tiene platica
        if(numeroSalarios>=3.0){
            //camino de verdad
            System.out.println("Bienvenido patron");
        }else{
            //camino negacion
            System.out.println("Chao Patron");
        }



    }
}