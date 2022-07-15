package assignment;
import java.io.*;

public class negativenum 
{

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double a_number;
        System.out.print("Enter the value of a number: ");
        a_number = Double.parseDouble(in.readLine());
        if(a_number<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
        in.close();
    }

}
