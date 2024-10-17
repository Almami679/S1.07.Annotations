package Nivell2.Ex1.Modules;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.IOException;

@JsonSerialize(directory = "./1.07.Annotations")
public class Objects {

    @JsonElement
    private String letter;

    @JsonElement(Key = "format")
    private String format;

    private boolean standardUTF8;


    public Objects(String letter, String format, boolean utf8) {
        this.letter = letter;
        this.format = format;
        this.standardUTF8 = utf8;
    }

    public String getLetter(){
        return this.letter;
    }

    public String getFormat(){
        return this.format;
    }

    public String toString(){
        return "Letter [" + this.letter + "]\nFormat <" + this.format +">";
    }


}
