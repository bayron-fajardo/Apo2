
package CLASES;
public class Barco {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int vida;

    public Barco(int x1, int y1, int x2, int y2 , int x3 , int y3) {
        
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        vida = 4;

    }
    @Override
    public String toString(){
        return "***Coordinadas del barco*** \n" + "(" + this.x1+ this.y1+  ")";
    }
    public void shoot(int x , int y){
        if(x > 0 && y > 0){
            this.shipHit(x, y);
        }else{
            System.out.println("Solo se permiten números positivos");
        }
    }
    public void shipHit(int x, int y){

        if(((x == this.x1)||(x == this.x2) || (x == this.x3)) && ((y == this.y1) || (y == this.y2) || (y == this.y3))){
            System.out.println("Tu barco ha sido golpeado");
            if(this.vida == 0){
                System.out.println("El barco ha sido destruido");
            }else{
                this.vida -=1;
            }
            
            
        }else{
            System.out.println("Ningun barco golpeado, intenta de nuevo");
        }
    }
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
