package TITV_learning.Code.Bai76_NenVaGiaiNenTapTin;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    public static void main(String[] args) throws IOException {
        String sourceFile = "/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai76_NenVaGiaiNenTapTin/testZip.txt";
        FileOutputStream fos = new FileOutputStream("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai76_NenVaGiaiNenTapTin/compressed.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        File fileToZip = new File(sourceFile);
        FileInputStream fis = new FileInputStream(fileToZip);

        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zos.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes))>=0){
            zos.write(bytes , 0, length);
        }
        zos.close();
        fis.close();
        fos.close();
    }
}
