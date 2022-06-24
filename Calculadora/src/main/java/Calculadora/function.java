package Calculadora;

import java.util.Scanner;

public class function {

    private Scanner scanner = new Scanner(System.in);
    private int lim, delta;
    private int a, b, c, d;
    private int maxLenght; 
    
    public void setLimit(int lim) {
        if(lim%2 == 0) {
            this.lim = lim;
        } else {
            this.lim = lim;
        }
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }


    public int getLimit() {
        return lim;
    }

    public void setDelta() {
        this.delta = (230 - 230%2)/2;
    }

    public int delta() {
        return delta;
    }

    public float getA() {
        return a; 
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b; 
    }

    public void setB(int b) {
        this.b = b;
    }

    public int solver(float x, boolean y) {
        if(y) {
            x = x - delta();
        } else {
            x = x + delta();
        }
        if(x < 0) {
            x = x * -1;
        }
        return (int) x;
    }
    
    public int getMaxLenght() { 
        return maxLenght;
    }
}
