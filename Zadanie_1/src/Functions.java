import java.io.*;

public class Functions {
    void save(Object object, String filepath){
        System.out.print("Saving "+ object.getClass().getName() + " to " + filepath + " ...");
        try {

        } catch (Exception e) {
            System.out.println("In Functions.save() error occurred: "+ e.getMessage());
        }
    }

    static Object getObject(String filePath){
        FileInputStream fileStream;
        Object object = null;

        try {
            fileStream = new FileInputStream(filePath);
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            object = objStream.readObject();
            objStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return object;
    }
}


