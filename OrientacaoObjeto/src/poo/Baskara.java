package poo;

public class Baskara {

    // *** Atributos ***
	
    private double X = 0;
    private double Y = 0;
    private float Z = 0;
    private double D = 0;
    private double X1;
    private double X2;

    // *** Metodos ***
    public Baskara() {
    	
    }
    
    public double Delta(double X, double Y, float Z) {

        this.X = X;
        this.Y = Y;
        this.Z = Z;

        this.D = (Math.pow(Y, 2)) - (4 * X * Z);

        if (this.D > 0) {

            return this.D;

        } else if (this.D == 0) {

            System.out.println("Delta tera uma raiz");
            return this.D;

        } else {
            System.out.println("Delta não tem raiz");
            return 0;
        }

    }

    public void Bhaskara(double D, double Y, double X) {

        this.D = D;
        this.Y = Y;
        this.X = X;

        if (D > 0) {
            this.X1 = ((-(Y) + Math.sqrt(D)) / (2 * X));
            this.X2 = ((-(Y) - Math.sqrt(D)) / (2 * X));

            System.out.println("Valor de Baskara :" + " " + " X1 = " + this.X1 + " " + " X2 = " + this.X2);
        } else if (D == 0) {

            this.X1 = ((-(Y) + Math.sqrt(D)) / (2 * X));

            System.out.println("Valor de Baskara :" + this.X1);
        } else {

            System.out.println("Impossivel calcular Baskara");
        }

    }

    // ** Geters **
    
    public double getDelta(double X, double Y, float Z) {

        return this.Delta(X, Y, Z);
    }

    public void getResultBaskara(double D, double Y, double X) {

        this.Bhaskara(D, Y, X);
    }

    public double getD() {

        return this.D;
    }

    public double getX() {

        return this.X;
    }

    public double getY() {

        return this.Y;
    }

    public float getZ() {

        return this.Z;
    }

    // ** Seters **

    public void setX(double X) {
        this.X = X;

    }

    public void setX1(double X1) {
         this.X1 = X1;
    }

    public void setY(double Y) {

        this.Y = Y;

    }

    public void setZ(float Z) {
        this.Z = Z;

    }

    public void setD(double D) {
        this.D = D;
        
    }
}