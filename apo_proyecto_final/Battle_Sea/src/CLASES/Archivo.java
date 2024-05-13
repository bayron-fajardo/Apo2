package CLASES;

import java.io.File;
public class Archivo {
    String nombre;
    public static void main(String[] args) {
        File archivo = new File("C:/Users/bayro/OneDrive/Escritorio/apo_proyecto_final/Battle_Sea/src/Doc");
        

        if (archivo.exists()){

            System.out.println("Ruta : " + archivo.getPath());
        }
    }
        

        

    
}
