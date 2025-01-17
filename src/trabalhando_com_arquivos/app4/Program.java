package trabalhando_com_arquivos.app4;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File (strPath + "\\subdirectory").mkdir();
        System.out.printf("Directory created sucesfully: " + sucess);

        sc.close();
    }
}
