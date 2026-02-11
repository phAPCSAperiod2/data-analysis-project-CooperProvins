import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        // import file
        File myFile = new File("C:\\Users\\524234\\OneDrive - San Diego Unified School District\\Documents\\GitHub\\Cereal_Data_Analysis\\cereal.csv");
        Scanner myScanner = new Scanner(myFile);

        // set delimeter for using .next()
        myScanner.useDelimiter(",");

        // Skip the header row
        myScanner.nextLine();
        
        // while scanner still has another line
        while (myScanner.hasNextLine()){
            // set local variables to variables from current line
            String name = myScanner.next();
            char manufacturer = myScanner.next().charAt(0);
            char type = myScanner.next().charAt(0);
            int calories = myScanner.nextInt();
            int fiber = myScanner.nextInt();
            int carbs = myScanner.nextInt();
            int sugars = myScanner.nextInt();
            int potassium = myScanner.nextInt();

            // skip vitamins, shelf, weight, cups
            myScanner.next();
            myScanner.next();
            myScanner.next();
            myScanner.next();

            // set local rat
            double rating = myScanner.nextDouble();

            Cereal cereal = new Cereal(name, manufacturer, type, calories, fiber, carbs, sugars, potassium, rating);
            
        }

    }
}