/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ezpheliarmuz.sesion2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Sesion2 {

    public static void main(String[] args) {
        sumaDosNumeros();
        //Ingreso de datos por teclado.
        //System.in para que funcione por defecto.
       // Scanner sc=new Scanner(System.in);
        //Suma de dos números dinamicos por teclado
        /*int num1,num2,resultado;
        
        System.out.println("Ingrese el primer número");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=sc.nextInt();
        resultado=num1+num2;
        System.out.println("El resultado es : "+resultado);
        //Ingrese su nombre, edad y sueldo por teclado
        //Variables
        int edad;
        String nombre;
        double sueldo;
        //Entrada
        System.out.println("Ingrese su nombre");
        nombre=sc.nextLine();
        
        System.out.println("Ingrese su edad");
        edad=sc.nextInt();
        
        System.out.println("Ingrese su sueldo");
        sueldo=sc.nextDouble();
        // Salida
        System.out.println("\n==========================");
        System.out.println("El nombre es : "+nombre);
        System.out.println("La edad es : "+edad);
        System.out.println("El sueldo es : "+sueldo);
        
*/
        //Condicionales
        // Condicionales IF
        
       /* if (10>5) {
              System.out.println("10 es mayor a 5");
        }
        int condicionalNum1=10,condicionalNum2=8;
        if (condicionalNum1>condicionalNum2) {
            System.out.println("10 es mayor a 8");
        }
        //condicional IF ELSE
        int edad=17;
        if (edad<18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }
        
        //condocionales aninadas
        int hora=14;
        if (hora<=12) {
            System.out.println("Es Mañana");
        } else if(hora==13){
            System.out.println("Es medio dia");
        }
        else{
            System.out.println("Es noche");
            }
            
        //Condicionales utilizando operadores ternarios
        int edad2=20;
        String ResultadoEdad=(edad2<18)?"Menor de Edad":"Mayor de edad";
        System.out.println(ResultadoEdad);
        System.out.println("\n==========================");
        //Switch case
        
        int diaSemana =78;
        switch (diaSemana) {
            case 1: 
                 System.out.println("Es Lunes");
            break;
            case 2: 
                 System.out.println("Es Martes");
            break;
            case 3: 
                 System.out.println("Es Miercoles");
            break;
            case 4: 
                 System.out.println("Es Jueves");
            break;
            case 5: 
                 System.out.println("Es Viernes");
            break;
            case 6: 
                 System.out.println("Es Sabado");
            break;
            case 7: 
                 System.out.println("Es Domingo");
            break;
            default:
                 System.out.println("No ingreso un dia valido");
        }
        System.out.println("\n==========================");
        //Ciclos infinitos While
        int contadorWhile=0;
        // Se ejecura siempre y cuando la condicion sea verdadera
        while (contadorWhile<=10) {
            System.out.println(contadorWhile);
            contadorWhile++;
        }
        System.out.println("\n==========================");
        //Do While
        // Aqui siempre se ejecuta una vez la instruccion como minimo
         int contadorDoWhile=0;
        // Se ejecura siempre y cuando la condicion sea verdadera
        do {            
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile<5);
        System.out.println("\n==========================");
        //Ciclos finitos FOR
        for (int i = 0; i < 6; i++) {
             System.out.println(i);
        }
         System.out.println("\n==========================");
        //FOR EACH nos sirve para recorrer arreglos, vectores, matrices
        
        String [] AlumnosForEach={"Frank","Liliana","Claudio","Vinicio"};
        //Mostrar todos los registros
        for (String iForEach:AlumnosForEach) {
              System.out.println(iForEach);
        }
        
        //Matrices unidimencionales 
        String [] matrizAutos={"Toyota","BMW","Ford","Mazda"};
        //Mostrando valores de la matriz por posiciones
              System.out.println(matrizAutos[3]);
        
       System.out.println("\n*******************************");   
        //Cambiando el valor de mi matriz
        matrizAutos[1]="Nizan";
        //Mostrar todos los registros
        for (String iForEach2:matrizAutos) {
              System.out.println(iForEach2);
        }
        System.out.println("\n*******************************");
        //Matrices Multidimencionales
        int [][] matriMultidimensional={{1,2,3,4},{5,6,7,8}};
        int misElementos=matriMultidimensional[1][0];
        System.out.println(misElementos);
         System.out.println("\n*******************************");
        //Mostrar Todos los datos de mi matriz multimencional
        for (int j2 = 0; j2 < matriMultidimensional.length; j2++) {
            System.out.print("\n");
            for (int k2 = 0; k2 < matriMultidimensional[j2].length; k2++) { 
                System.out.print(matriMultidimensional[j2][k2]);
        }
      }*/
        sumaDosNumerosArgumentos(1, 14);
        nombreNacionalidad("Vinicio", "Ecuatoriano");
    }
    
    //metodo convecional
      public static void sumaDosNumeros() {
        int num1=5,num2=6;
        int resultado=num1+num2;
       System.out.println(resultado);
    }
      
    //Metodo con argumento 
       public static void sumaDosNumerosArgumentos(int numero1,int numero2) {
            int resultado=numero1+numero2;
            System.out.println("La suma es: "+resultado);
       }
       
    //Metodo mostrar nombre y nacionalidad
       public static void nombreNacionalidad(String nombre,String nacionalidad) {
            System.out.println("Mi nombre es: "+nombre);
             System.out.println("Mi nacionalidad es: "+nacionalidad);
       } 
}
