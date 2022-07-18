package shut.it;

import java.util.Scanner;

public class function {

    private Scanner scanner = new Scanner(System.in);
    private int lim, delta;
    private int a, b, c, d;
    private int maxLenght; 

    public function() {
        setLimit();
        setA();
        setB();
        setC();
        setD();

        setMaxLenght();
        setDelta(getMaxLenght());
    }
    
    public void setLimit() {
        System.out.print("Limit of inputs: ");
        this.lim = scanner.nextInt();
    }

    public void setC() {
        System.out.println("c:");
        this.c = scanner.nextInt();
    }

    public void setD() {
        System.out.println("d:");
        this.d = scanner.nextInt();
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

    public void setDelta(int lim) {
        this.delta = (lim - lim%2)/2;
    }

    public int delta() {
        return delta;
    }

    public float getA() {
        return a; 
    }

    public void setA() {
        System.out.println("a:");
        this.a = scanner.nextInt();
    }

    public void setMaxLenght() {
        this.maxLenght = (int) ((int) (lim*lim*lim*getA()) + (lim*lim*getB()) + (lim*getC()) + getD()) *2;;
        if (maxLenght < 0) {
            this.maxLenght = this.maxLenght * -1;
        }
    }

    public float getB() {
        return b; 
    }

    public void setB() {
        System.out.println("b:");
        this.b = scanner.nextInt();
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
