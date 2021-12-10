package 第八章;

public class matirx {

    public static double[][] multiplyMatrix(double[][] a,double[][] b){
        double[][] c=new double[2][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int d=0;d<a[i].length;d++)
                    c[i][j]+=a[i][d]*b[d][j];
            }
        }
        return c;
    }
}