package Odev3;

import java.io.*;
import java.util.*;

class IntSort {
    Integer[] sortedArray;

    public IntSort(Integer[] array) {
        sortedArray = new Integer[array.length];
        Arrays.sort(array);
        sortedArray = array;
    }

    public void printArray() {
        System.out.println("\nSorted Integer Array : ");
        for (Integer i : sortedArray) {
            System.out.print(i + "\t");
        }
    }
}
class FloatSort {

    Float[] sortedArray;

    public FloatSort(Float[] array) {
        sortedArray = new Float[array.length];
        Arrays.sort(array);
        sortedArray = array;
    }

    public void printArray() {
        System.out.println("\nSorted Float Array : ");
        for (Float i : sortedArray) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }
}
public class NumberFromText{

    static List<Integer> integerList = new ArrayList<>();
    static List<Float> floatList = new ArrayList<>();
    static Float[] floatArray;
    static Integer[] integerArray;
    static int integerCounter;
    static int floatCounter;
    static FileReader aFile;
    static BufferedReader br;
    
    public static void main(String[] args) throws IOException{
        String filePath = null;
        boolean flag = true;
        
        if(args.length == 0){
            while(flag){
                System.out.println("Please enter a file name");
                filePath = "Documents/" + getFileName();
                if (checkFile(filePath)){
                    flag = false;
                }
            }     
        }else{
            filePath = "Documents/" + args[0];
            if (!checkFile(filePath)){
                while(flag){
                    System.out.println("Please enter a file name");
                    filePath = "Documents/" + getFileName();
                    if (checkFile(filePath)){
                        flag = false;
                    }
                }     
            }
        }
        getFloatNumbers(filePath);
        
        integerArray = integerList.toArray(new Integer[integerList.size()]);
        floatArray = floatList.toArray(new Float[floatList.size()]);
        
        System.out.println("Integer Array: ");
        for (Integer number: integerArray) {
            System.out.print(number + "\t");
        }
        System.out.println("\nFloat Array: ");
        for (Float number: floatArray){
            System.out.print(number + "\t");
        }
        
        IntSort intObject = new IntSort(integerArray);
        FloatSort floatObj = new FloatSort(floatArray);
        intObject.printArray();
        floatObj.printArray();
        
    }
    public static void getIntegerNumbers(String filePath) throws FileNotFoundException, IOException{
        aFile = new FileReader(filePath);
        br = new BufferedReader(aFile);

        String line = br.readLine();
        int i = 0;
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, " ");

            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                try {
                    integerList.add(Integer.parseInt(word));
                    integerCounter++;
                } catch (NumberFormatException nfe) {
                }
            }
            line = br.readLine();
        }
        System.out.println("Integer Numbers Count : " + integerCounter);
        br.close();
    }
    public static void getFloatNumbers(String filePath) throws FileNotFoundException, IOException{
        aFile = new FileReader(filePath);
        br = new BufferedReader(aFile);
        String line = br.readLine();
        int i = 0;
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, " ");

            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                try {
                    floatList.add(Float.parseFloat(word));
                    floatCounter++;
                } catch (NumberFormatException nfe) {
                }
            }
            line = br.readLine();
        }
        br.close();
        
        /* for(int n : integerList) {
            float f = (float) n;
            if (floatList.stream().anyMatch(x -> x == f)){
                floatCounter--;
                floatList.remove(f);
            }
        } */  
        integerList.stream().map((n) -> (float) n).filter((f) -> 
                (floatList.stream().anyMatch(x -> Objects.equals(x, f)))).map((f) -> 
                {
                    floatCounter--;
                    return f;
                }).forEachOrdered((f) -> {
                    floatList.remove(f);
            });     
        System.out.println("Float Numbers Count : " + floatCounter);
    }
    public static String getFileName(){
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();           
        return fileName;
    }
    public static boolean checkFile(String filePath) {
        File f = new File(filePath);
        if(f.exists() && !f.isDirectory()) { 
            return true;
        }
        System.out.println("Be sure the file is in the \"Documents \" directory"
                + " in the Project directory");
        System.out.println("Be sure to enter the file name with the .txt extension.\"");
        return false;
    }
}
