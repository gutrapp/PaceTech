package Calculadora;

import java.util.ArrayList;

public class cartesianPlane {
    
    private function fx = new function();
    private String[][] cartesianPlane = new String[230][230];
    private ArrayList<hits> dots = new ArrayList<hits>();
    private String line;
    private int counter;
    private String[] dotsPrint = new String[500];

    public void inicializeCartesianPlane() {
        for(int y = 0; y <= 230-1; y++) {
            for(int x = 0; x <= 230-1; x++) {
                if(x >= 230 || y >= 230) {
                    break;
                } else {
                    if(y == 230/2) {
                        cartesianPlane[y][x] = "-";
                    } else if(x == 230/2) {
                        cartesianPlane[y][x] = "|";
                    } else {
                        cartesianPlane[y][x] = " ";
                    }
                }
            }   
        }
    }

    public void setCartesianPlane() {
        for (hits dots : dots) { 
            for(int y = 0; y <= 230-1 ; y++) {
                for(int x = 0; x <= 230-1 ; x++) {
                    if(x > 230 || y > 230) {
                        break;
                    } else if (dots.getY() >= 230 || dots.getX() >= 230) {
                        continue;
                    } else if(y == fx.solver(dots.getY(), true) && x == fx.solver(dots.getX(), false)) {
                        cartesianPlane[y][x] = "O";
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public String showDots(int x) {
        if(x == dots.size()) {
            return "";
        }
        dotsPrint[x] = "f("+dots.get(x).getX()+") = "+dots.get(x).getY();
        return dotsPrint[x];
    }

    public String getCartesianPlane(int y) {
        String plane = "";
        for(int x = 0; x < 230 ; x++) {
            plane = plane + " " +cartesianPlane[y][x]; 
        }
        return plane;
    }

    public void setDots() {
        int counter = fx.getLimit() * -1;
        while(counter <= fx.getLimit()) {
            dots.add(new hits(counter, fx.getA(), fx.getB(), fx.getC(), fx.getD()));
            counter++;
        }
    }
    
    public void setTerms(int a, int b, int c, int d, int lim) {
        fx.setA(a);
        fx.setB(b);
        fx.setC(c);
        fx.setD(d);
        fx.setLimit(lim);
        fx.setDelta();
        setDots();
        setCartesianPlane();
        
        
    }

}
