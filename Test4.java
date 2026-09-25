public class Test4 {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3};
        double[] decimals = (double[]) integers;//error becuz arrayint is tried to convert to double
        System.out.println(decimals[0]);
    } 
}
//real world applcn of typecasting