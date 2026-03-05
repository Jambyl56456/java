public class Task4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        double mult = 1;

        for(int i=0;i<25;i++){
            C[i]=Math.random()*20-10;
            System.out.print(C[i]+" ");

            if(C[i] > 0){
                mult *= C[i];
            }
        }

        System.out.println("\nОң элементтердің көбейтіндісі: " + mult);
    }
}