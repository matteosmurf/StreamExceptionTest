import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;

public class Stream {

    /* 
     * Test stream Scanner.in
     */
    public static void wScanner(){
        System.out.println("w Scanner start");
        Scanner in = new Scanner(System.in);
        System.out.println("Scrivi un intero");
        String line = in.next();
        int intValue = Integer.parseInt(line);

        System.out.println("Hai inserito il numero: " + intValue);

        in.close();
        System.out.println("w Scanner end \n \n");
    }

    /* 
     * Test BufferedReader
     */
    public static void wBufferedReader(){
        System.out.println("w BufferedReader start");
        BufferedReader inR = new BufferedReader(new InputStreamReader(System.in));
        int lineR;
        try {
            lineR = inR.read();
            System.out.println("Valore inserito con BUfferedReader: " + lineR);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            inR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("w BufferedReader end");
    }


    /* 
     * Test create file
     */
    public static void mkFile() {
        try {
            File fileTest = new File("fileTest");
            if (fileTest.createNewFile()){
                System.out.println("File creato:");
            } else {
                System.err.println("Il file già esiste");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /* 
     * Test Write File
     */
    

}
