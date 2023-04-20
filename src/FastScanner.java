import java.io.*;

/**
 * @author Pavel Sharaev (mail@pechhenka.ru)
 */
class FastScanner implements AutoCloseable{
    private final BufferedReader reader;
    private final StringBuilder sb;

    public FastScanner(final InputStream inputStream) {
        this(new BufferedReader(new InputStreamReader(inputStream)));
    }

    public FastScanner(final BufferedReader reader) {
        this.reader = reader;
        this.sb = new StringBuilder();
    }

    public String next() {
        try {
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
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public float nextFloat() {
        return Float.parseFloat(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] nextIntArray(final int size) {
        final int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = nextInt();
        }
        return res;
    }

    public long[] nextLongArray(final int size) {
        final long[] res = new long[size];
        for (int i = 0; i < size; i++) {
            res[i] = nextLong();
        }
        return res;
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }
}
