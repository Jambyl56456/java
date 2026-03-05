public class Task7 {
    public static void main(String[] args) {

        double[][] B = new double[5][5];
        double[] A = new double[5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                B[i][j]=Math.random()*20-10;
                System.out.print(B[i][j]+" ");

                if(B[i][j] > 0){
                    A[i]+=B[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("A массиві:");
        for(int i=0;i<5;i++){
            System.out.print(A[i]+" ");
        }
    }
}