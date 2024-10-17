package Nivell2.Ex1.Modules;


import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class getJson {

    public static void objectToJson (Object object) throws IOException{
        Class<?> clase = object.getClass();

        //con la anotacion JsonElement se puede escoger que introducir y que no en el json,
        // pero nose bien bien donde debo ponerla usarla

        Gson objGson = new Gson();

        String strJson = objGson.toJson(object);

        JsonSerialize annotation = clase.getAnnotation(JsonSerialize.class);
        String directory = new File("").getAbsolutePath();


        try (FileWriter file = new FileWriter(directory +
                            File.separator + clase.getSimpleName() + ".json")) {
            file.write(strJson);
            System.out.println(".Json del objeto:\n[" + object.toString() +"]\n" +
                    "Creado correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
