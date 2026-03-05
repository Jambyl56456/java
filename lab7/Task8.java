public class Task8 {
    public static void main(String[] args) {

        double[][] A = new double[12][6];
        double[] mult = new double[6];

        for(int j=0;j<6;j++){
            mult[j]=1;
        }

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){
                A[i][j]=Math.random()*20-10;
                System.out.print(A[i][j]+" ");

                if(A[i][j] < 0){
                    mult[j]*=A[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Баған бойынша көбейтінді:");
        for(int j=0;j<6;j++){
            System.out.print(mult[j]+" ");
        }
    }
}