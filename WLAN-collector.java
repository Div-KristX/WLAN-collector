package Pegasus;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	System.out.println("WLAN state");
        System.out.print("Packages______");
        Scanner num= new Scanner(System.in);
        int n=num.nextInt();
        Runtime.getRuntime().exec("cmd /c chcp 65001 && ping -n "+n+" 8.8.8.8 >C:/Users/user/AppData/Local/Temp/info.txt && exit");
        System.out.println("------Processing------");
        System.out.println("______________________________________");
        int ninc = (n* 1000)+10;
       try {
            Thread.sleep(  ninc);
        } catch (InterruptedException ex) {}
        try {
            File file = new File("C:/Users/user/AppData/Local/Temp/info.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("______________________________________");
        System.out.println("Tracing");


        Runtime.getRuntime().exec("cmd /c chcp 65001 && tracert 8.8.8.8 >C:/Users/user/AppData/Local/Temp/info-tracer.txt && exit");
        System.out.println("------Processing------");
        try {
            Thread.sleep(  18000);
        } catch (InterruptedException ex) {}
        try {
            File file = new File("C:/Users/user/AppData/Local/Temp/info-tracer.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("______________________________________");
    }
}
