
public class Menu {
    Calculadora c1 = new Calculadora();

    public void showMenu(){
        System.out.println("\nJava calculator");
        System.out.println("====================");
        System.out.println("1. Suma");
        System.out.println("2. Multiplicacion");
        System.out.println("3. Potencia");
        System.out.println("4. Factorial");
        System.out.println("5. Promedio");
        System.out.println("6. Salir");
        System.out.print("Digita la operacion que quieres realizar: ");
    }

    public void selectOperation(int n){
        switch(n){
            case 1: 
                c1.suma();
                break;
            case 2: 
                c1.producto();
                break;
            case 3: 
                c1.potencia();
                break;
            case 4: 
                c1.factorial();
                break;
            case 5: 
                c1.promedio();
                break;
            case 6:
                System.out.println("Gracias por usar la calculadora");
                break;
            default:
                System.out.println("Selecciona un numero correcto");
                break;
            }
    }
}
