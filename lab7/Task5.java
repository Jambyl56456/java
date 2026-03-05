public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        for(int i=0;i<17;i++){
            D[i]=Math.random()*50;
            System.out.print(D[i]+" ");
            sum += D[i];
        }

        double avg = sum/17;

        System.out.println("\nАрифметикалық орта: " + avg);
    }
}