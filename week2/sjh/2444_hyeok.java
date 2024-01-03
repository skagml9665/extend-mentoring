import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write(" ".repeat(n - i) + "*".repeat(i * 2 - 1) + "\n");
        }
        for (int i = 1; i < n; i++) {
            bw.write(" ".repeat(i) + "*".repeat((n - i) * 2 - 1) + "\n");
        }

        bw.flush();
    }
}
