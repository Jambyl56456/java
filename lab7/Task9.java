public class Task9 {
    public static void main(String[] args) {

        int[][] C = new int[5][5];
        int mult = 1;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                C[i][j]=(int)(Math.random()*20-10);
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            if(C[i][i] > 0){
                mult *= C[i][i];
            }
        }

        System.out.println("Көбейтінді: " + mult);
    }
}