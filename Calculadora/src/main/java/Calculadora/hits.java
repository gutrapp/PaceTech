package Calculadora;



public class hits {

    private int[] hitSpot = new int[2];
    
    public hits(int x, float a, float b, float c, float d) {
        hitSpot[0] = (int) ((int) (x*x*x*a) + (x*x*b) + (x*c) + d);
        hitSpot[1] = x;
    }

    public int getY() {
        return hitSpot[0];
    }

    public int getX() {
        return hitSpot[1];
    }

}
