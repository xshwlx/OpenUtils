package com.antilope.openutils.fileop;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.util.Enumeration;
 import org.apache.tools.zip.ZipEntry;
 import org.apache.tools.zip.ZipFile;
 import org.apache.tools.zip.ZipOutputStream;
    /**
     * java�ļ�����������
     * @author Chris
     * @version 2008-6-26
     */
    public class FileUtil {
    	
        /**
         * ѹ���ļ�
         * @param inputFileName Ҫѹ�����ļ����ļ���·�������磺c:\\a.txt,c:\\a\
         * @param outputFileName ���zip�ļ���·�������磺c:\\a.zip
         */
        public static void zip(String inputFileName, String outputFileName) throws Exception {

            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFileName));
            zip(out, new File(inputFileName), "");
            out.closeEntry();
            out.close();

        }

       /**
         * ѹ���ļ�
         * @param out org.apache.tools.zip.ZipOutputStream
         * @param file ��ѹ�����ļ�
         * @param base ѹ���ĸ�Ŀ¼
         */
        private static void zip(ZipOutputStream out, File file, String base) throws Exception {

            if (file.isDirectory()) {
                File[] fl = file.listFiles();
                base = base.length() == 0 ? "" : base + File.separator;
                for (int i = 0; i < fl.length; i++) {
                    zip(out, fl[i], base + fl[i].getName());
                }

            } else {
                out.putNextEntry(new ZipEntry(base));
                FileInputStream in = new FileInputStream(file);
                int b;

                while ((b = in.read()) != -1) {
                    out.write(b);
                }
                in.close();

            }

        }
 

        /**
         * ��ѹzip�ļ�
         * @param zipFileName ����ѹ��zip�ļ�·�������磺c:\\a.zip
         * @param outputDirectory ��ѹĿ���ļ���,���磺c:\\a\
         */
        public static void unZip(String zipFileName, String outputDirectory) throws Exception {

            ZipFile zipFile = new ZipFile(zipFileName);
            try {
                Enumeration<?> e = zipFile.getEntries();
                ZipEntry zipEntry = null;
                createDirectory(outputDirectory, "");
                while (e.hasMoreElements()) {
                    zipEntry = (ZipEntry) e.nextElement();
                    if (zipEntry.isDirectory()) {
                        String name = zipEntry.getName();
                        name = name.substring(0, name.length() - 1);
                        File f = new File(outputDirectory + File.separator + name);
                        f.mkdir();

                    } else {
                        String fileName = zipEntry.getName();
                        fileName = fileName.replace('\\', '/');
                        if (fileName.indexOf("/") != -1) {
                            createDirectory(outputDirectory, fileName.substring(0, fileName.lastIndexOf("/")));
                            fileName = fileName.substring(fileName.lastIndexOf("/") + 1, fileName.length());
                        }

                        File f = new File(outputDirectory + File.separator + zipEntry.getName());
                        f.createNewFile();
                        InputStream in = zipFile.getInputStream(zipEntry);
                        FileOutputStream out = new FileOutputStream(f);

                        byte[] by = new byte[1024];
                        int c;
                        while ((c = in.read(by)) != -1) {
                            out.write(by, 0, c);
                        }
                        in.close();
                        out.close();

                    }

                }

            } catch (Exception ex) {
            	ex.printStackTrace();
            } finally {
                zipFile.close();

            }

        }


        
        private static void createDirectory(String directory, String subDirectory) {
            String dir[];
            File fl = new File(directory);
            try {
                if (subDirectory == "" && fl.exists() != true) {
                    fl.mkdir();
                } else if (subDirectory != "") {
                    dir = subDirectory.replace('\\', '/').split("/");
                    for (int i = 0; i < dir.length; i++) {
                        File subFile = new File(directory + File.separator + dir[i]);
                        if (subFile.exists() == false)
                            subFile.mkdir();
                        directory += File.separator + dir[i];
                    }

                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        /**
         * �����ļ����е������ļ�������һ���ļ���
         * @param srcDirector Դ�ļ���
         * @param desDirector Ŀ���ļ���
         */
        public static void copyFileWithDirector(String srcDirector, String desDirector) throws IOException {
            (new File(desDirector)).mkdirs();
            File[] file = (new File(srcDirector)).listFiles();
            for (int i = 0; i < file.length; i++) {
                if (file[i].isFile()) {
                    FileInputStream input = new FileInputStream(file[i]);
                    FileOutputStream output = new FileOutputStream(desDirector + "/" + file[i].getName());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (file[i].isDirectory()) {
                    copyFileWithDirector(srcDirector + "/" + file[i].getName(), desDirector + "/" + file[i].getName());
                }

            }

        }

        /**
         * ɾ���ļ���
         * @param folderPath folderPath �ļ�����������·��
         */
        public static void delFolder(String folderPath) throws Exception {

            //ɾ����������������
            delAllFile(folderPath);
            String filePath = folderPath;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            //ɾ�����ļ���
            myFilePath.delete();
        }
 

        /**
         * ɾ��ָ���ļ����������ļ�
         * @param path �ļ�����������·��
         */
        public static boolean delAllFile(String path) throws Exception {

            boolean flag = false;
            File file = new File(path);
            if (!file.exists()) {
                return flag;
            }

           if (!file.isDirectory()) {
                return flag;
           }

            String[] tempList = file.list();
            File temp = null;
            for (int i = 0; i < tempList.length; i++) {
                if (path.endsWith(File.separator)) {
                    temp = new File(path + tempList[i]);
                } else {
                    temp = new File(path + File.separator + tempList[i]);
                }

                if (temp.isFile()) {
                    temp.delete();
                }

                if (temp.isDirectory()) {
                    //��ɾ���ļ���������ļ�
                    delAllFile(path + "/" + tempList[i]);
                    //��ɾ�����ļ���
                    delFolder(path + "/" + tempList[i]);
                    flag = true;
                }

            }
            return flag;
        }

    }

