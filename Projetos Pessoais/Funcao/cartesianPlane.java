package shut.it;

import java.util.ArrayList;

public class cartesianPlane {
    
    private function fx = new function();
    private String[][] cartesianPlane = new String[fx.getMaxLenght()][fx.getMaxLenght()];
    private int counter = fx.getLimit() * -1;
    private ArrayList<hits> dots = new ArrayList<hits>();

    public cartesianPlane() {
        setDots();
        inicializeCartesianPlane();
    }

    public void inicializeCartesianPlane() {
        for(int y = 0; y <= fx.getMaxLenght()-1; y++) {
            for(int x = 0; x <= fx.getMaxLenght()-1; x++) {
                if(x > fx.getMaxLenght() || y > fx.getMaxLenght() ) {
                    break;
                } else {
                    if(y == fx.getMaxLenght()/2) {
                        cartesianPlane[y][x] = "-";
                    } else if(x == fx.getMaxLenght()/2) {
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
            for(int y = 0; y <= fx.getMaxLenght()-1 ; y++) {
                for(int x = 0; x <= fx.getMaxLenght()-1 ; x++) {
                    if(x > fx.getMaxLenght() || y > fx.getMaxLenght()) {
                        break;
                    } else if(y == fx.solver(dots.getY(), true) && x == fx.solver(dots.getX(), false)) {
                        cartesianPlane[y][x] = "O";
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public void showDots() {
        for (hits dots : dots) { 
            System.out.println("f("+dots.getX()+") = "+dots.getY());
        }
    }
    

    public void showCartesianPlane() {
        for(int y = 0; y <= fx.getMaxLenght()-1 ; y++) {
            System.out.println();
            for(int x = 0; x <= fx.getMaxLenght()-1 ; x++) {
                if(x > fx.getMaxLenght() -1 || y > fx.getMaxLenght() -1) {
                    break;
                } else {
                    System.out.print(cartesianPlane[y][x]);
                }
            }
        }
        System.out.println();
    }

    public void setDots() { 
        while(counter <= fx.getLimit()) {
            dots.add(new hits(counter, fx.getA(), fx.getB(), fx.getC(), fx.getD()));
            counter++;
        }
    }

}
