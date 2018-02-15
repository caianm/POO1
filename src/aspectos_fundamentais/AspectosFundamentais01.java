/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspectos_fundamentais;

/**
 *
 * @author Caian Monteiro
 */
public class AspectosFundamentais01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 1, y = 2;
//        final double z = 2.99;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        int x = 10; int y = 3;
//        System.out.println("X = " + x);
//        System.out.println("Y = " + y);
//        System.out.println("-X = " + (-x));
//        System.out.println("X/Y = " + (x/y));
//        System.out.println("O resto de X por Y = " + (x % y));
//        System.out.println("O inteiro de X por Y = " + (int)(x / y));
//        System.out.println("X + 1 = " + (x ++));

//        for(int x = args.length; x > 0; x -- ){
//            System.out.println(args[x-1]);
//        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        if(x > y){
            System.out.println("O valor maior é: " + x);
        } else {
            System.out.println("O valor maior é: " + y);
        }
    }
    
}
