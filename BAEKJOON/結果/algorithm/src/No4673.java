import java.util.Arrays;

public class No4673 {
    public static void main(String[] args) {

        boolean[] temp = new boolean[10000];
        for(int i=1; i<10000; i++) {
            if(d(i) < 10000) {
                temp[d(i)] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<temp.length; i++) {
            if(!temp[i])
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    private static int d(int num) {
        return num + sumMethod(num);
    }

    private static int sumMethod(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num %10;
            num /= 10;
        }
        return sum;
    }
}
