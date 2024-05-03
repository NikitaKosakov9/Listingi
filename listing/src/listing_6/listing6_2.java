package listing_6;

import java.io.IOException;

class ExecProcess {
    public static void main (String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

