import java.io.*;

public class test17 {

    public static void main(String[] args) {
String str;
BufferedReader br=
        new BufferedReader(new
                InputStreamReader(System.in));
System.out.print("Конец ввода  - стоп");
try (FileWriter fw = new FileWriter("/Users/Юзер/Desktop/test.txt")) {
    do {
        System.out.print(": ");
        str = br.readLine();
        if (str.compareTo("стоп") == 0) break;
        str = str + "\r\n";
        fw.write(str);
    } while (str.compareTo("стоп") != 0);

}catch (IOException exc){
    System.out.print("Оштбка ввода-вывода:" + exc);
    }
    }
}

