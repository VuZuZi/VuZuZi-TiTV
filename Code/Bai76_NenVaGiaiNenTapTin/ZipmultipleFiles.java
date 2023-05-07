package TITV_learning.Code.Bai76_NenVaGiaiNenTapTin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipmultipleFiles {
    public static void main(String[] args) throws IOException {
        List<String> srcFiles = Arrays.asList("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai76_NenVaGiaiNenTapTin/testZip1.txt","/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai76_NenVaGiaiNenTapTin/testZip.txt");
        FileOutputStream fos = new FileOutputStream("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai76_NenVaGiaiNenTapTin/testZipSuccess.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile: srcFiles
             ) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes))>=0){
                zipOut.write(bytes,0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();




    }
    private static void  zipfouder(File fileToZip, String fileName, ZipOutputStream zipOut) throws Exception{
        if (fileToZip.isHidden()){
            return;
        }
        if (fileToZip.isDirectory()){
            if (fileName.endsWith("/")){
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            }else {
                zipOut.putNextEntry(new ZipEntry(fileName+"/"));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childfile: children
                 ) {
                zipfouder(childfile,fileName+"/"+childfile.getName(),zipOut);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes= new byte[1024];
        int length;
        while ((length = fis.read(bytes))>=0){
            zipOut.write(bytes, 0 ,length);
        }
        fis.close();
    }
}
