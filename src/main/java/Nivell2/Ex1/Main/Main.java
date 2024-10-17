package Nivell2.Ex1.Main;

import Nivell2.Ex1.Modules.Objects;
import Nivell2.Ex1.Modules.getJson;

import java.io.IOException;

import static Nivell2.Ex1.Modules.getJson.objectToJson;


public class Main {

    public static void main(String[] args) throws IOException {

        Objects letra1 = new Objects("A", "Upper", true);

        try {
            objectToJson(letra1);
        } catch (Exception e) {

        }

    }
}
