import java.io.Console;

public class Solution {
    // class attributes
    private double x1, x2, x3, delta =0;
    private int numberSolution;
    private String message;

    // class methods
    public Solution(){
        x1 =0;
        x2 =0;
        x3 =0;
        numberSolution = 0;
    }

    public Solution(double x1, double x2, double x3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        delta = x2*x2 - 4*x1*x3; // compute delta
        if (delta > 0) {
            numberSolution = 2;
            System.out.println(x1 + "x² - " + x3 + " = 0 has two solutions (x = " + (x1) + " and x = " + x3 + ")");
        }
        else if(delta < 0)
            numberSolution = 0;
        else
            numberSolution = 1;

    }
}
