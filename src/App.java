import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        // import file
        File myFile = new File("C:\\Users\\524234\\OneDrive - San Diego Unified School District\\Documents\\GitHub\\Cereal_Data_Analysis\\cereal.csv");
        Scanner myScanner = new Scanner(myFile);

        // set delimeter for using .next()
        myScanner.useDelimiter(",|\\r?\\n");


        // Skip the header row
        myScanner.nextLine();
        
        ArrayList<Cereal> cereals = new ArrayList<>();

        // while scanner still has another line
        while (myScanner.hasNext()){
            // set local variables to variables from current line
            String name = myScanner.next();
            char manufacturer = myScanner.next().charAt(0);
            char type = myScanner.next().charAt(0);
            int calories = myScanner.nextInt();
            int protein = myScanner.nextInt();
            int fat = myScanner.nextInt();
            int sodium = myScanner.nextInt();
            double fiber = myScanner.nextDouble();
            double carbs = myScanner.nextDouble();
            int sugars = myScanner.nextInt();
            int potassium = myScanner.nextInt();

            // skip vitamins, shelf, weight, cups
            myScanner.next();
            myScanner.next();
            myScanner.next();
            myScanner.next();

            double rating = myScanner.nextDouble();

            // initialize cereal with given info
            Cereal cereal = new Cereal(name, manufacturer, type, calories, protein, fat, sodium, fiber, carbs, sugars, potassium, rating);
            System.out.println(cereal);

            // add cereal to total list
            cereals.add(cereal);
        }

    }
}