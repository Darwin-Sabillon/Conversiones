package conversiones;

import java.util.Scanner;

public class Conversiones {
    
    private static final String[] tipo = {"Lb", "Kg", "Km", "Mi"};

    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        double valor;
        int repetir = 1;
        int opcion;
        
        System.out.println("***** TABLA DE CONVERSION *****\n");
        
        while (repetir != 2) {
            System.out.println("Tipo de conversion a usar:");
            System.out.println("1 - Masa (Kg/Lb)");
            System.out.println("2 - Distancia (Km/Mi)");
            opcion = r.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad: ");
                    valor = r.nextInt();
                    
                    System.out.println("Convertir a: ");
                    System.out.println("1 - Kg a Lb");
                    System.out.println("2 - Lb a Kg");
                    opcion = r.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            masa(valor, tipo[0]);
                            break;
                        case 2:
                            masa(valor, tipo[1]);
                            break;
                        default:
                            System.out.println("Tipo de conversion no existe\n");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cantidad: ");
                    valor = r.nextInt();
                    
                    System.out.println("Convertir a: ");
                    System.out.println("1 - Km a Mi");
                    System.out.println("2 - Mi a Km");
                    opcion = r.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            distancia(valor, tipo[2]);
                            break;
                        case 2:
                            distancia(valor, tipo[3]);
                            break;
                        default:
                            System.out.println("Tipo de conversion no existe\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("Tipo de conversion no existe\n");
                    break;
            }
            System.out.println("Desea repetir?");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            repetir = r.nextInt();
        }
    }

    public static void masa(double valor, String tipo) {
        double resultado;
        if (tipo == Conversiones.tipo[0]) {
            resultado = valor / 2.2;
            System.out.println("Valor de la conversion: " + valor + Conversiones.tipo[1] + " a " + resultado + " " + tipo);
        } else {
            resultado = valor * 2.2;
            System.out.println("Se ha convertido: " + valor + Conversiones.tipo[0] + " a " + resultado + " " + tipo);
        }
    }

    public static void distancia(double valor, String tipo) {
        double resultado;
        if (tipo == Conversiones.tipo[3]) {
            resultado = valor / 1.60934;
            System.out.println("Valor de la conversion: " + valor + Conversiones.tipo[2] + " a " + resultado + " " + tipo);
        } else {
            resultado = valor * 1.60934;
            System.out.println("Valor de la conversion: " + valor + Conversiones.tipo[3] + " a " + resultado + " " + tipo);
        }
    }
    
}
