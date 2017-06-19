package ninja.farhood.exercises;

import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    private InputStream myInputStream;

    public MyScanner(InputStream in) {
        myInputStream = in;
    }


    public int nextInt() {
        try {
            return myInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
