import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);

    public void suma(){
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========= Suma =========");
        System.out.print("Digita la cantidad de elementos a sumar: ");
        int n = sc.nextInt();

        System.out.print("\nDigita los elementos a sumar: ");
        
        int aSuma [];
        double suma = 0;
        aSuma = new int[n]; 

        
        for(int i=0;i<n;i++){
            aSuma[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            suma+=aSuma[i];
        }

        System.out.println("La suma es: "+suma);
        System.out.println("\n====================");

    }

    public void producto(){
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========= Producto =========");
        System.out.print("Digita la cantidad de elementos a multiplicar: ");
        int n = sc.nextInt();
        System.out.print("\nDigita los elementos a multiplicar: ");
        
        double producto = 1;
        double aProducto[];
        aProducto = new double[n];
        
        for(int i=0;i<n;i++){
            aProducto[i] = sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            producto*=aProducto[i];
        }

        System.out.println("El producto es: "+producto);
        System.out.println("\n====================");

    }

    public void potencia(){
        double base;
        double exp;
        long potencia = 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========= Potencia =========");
        System.out.print("\nDigita la base: ");
        base = sc.nextDouble();
        System.out.print("Diita el exponente: ");
        exp = sc.nextDouble();

        for(int i=1;i<=exp;i++){
            potencia*=base;
        }

        
        System.out.println("La potencia es: "+potencia);
        System.out.println("\n====================");

    }

    public void factorial(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========= Factorial =========");
        int n;
        int factor = 1;

        System.out.print("Digita el numero para calcular el factorial: ");
        n = sc.nextInt();
        for(int i=n;i>0;i--){
            factor*=i;
        }

        System.out.println("El factorial es: "+factor);
        System.out.println("\n====================");

    }

    public void promedio(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========= Promedio =========");
        System.out.print("Digita la cantidad de elementos: ");
        int n = sc.nextInt();
        double promedio = 0;
        double aPromedio[] = new double[n];

        System.out.print("Digita los elementos: ");
        for(int i=0;i<n;i++){
            aPromedio[i] = sc.nextDouble();
        }

        for(int i =0;i<n;i++){
            promedio+=aPromedio[i];
        }

        promedio/=n;

        System.out.println("El promedio es: "+promedio);
        System.out.println("\n====================");
    }
}
