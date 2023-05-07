package TITV_learning.Code.Bai76_NenVaGiaiNenTapTin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipDirectory {
    public static void main(String[] args) throws Exception {
        String sourceFile = "/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/Code/src/TiTV/Bai76_NenVaGiaiNenTapTin/testZip";
        FileOutputStream fos = new FileOutputStream("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/Code/src/TiTV/Bai76_NenVaGiaiNenTapTin/dir.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fIleToZip = new File(sourceFile);

        zipfouder(fIleToZip,fIleToZip.getName(),zipOut);
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

