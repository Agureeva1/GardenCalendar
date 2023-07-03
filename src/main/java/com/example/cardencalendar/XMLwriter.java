package com.example.cardencalendar;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;


public class XMLwriter {
    public static void mainXMLwriter() throws ParserConfigurationException, TransformerException, IOException, SAXException {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("root");
        doc.appendChild(root);


        for (int i = 0; i < MyTabPane.getTabpane().getTabs().size(); i++) {
            Element tab = doc.createElement("tab");
            tab.setAttribute("TextTab", MyTabPane.getTabpane().getTabs().get(i).getText());
            root.appendChild(tab);

            for (int q = 0; q < PlantTableView.getTableList().get(i).getItems().size(); q++) {
                Element plant = doc.createElement("plant");
                plant.setAttribute("numberRidge", PlantTableView.getTableList().get(i).getItems().get(q).getNumberRidge());
                plant.setAttribute("name", PlantTableView.getTableList().get(i).getItems().get(q).getName());
                plant.setAttribute("ID", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getId()));
                plant.setAttribute("wateringLastElement", PlantTableView.getTableList().get(i).getItems().get(q).getWateringLastElement());
                plant.setAttribute("mineralizationLastElement", PlantTableView.getTableList().get(i).getItems().get(q).getMineralizationLastElement());
                plant.setAttribute("mulchingLastElement", PlantTableView.getTableList().get(i).getItems().get(q).getMulchingLastElement());
                plant.setAttribute("deoxidationLastElement", PlantTableView.getTableList().get(i).getItems().get(q).getDeoxidationLastElement());
                plant.setAttribute("sedationLastElement", PlantTableView.getTableList().get(i).getItems().get(q).getSedationLastElement());
                plant.setAttribute("harvestingSum", PlantTableView.getTableList().get(i).getItems().get(q).getHarvestingSum());

                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getWateringList().size(); w++) {
                    Element wateringList = doc.createElement("wateringList");
                    wateringList.setAttribute("WatListVolume", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getWateringList().get(w).getVolume()));
                    wateringList.setAttribute("WatListDate", PlantTableView.getTableList().get(i).getItems().get(q).getWateringList().get(w).getDate());
                    plant.appendChild(wateringList);
                }

                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getMineralizationList().size(); w++) {
                    Element mineralizationList = doc.createElement("mineralizationList");
                    mineralizationList.setAttribute("MinListWeight", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getMineralizationList().get(w).getWeight()));
                    mineralizationList.setAttribute("MinListSubstance", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getMineralizationList().get(w).getSubstance()));
                    mineralizationList.setAttribute("MinListDate", PlantTableView.getTableList().get(i).getItems().get(q).getMineralizationList().get(w).getDate());
                    plant.appendChild(mineralizationList);
                }

                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getMulchingList().size(); w++) {
                    Element mulchingList = doc.createElement("mulchingList");
                    mulchingList.setAttribute("MulListDate", PlantTableView.getTableList().get(i).getItems().get(q).getMulchingList().get(w).getDate());
                    plant.appendChild(mulchingList);
                }


                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getDeoxidationList().size(); w++) {
                    Element deoxidationList = doc.createElement("deoxidationList");
                    deoxidationList.setAttribute("DeoListWeight", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getDeoxidationList().get(w).getWeight()));
                    deoxidationList.setAttribute("DeoListSubstance", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getDeoxidationList().get(w).getSubstance()));
                    deoxidationList.setAttribute("DeoListDate", PlantTableView.getTableList().get(i).getItems().get(q).getDeoxidationList().get(w).getDate());
                    plant.appendChild(deoxidationList);
                }

                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getSedationList().size(); w++) {
                    Element sedationList = doc.createElement("sedationList");
                    sedationList.setAttribute("SedListSubstance", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getSedationList().get(w).getSubstance()));
                    sedationList.setAttribute("SedListDate", PlantTableView.getTableList().get(i).getItems().get(q).getSedationList().get(w).getDate());
                    plant.appendChild(sedationList);
                }

                for (int w = 0; w < PlantTableView.getTableList().get(i).getItems().get(q).getHarvestingList().size(); w++) {
                    Element harvestingList = doc.createElement("harvestingLis");
                    harvestingList.setAttribute("HarListWeight", String.valueOf(PlantTableView.getTableList().get(i).getItems().get(q).getHarvestingList().get(w).getWeight()));
                    harvestingList.setAttribute("HarListDate", PlantTableView.getTableList().get(i).getItems().get(q).getHarvestingList().get(w).getDate());
                    plant.appendChild(harvestingList);
                }

                tab.appendChild(plant);
            }
        }
        DOMSource domSource = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File("xml_dir/new_plant.xml"));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.transform(domSource, streamResult);

    }
}
