package lesson19.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Beer {
    private String name;
    private String type;
    private boolean alcohol;
    private String manufactured;
    private List<String> ingredients;
    List<Chars> chars;


    public Beer(String name, String type, boolean alcohol, String manufactured, List<String> ingredients, List<Chars> chars) {
        this.name = name;
        this.type = type;
        this.alcohol = alcohol;
        this.manufactured = manufactured;
        this.ingredients = ingredients;
        this.chars = chars;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Chars> getChars() {
        return chars;
    }

    public void setChars(List<Chars> chars) {
        this.chars = chars;
    }


    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcohol=" + alcohol +
                ", manufactured='" + manufactured + '\'' +
                ", ingredients=" + ingredients +
                ", chars=" + chars +
                '}';
    }
}

