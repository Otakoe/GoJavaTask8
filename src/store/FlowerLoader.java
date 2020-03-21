package store;
import flowers.*;
import java.io.*;

public final class FlowerLoader {
    public static Flower[] load(String fileLink){
        Flower[] bouquet = new Flower[0];
        try {
            FileInputStream file = new FileInputStream(fileLink);
            ObjectInputStream obj = new ObjectInputStream(file);
            bouquet = (Flower[]) obj.readObject();
            file.close();
            System.out.println("Букет загружен из файла\n");
        }catch(Exception e){
            System.out.println("Ошибка считывания файла");
        }
        return bouquet;
    }
}
