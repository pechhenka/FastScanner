import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
class FastScanner {
    private final BufferedReader reader;
    private final StringBuilder sb;

    public FastScanner(final InputStream inputStream) {
        this(new BufferedReader(new InputStreamReader(inputStream)));
    }

    public FastScanner(final BufferedReader reader) {
        this.reader = reader;
        this.sb = new StringBuilder();
    }

    public String next() throws IOException {
        sb.setLength(0);
        int code;
        boolean isFirstWhitespace = true;
        while ((code = reader.read()) != -1) {
            final char ch = (char) code;
            if (Character.isWhitespace(ch)) {
                if (!isFirstWhitespace) {
                    return sb.toString();
                }
                continue;
            }
            isFirstWhitespace = false;
            sb.append(ch);
        }

        if (sb.length() == 0) {
            throw new IOException("EOF");
        } else {
            return sb.toString();
        }
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public int[] nextIntArray(final int size) throws IOException {
        final int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = nextInt();
        }
        return res;
    }

    public long[] nextLongArray(final int size) throws IOException {
        final long[] res = new long[size];
        for (int i = 0; i < size; i++) {
            res[i] = nextLong();
        }
        return res;
    }
}
