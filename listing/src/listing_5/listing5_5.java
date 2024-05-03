package listing_5;

import java.io.File;

public static void sameDataToDirFiles(String dir) {
    long modified = System.currentTimeMillis();
    File walkDir = new File(dir);
    String[] dirList = walkDir.list();
    for (int i = 0; i < dirList.length; i++) {
        File f = new File(dirList(i));
        if (f.isDirectory()) {
            sameDataToDirFiles(f.getPath());
            continue;
        }
        f.setLastModified(modified);
    }
}