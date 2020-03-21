package store;

import flowers.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public final class FlowerSaver {
    public static void save(Flower[] bouquet,String fileLink) throws Exception{
        FileOutputStream file = new FileOutputStream(fileLink);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(bouquet);
        System.out.println("Букет сохранён в файл\n");
    }
}
