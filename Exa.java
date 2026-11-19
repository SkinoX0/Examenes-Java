/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miguel.lopez14
 */

    
import java.util.Scanner;

public class Exa {

static double volumenCubo(double lado) {
return Math.pow(lado, 3);
}

static double volumenPrismaRectangular(double largo, double ancho, double alto) {
return largo * ancho * alto;
}

static double volumenCilindro(double radio, double altura) {
return Math.PI * Math.pow(radio, 2) * altura;
}

static double volumenEsfera(double radio) {
return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
}

static double volumenCono(double radio, double altura) {
return (Math.PI * Math.pow(radio, 2) * altura) / 3.0;
}

//Aquí vamos a escribir las Funciones Auxiliares

static void mostrarResultado(String Nombre, double Volumen){
System.out.println("El volumen de " + Nombre + " es: " + Volumen);
}

static void errorMedidas() {
System.out.println("Error: las medidas no pueden ser negativas");
}

//Aquí escribimos el Programa Principal

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int Opción;

do {
System.out.println("----- CALCULADORA DE VOLUMENES -----");
System.out.println("1. Cubo");
System.out.println("2. Prisma rectangular");
System.out.println("3. Cilindro");
System.out.println("4. Esfera");
System.out.println("5. Cono");
System.out.println("0. Salir");
System.out.println("Elige una opción:");

Opción = sc.nextInt();

switch (Opción) {

case 1:
{
System.out.println("Ingresa el lado: ");
double l = sc.nextDouble();
if (l < 0) errorMedidas();
else mostrarResultado("Cubo", volumenCubo(l));
break;
}

case 2:
{
System.out.println("Ingresa el largo");
double largo = sc.nextDouble();
System.out.println("Ingresa el ancho");
double ancho = sc.nextDouble();
System.out.println("Ingresa el alto");
double alto = sc.nextDouble();
if (largo < 0 || ancho < 0 || alto < 0) errorMedidas();
else mostrarResultado("Prisma rectangular", volumenPrismaRectangular(largo, ancho, alto));
break;
}

case 3:
{
System.out.println("Ingresa el radio");
double r = sc.nextDouble();
System.out.println("Ingresa la altura");
double h = sc.nextDouble();
if (r < 0 || h < 0) errorMedidas();
else mostrarResultado("Cilindro", volumenCilindro(r, h));
break;
}

case 4:
{
System.out.println("Ingresa el radio");
double r = sc.nextDouble();
if (r < 0) errorMedidas();
else mostrarResultado("Esfera", volumenEsfera(r));
break;
}

case 5:
{
System.out.println("Ingresa el radio");
double r = sc.nextDouble();
System.out.println("Ingresa la altura");
double h = sc.nextDouble();
if (r < 0 || h < 0) errorMedidas();
else mostrarResultado("Cono", volumenCono(r, h));
break;
}

case 0:
System.out.println("Adiós");
break;

default:
System.out.println("Opción no válida \n");
}
}
while (Opción != 0);
sc.close();
}
}