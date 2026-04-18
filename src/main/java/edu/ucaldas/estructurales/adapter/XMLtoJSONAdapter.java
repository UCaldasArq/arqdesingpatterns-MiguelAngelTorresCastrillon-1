package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    public String getJSON() {
        String xml = xmlService.getData();
        String tag = xml.replaceAll("<(\\w+)>(.+)</\\1>", "$1");
        String value = xml.replaceAll("<(\\w+)>(.+)</\\1>", "$2");
        return "{\"" + tag + "\": \"" + value + "\"}";
    }
}