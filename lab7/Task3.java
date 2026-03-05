public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double mult = 1;

        for(int i=0;i<12;i++){
            A[i]=Math.random()*20-10;
            System.out.print(A[i]+" ");

            if(A[i] < 0){
                mult *= A[i];
            }
        }

        System.out.println("\nТеріс элементтердің көбейтіндісі: " + mult);
    }
}