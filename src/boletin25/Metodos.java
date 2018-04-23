package boletin25;

public class Metodos {
    
    
        int numj1, numj2, numj3, numj4, numj5, numj6;
        int numm1, numm2, numm3, numm4, numm5, numm6;

    public int getNumj1() {
        return numj1;
    }

    public void setNumj1(int numj1) {
        this.numj1 = numj1;
    }

    public int getNumj2() {
        return numj2;
    }

    public void setNumj2(int numj2) {
        this.numj2 = numj2;
    }

    public int getNumj3() {
        return numj3;
    }

    public void setNumj3(int numj3) {
        this.numj3 = numj3;
    }

    public int getNumj4() {
        return numj4;
    }

    public void setNumj4(int numj4) {
        this.numj4 = numj4;
    }

    public int getNumj5() {
        return numj5;
    }

    public void setNumj5(int numj5) {
        this.numj5 = numj5;
    }

    public int getNumj6() {
        return numj6;
    }

    public void setNumj6(int numj6) {
        this.numj6 = numj6;
    }

    public int getNumm1() {
        return numm1;
    }

    public void setNumm1(int numm1) {
        this.numm1 = numm1;
    }

    public int getNumm2() {
        return numm2;
    }

    public void setNumm2(int numm2) {
        this.numm2 = numm2;
    }

    public int getNumm3() {
        return numm3;
    }

    public void setNumm3(int numm3) {
        this.numm3 = numm3;
    }

    public int getNumm4() {
        return numm4;
    }

    public void setNumm4(int numm4) {
        this.numm4 = numm4;
    }

    public int getNumm5() {
        return numm5;
    }

    public void setNumm5(int numm5) {
        this.numm5 = numm5;
    }

    public int getNumm6() {
        return numm6;
    }

    public void setNumm6(int numm6) {
        this.numm6 = numm6;
    }
    
    public String generarNumerosJ(){

    numj1 = (int) (Math.floor(Math.random()*49+1));
    do{
    numj2 = (int) (Math.floor(Math.random()*49+1));
    }while(numj1 == numj2);
    do{
    numj3 = (int) (Math.floor(Math.random()*49+1));
    }while(numj2 == numj3 && numj1 == numj3);
    numj4 = (int) (Math.floor(Math.random()*49+1));
    do{
    numj5 = (int) (Math.floor(Math.random()*49+1));
    }while(numj4 == numj5 && numj3 == numj5 && numj2 == numj5 && numj1 == numj5);
    do{
    numj6 = (int) (Math.floor(Math.random()*49+1));
    }while(numj6 == numj5 && numj6 == numj4 && numj6 == numj3 && numj6 == numj2 && numj6 == numj1);
        return (numj1+"-"+numj2+"-"+numj3+"-"+numj4+"-"+numj5+"-"+numj6);
    }
    
    public String generarNumerosM(){
        
    numm1 = (int) (Math.floor(Math.random()*49+1));
    do{
    numm2 = (int) (Math.floor(Math.random()*49+1));
    }while(numm1 == numm2);
    do{
    numm3 = (int) (Math.floor(Math.random()*49+1));
    }while(numm2 == numm3 && numm1 == numm3);
    numm4 = (int) (Math.floor(Math.random()*49+1));
    do{
    numm5 = (int) (Math.floor(Math.random()*49+1));
    }while(numm4 == numm5 && numm3 == numm5 && numm2 == numm5 && numm1 == numm5);
    do{
    numm6 = (int) (Math.floor(Math.random()*49+1));
    }while(numm6 == numm5 && numm6 == numm4 && numm6 == numm3 && numm6 == numm2 && numm6 == numm1);
        return (numm1+"-"+numm2+"-"+numm3+"-"+numm4+"-"+numm5+"-"+numm6);
    }
    
    
/*
    Obtener los numeros de las casillas marcadas en el "tablero"
    Obtener los numeros generados aleatoriamente
    Comprobar cuantos numeros coinciden
    Mostrar el resultado
    
    
*/
        
        
        
    
}
