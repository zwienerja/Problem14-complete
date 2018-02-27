public class Problem14 {
    public static void main(String[] args) {
        System.out.println("hi");
        long longestLength = -1;
        for (int i = 10; i <= 1000000; i++) {
            long sizeOfChain = lengthOfChain(i);
            if (sizeOfChain > longestLength) {
                longestLength = i;
                System.out.println(longestLength + "     " + sizeOfChain);
            }
        }
        System.out.println("hello" + longestLength);
    }

    private static long lengthOfChain(long n){
        long count = 1;
        while (n > 1){
            if (n % 2 == 0){
                n = n / 2;
            }
            else {
                n = n + n + n + 1;
            }
            count+=1;
        }
        return count;
    }
}
