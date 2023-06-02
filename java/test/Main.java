import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Database {

    String name;
    File fileObj;

    Database(String name) {
        this.name = name;
    }

    public void insert(String row[]) {
        try {
            FileWriter Writer = new FileWriter(this.name + ".txt", true);
            for (int i=0; i<row.length; i++) {
                Writer.write(row[i] + ", ");
            }
            Writer.write("\n");
            Writer.close();
        } catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public String[] read() {
        String row[];
        int count = 0;
        try {
            Scanner Reader = new Scanner(this.fileObj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                row[count] = data;
                count++;
            }
            Reader.close();
        } catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public void initialize() {
        try {
            this.fileObj = new File(this.name + ".txt");
            new FileWriter(this.name + ".txt", true);
        } catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

};

class Main {

    public static void main(String[] args) {
        Database db1 = new Database("Fruit");

        db1.initialize();
        System.out.println(db1.fileObj);

        String row1[] = {"1", "Ali"};
        db1.insert(row1);
        String row2[] = {"2", "Shazin"};
        db1.insert(row2);

        String result[] = 
        for (int i=0; i< )
    }

};