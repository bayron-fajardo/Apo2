import CLASES.*;

public class App{
    

    public static void main(String[] args) {
        
        Barco barco01 = new Barco(4, 3,4,4, 4, 5);
        System.out.println(barco01.getVida());

        barco01.shoot(4,3);
        System.out.println(barco01.getVida());
        barco01.shoot(4,3);
        barco01.shoot(4,3);
        barco01.shoot(4,3);
        System.out.println(barco01);


    }
}
