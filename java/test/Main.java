import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

class Column {

    String name;
    int size;
    
    Column(String name, int size) {
        this.name = name;
        this.size = size;
    }

};

class Database {

    String name;
    File fileObj;

    Column columns[]; 

    Database(String name, Column[] columns) {
        this.name = name;
        this.columns = columns;
    }

    public void insert(String row[]) {
        try {
            FileWriter Writer = new FileWriter(this.name + ".txt", true);
            for (int i=0; i<row.length; i++) {
                Writer.write(row[i] + ",");
            }
            Writer.write("\n");
            Writer.close();
        } catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public String[][] read() {
        String row[this.columns.length][10];
        try {
            Scanner Reader = new Scanner(this.fileObj);
            int count = 0;
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
        return row;
    }

    public void initialize() {
        try {
            this.fileObj = new File(this.name + ".txt");
            FileWriter readerToCreate = new FileWriter(this.name + ".txt", true);
            readerToCreate.close();
        } catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

};

class Main {

    public static void main(String[] args) {
        Column columns[] = {new Column("id", 1), new Column("fname", 10)};
        Database db1 = new Database("Fruit", columns);

        db1.initialize();
        for (int i=0; i<columns.length; i++) {
            System.out.println(db1.columns[i].name);
        }

        // String row1[] = {"1", "Ali"};
        // db1.insert(row1);
        // String row2[] = {"2", "Shazin"};
        // db1.insert(row2);

        // ArrayList<String> result = db1.read();
        // for (int i=0; i<result.size(); i++) {
        //     String[] row = result.get(i).split(",");
        //     for (int k=0; k<row.length; k++) {
        //         System.out.println(row[k]);
        //     }
        // }
    }

};