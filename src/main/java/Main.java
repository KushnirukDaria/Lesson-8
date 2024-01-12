import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long n = 10;
        var result = Stream.iterate(new long[] {1, 1}, f -> new long[] { f[1], f[0] + f[1] })
                .limit(n)
                .reduce((a, b) -> b)
                .get()[0];
        System.out.println(result);
    }
}
