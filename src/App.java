import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try(Scanner sc = new Scanner(System.in)){
            int seleccion;
            Menu m1 = new Menu();
            
            do{
                m1.showMenu();
                seleccion = sc.nextInt();
                m1.selectOperation(seleccion);
            }while(seleccion!=6);
        }
       
    }
}
