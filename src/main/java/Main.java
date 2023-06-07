import java.io.*;
import java.lang.module.FindException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class Main {



    private static void hereWillBeTrouble(int a, int b) throws CloneNotSupportedException {

//        if (b == 0) {
//            throw new ArithmeticException("Ты опять делишь на ноль?");
//        }
//        int oops = a / b;
//        System.out.println(oops);
//         try {
        System.out.println("+++++++");
        throw new CloneNotSupportedException("Clone");
//         }catch (Exception e){
//             System.out.println(e.getMessage());
    }
//    }

    static void method() throws IllegalAccessException {
//        try {
            System.out.println("inside method Illegal");
        System.err.println("************");
//            throw new Exception("kjghdk");
        throw new IllegalAccessException("Exception in method");
//            throw new CloneNotSupportedException("Clone");
//        throw new ArithmeticException("Arithmetic ");
//        throw new Exception("Arithmetic ");
//        } catch (NullPointerException e) {
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static void main(String args[]) throws IOException //throws IllegalAccessException, CloneNotSupportedException// throws IllegalAccessException,ArithmeticException,CloneNotSupportedException
    {
        // ЗАПИСЬ В ФАЙЛ

        String string = "";
        PrintWriter printWriter = new PrintWriter("C:\\Users\\Лёлька\\Desktop\\file1.txt");
        List <String> stringList2 = new ArrayList<>();
        for (char c = 'a' ; c <= 'z'; c++){
            stringList2.add(String.valueOf(c));
            printWriter.write(c + ", ");
            string = string + c;
            string = string.concat(String.valueOf(c));
        }
        printWriter.write(String.valueOf(stringList2));
        printWriter.write(string);
        printWriter.flush();
        printWriter.close();

        List<String>stringList1 = new ArrayList<>();
        for (char c = 'a' ; c <= 'z'; c++){
            stringList1.add(String.valueOf(c));
        }

        Files.write(Paths.get("data\\file.txt"),stringList1);
//        Files.write(Paths.get("C:\\Users\\Лёлька\\Desktop"), string); // не работает, видимо должна быть коллекция
        // ЧТЕНИЕ ИЗ ФАЙЛА
        File folder = new File("C:\\Users\\Лёлька\\Desktop");
        folder.mkdir();
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        File file = new File("C:\\Users\\Лёлька\\Desktop\\ggg.txt");
        file.createNewFile();
        System.out.println(file.length());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isDirectory());
        System.out.println("file name" + file.getName());
        System.out.println(file.isFile());
//        file.delete();
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Лёлька\\Desktop\\errors.log");
        for (; ; ) {
            int code = fileInputStream.read();
            if (code < 0) {
                break;
            }
            char c = (char) code;
            stringBuilder.append(c);
            System.out.print(c);
        }
        System.out.println(stringBuilder);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Лёлька\\Desktop\\errors.log"));
        for (; ; ) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuilder.append(line + "\n");
        }
        System.out.println(stringBuilder);
try {
            List<String> stringList = Files.readAllLines(Paths.get("C:\\Users\\Лёлька\\Desktop\\errors.log"));
            stringList.stream().forEach(System.out::println);
        for (String s:stringList){
            System.out.println(s);}
        }catch (MalformedInputException e){
//    e.getCause();
    System.err.println(e.getInputLength());
    System.err.println(e.getMessage());
//    System.err.println(Arrays.toString(e.getStackTrace()));
}
//stringList.forEach(line->stringBuilder.append(line + "\n"));
//        System.out.println(stringBuilder);
        //////////////////////////////////////////////////////////////////////////////////////
        try {
            System.err.println("try");
            throw new MyException("My");
//            throw new Error();
//            throw new RuntimeException("ooo");
//        } finally {
        } catch (Exception e){
            System.out.println(e.initCause(new RuntimeException()));
            System.out.println("ldrghsiu" + e.getCause());
            StackTraceElement []stackTraceElements = e.getStackTrace();
            System.out.println(stackTraceElements);
            for (StackTraceElement s:stackTraceElements){
                System.out.println(s);
            }
            System.err.println(e);
            System.err.println("finally");
        } finally {
            System.err.println("FFF");
        }

    }
}