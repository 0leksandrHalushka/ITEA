package lesson19.java;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public Beer parse() {

        Document doc;
        try {
            doc = buidDocument();
        } catch (Exception e) {
            System.out.println("Parsing error " + e);
            return null;
        }

        Node beerNode = doc.getFirstChild();
        Beer beer = parseBeer(beerNode);
        writerBeer(beer);

        return beer;
    }

    public Document buidDocument() throws Exception {
        File file = new File("Homework/lesson19/data/beer.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        return builderFactory.newDocumentBuilder().parse(file);
    }

    private Beer parseBeer(Node beerNode) {

        NodeList beerChild = beerNode.getChildNodes();

        String beerName = null;
        String type = null;
        String alcohol = null;
        String manufacture = null;
        Node ingredients;
        Node chars;
        ArrayList<String> arrayListIngredients = new ArrayList();
        List charsArrayList = new ArrayList();

        for (int i = 0; i < beerChild.getLength(); i++) {

            if (beerChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (beerChild.item(i).getNodeName()) {
                case "BeerName":
                    beerName = beerChild.item(i).getTextContent();
                    break;

                case "Type":
                    type = beerChild.item(i).getTextContent();
                    break;

                case "Alcohol":
                    alcohol = beerChild.item(i).getTextContent();
                    break;

                case "Manufacture":
                    manufacture = beerChild.item(i).getTextContent();
                    break;

                case "Ingredients":
                    ingredients = beerChild.item(i);

                    if (ingredients.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }

                    NodeList nodeListIngredients = ingredients.getChildNodes();
                    for (int k = 0; k < ingredients.getChildNodes().getLength(); k++) {
                        switch (nodeListIngredients.item(k).getNodeName()) {
                            case "Ingredient": {
                                arrayListIngredients.add(nodeListIngredients.item(k).getTextContent());
                                break;
                            }
                        }
                    }
                    break;

                case "Chars":
                    chars = beerChild.item(i);
                    charsArrayList = parseChars(chars);

            }

        }
        return new Beer(beerName, type, Boolean.parseBoolean(alcohol), manufacture, arrayListIngredients, charsArrayList);

    }


    private static List parseChars(Node chars) {

        List<Chars> charsList = new ArrayList<>();

        NodeList childListChars = chars.getChildNodes();

        for (int j = 0; j < chars.getChildNodes().getLength(); j++) {
            NodeList nodeList1 = childListChars.item(j).getChildNodes();
            String name = null;
            String value = null;
            for (int k = 0; k < nodeList1.getLength(); k++) {

                switch (nodeList1.item(k).getNodeName()) {
                    case "Name":
                        name = nodeList1.item(k).getTextContent();
                        break;

                    case "Value":
                        value = nodeList1.item(k).getTextContent();
                        break;
                }

            }

            if (name != null && value != null) {
                charsList.add(new Chars(name, value));
            }

        }
        return charsList;
    }


    private void writerBeer(Beer beer) {

        File newFile = new File("Homework/lesson19/data/beer.json");
        JSONObject jsonObject = new JSONObject(beer);
        try {
            FileWriter fileWriter = new FileWriter(newFile);
            fileWriter.write(jsonObject.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
