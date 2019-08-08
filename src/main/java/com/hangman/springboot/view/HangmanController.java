package com.hangman.springboot.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HangmanController {

    private static final String XML_PATH = "src/main/resources/static/xml/words.xml";
    private static final String XML_NODE = "word";
    private static final String INITIAL_PAGE = "hangman";
    private static final Integer RANDOM_ADJUSTMENT = 1;

    @GetMapping({"/", "/hangman"})
    public String initialPage(Model model) {
        ArrayList<String> hangmanWords = readXML();
        String chosenWord = chooseWord(hangmanWords);
        return INITIAL_PAGE;
    }

    private String chooseWord(ArrayList<String> hangmanWords) {
        Random random = new Random();
        int randomIndex = random.nextInt(hangmanWords.size() - RANDOM_ADJUSTMENT);
        return hangmanWords.get(randomIndex);
    }

    private ArrayList<String> readXML(){
        ArrayList<String> xmlWords = new ArrayList<>();
        try {
            File fXmlFile = new File(XML_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            NodeList nList = doc.getElementsByTagName(XML_NODE);

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    xmlWords.add(nNode.getTextContent());
                }
            }

        }catch (Exception e){
            System.out.println("EXCEPTION : " + e.getMessage());
        }
        return xmlWords;
    }
}
