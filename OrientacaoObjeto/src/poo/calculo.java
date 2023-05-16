package poo;
import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {
    	// variaveis
    	
        Baskara B = new Baskara();
        Scanner in = new Scanner(System.in);
        float Z;
        double Y, X;

        System.out.println("Digite o X: ");
        X = in.nextFloat();
        System.out.println("Digite o Y: ");
        Y = in.nextDouble();
        System.out.println("Digite o Z: ");
        Z = in.nextFloat();

        B.setX(X);
        B.setY(Y);
        B.setZ(Z);

        System.out.println("Valor de  X: " + B.getX());
        System.out.println("Valor de  Y: " + B.getY());
        System.out.println("Valor de  Z: " + B.getZ());
        System.out.println("Valor de delta: " + B.Delta(X, Y, Z));
        B.getResultBaskara(B.getD(), Y, X);

        in.close();
    }

}