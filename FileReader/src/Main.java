import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {private static String fileToWrite;
public static void main(String[] args) throws Exception {
       String filePathForWindows = "C:\\Users\\陶泽文\\Downloads\\Groceries.txt";
       String fileToWrite = "C:\\Users\\陶泽文\\Desktop\\GroceriesFormatted.txt";

       String [] array = new String[4];
       
       
      
       double price;
       String separator = ",";
       double total =0;

       FileReader fileReader = new FileReader(filePathForWindows);
       FileWriter filewriter = new FileWriter(fileToWrite);

       BufferedReader reader = new BufferedReader(fileReader);
       BufferedWriter writer = new BufferedWriter(filewriter);

       String line;

       writer.write("****************************************************\n");
       writer.write("ID#         Item        Quantity        Price (€).\n");

       while((line = reader.readLine()) !=null){

        array = line.split(separator);
        price = Double.parseDouble(array[3]);
        String id=array[0];
        String item=array[1];
        String quantity=array[2];
        total += price;
        writer.write(id+"\t\t"+item+"\t\t"+quantity+"\t\t"+price+'\n');

        System.out.println(line);
    }

        writer.write("****************************************************\n");
        System.out.println("\n"+"The grocery shopping total is: €"+ Math.round(total));
        writer.write("The grocery shopping total is: €"+ Math.round(total)+"\n");
        writer.write("****************************************************\n");
      
        reader.close();
        writer.flush();
        writer.close();
    }
}
