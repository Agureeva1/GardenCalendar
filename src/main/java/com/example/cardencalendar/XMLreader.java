package com.example.cardencalendar;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Tab;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.example.cardencalendar.MyTabPane.getTabpane;
import static com.example.cardencalendar.PlantTableView.getTableList;

public class XMLreader {
    public static void XMLmain() throws ParserConfigurationException, TransformerException, IOException, SAXException {

        // Создается построитель документа
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File f = new File("xml_dir/new_plant.xml");
        Document doc = builder.parse(f);

        Element root = doc.getDocumentElement();
        NodeList children = root.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node childTab = children.item(i);

            if (childTab instanceof Element) {
                Element childTabElement = (Element) childTab;
                NodeList childrenPlant = childTabElement.getChildNodes();

                PlantTableView table = new PlantTableView();
                getTableList().add(table.getTable());

                ObservableList<Plant> newPlantList = FXCollections.observableArrayList();
                for (int j = 0; j < childrenPlant.getLength(); j++) {
                    Node childPl = childrenPlant.item(j);
                    if (childPl instanceof Element) {
                        Element childPlantElement = (Element) childPl;
                        String plNumRidge = childPlantElement.getAttribute("numberRidge");
                        String plName = childPlantElement.getAttribute("name");
                        int ID = Integer.parseInt(childPlantElement.getAttribute("ID"));
                        String plWatLE = childPlantElement.getAttribute("wateringLastElement");
                        String plDeoLE = childPlantElement.getAttribute("deoxidationLastElement");
                        String plHurSum = childPlantElement.getAttribute("harvestingSum");
                        String plMinLE = childPlantElement.getAttribute("mineralizationLastElement");
                        String plMulLE = childPlantElement.getAttribute("mulchingLastElement");
                        String plSedLE = childPlantElement.getAttribute("sedationLastElement");

                        Plant p = new Plant(plNumRidge, plName);
                        p.setXMLHarvestingSum(plHurSum);
                        p.setXMLWateringLastElement(plWatLE);
                        p.setXMLMineralizationLastElement(plMinLE);
                        p.setXMLDeoxidationLastElement(plDeoLE);
                        p.setXMLMulchingLastElement(plMulLE);
                        p.setXMLSedationLastElement(plSedLE);
                        p.setId(ID);
                        newPlantList.add(p);
                        NodeList childrenSomeWorkDetails = childPlantElement.getChildNodes();
                        for (int q = 0; q < childrenSomeWorkDetails.getLength(); q++) {
                            Node childSomeWorkDetails = childrenSomeWorkDetails.item(q);
                            if (childSomeWorkDetails instanceof Element) {
                                Element childSomeWorkDetailsElement = (Element) childSomeWorkDetails;

                                if (childSomeWorkDetailsElement.getTagName() == "wateringList") {
                                    String WatListDate = childSomeWorkDetailsElement.getAttribute("WatListDate");
                                    int WatListVolume = Integer.parseInt(childSomeWorkDetailsElement.getAttribute("WatListVolume"));
                                    p.getWateringList().add(new SomeWork(WatListVolume));
                                    p.getWateringList().get(p.getWateringList().size() - 1).setDate(WatListDate);
                                } else if (childSomeWorkDetailsElement.getTagName() == "mineralizationList") {
                                    String MinListDate = childSomeWorkDetailsElement.getAttribute("MinListDate");
                                    String MinListSubstance = childSomeWorkDetailsElement.getAttribute("MinListSubstance");
                                    double MinListWeight = Double.parseDouble(childSomeWorkDetailsElement.getAttribute("MinListWeight"));
                                    p.getMineralizationList().add(new SomeWork(MinListWeight, MinListSubstance));
                                    p.getMineralizationList().get(p.getMineralizationList().size() - 1).setDate(MinListDate);
                                } else if (childSomeWorkDetailsElement.getTagName() == "deoxidationList") {
                                    String DeoListDate = childSomeWorkDetailsElement.getAttribute("DeoListDate");
                                    String DeoListSubstance = childSomeWorkDetailsElement.getAttribute("DeoListSubstance");
                                    double DeoListWeight = Double.parseDouble(childSomeWorkDetailsElement.getAttribute("DeoListWeight"));
                                    p.getDeoxidationList().add(new SomeWork(DeoListWeight, DeoListSubstance));
                                    p.getDeoxidationList().get(p.getDeoxidationList().size() - 1).setDate(DeoListDate);
                                } else if (childSomeWorkDetailsElement.getTagName() == "mulchingList") {
                                    String MulListDate = childSomeWorkDetailsElement.getAttribute("MulListDate");
                                    p.getMulchingList().add(new SomeWork());
                                    p.getMulchingList().get(p.getMulchingList().size() - 1).setDate(MulListDate);
                                } else if (childSomeWorkDetailsElement.getTagName() == "sedationList") {
                                    String SedListDate = childSomeWorkDetailsElement.getAttribute("SedListDate");
                                    String SedListSubstance = childSomeWorkDetailsElement.getAttribute("SedListSubstance");
                                    p.getSedationList().add(new SomeWork(SedListSubstance));
                                    p.getSedationList().get(p.getSedationList().size() - 1).setDate(SedListDate);
                                } else if (childSomeWorkDetailsElement.getTagName() == "harvestingLis") {
                                    String HarListDate = childSomeWorkDetailsElement.getAttribute("HarListDate");
                                    double HarListWeight = Double.parseDouble(childSomeWorkDetailsElement.getAttribute("HarListWeight"));
                                    p.getHarvestingList().add(new SomeWork(HarListWeight));
                                    p.getHarvestingList().get(p.getHarvestingList().size() - 1).setDate(HarListDate);
                                }
                            }
                        }
                    }
                }
                String tabText = childTabElement.getAttribute("TextTab");
                Tab tab = new Tab(tabText);
                tab.setClosable(false);
                table.setPlantList(newPlantList);
                // System.out.println(plantList.getLength());
                // TODO добавить вкладки в панель
                getTabpane().getTabs().add(tab);
                tab.setContent(table.getTable());
            }
        }
    }
}
