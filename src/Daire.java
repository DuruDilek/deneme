public class Daire {
private int x;
private int y;
private int yaricap;
public Daire(int x,int y,int yaricap){
    this.x=x;
    this.y=y;
    this.yaricap=yaricap;
}
public String toString(){
    return "konumu = (" + x + "," + y + ") - yarıçapı= " + yaricap;
}
public double AlanHesapla(){
    return Math.pow(yaricap,2)*Math.PI;
}
public Daire(int x,int y){
    this.x=x;
    this.y=y;
    this.yaricap=9;
}
public int getX(){
    return x;
}
public int setX(int x){
    this.x=x;
    return x;
}
}







