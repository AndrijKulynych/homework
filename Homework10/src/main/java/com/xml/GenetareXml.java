package com.xml;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class GenetareXml {
    private static final Logger LOGGER = Logger.getLogger(GenetareXml.class.getName());

    public void getMultiStructure() {
        ArrayList <Map <List <Set <Integer>>, String>> listStructure = new ArrayList<>();
        Integer number = 23;
        Set<Integer> set = new HashSet<>(number);
        List<Set<Integer>> list = new ArrayList<>();
        list.add(set);
        Map<List<Set<Integer>>, String> map = new HashMap<>();
        map.put(list, "1-st");
        map.put(list, "2-nd");
        map.put(list, "3-d");
        map.put(list, "4-th");
        listStructure.add(map);
        makeXmlFile(listStructure);
    }

    private void makeXmlFile(List list) {
        try (FileOutputStream xmlFile = new FileOutputStream("FileStructure.xml")) {
            XMLEncoder xmlEncoder = new XMLEncoder(xmlFile);
            xmlEncoder.writeObject(list);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
