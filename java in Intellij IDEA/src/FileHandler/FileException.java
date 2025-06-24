package FileHandler;
import java.io.*;
import java.util.Scanner;
public class FileException {
    public static void main(String []args){
        FileExample F = new FileExample();
        try {
            F.f5();
        }catch (IOException e){
            System.out.println("Input Output Exception");
        }
    }
}
class FileExample{
    public void f1() throws IOException{
        int i;
        FileOutputStream fout;
        fout = new FileOutputStream("D:\\BCA\\JAVA\\java in Intellij IDEA\\files\\MyData.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        for(i=0;i<name.length();i++){
            fout.write(name.charAt(i));
        }
        fout.close();
        System.out.println("Data Store in File");
    }
    public void f2() throws IOException{
        int i;
        FileOutputStream fout;
        fout = new FileOutputStream("D:\\BCA\\JAVA\\java in Intellij IDEA\\files\\MyData.txt",true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        for(i=0;i<name.length();i++){
            fout.write(name.charAt(i));
        }
        fout.close();
        System.out.println("Data Store in File");
    }
    public void f3() throws IOException{
        int i;
        FileInputStream fin = new FileInputStream("D:\\BCA\\JAVA\\java in Intellij IDEA\\files\\MyData.txt");
        do{
            i=fin.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(i!=-1);
        fin.close();
    }
    public void f4() throws IOException{
        FileWriter file = new FileWriter("D:\\BCA\\JAVA\\java in Intellij IDEA\\files\\file1.txt");
        BufferedWriter bf = new BufferedWriter(file);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        bf.write(name);
        bf.close();
    }
    public void f5() throws IOException{
        FileReader file = new FileReader("D:\\BCA\\JAVA\\java in Intellij IDEA\\files\\file1.txt");
        BufferedReader bf = new BufferedReader(file);
        String s = bf.readLine();
        bf.close();
        System.out.println(s);
    }
}
