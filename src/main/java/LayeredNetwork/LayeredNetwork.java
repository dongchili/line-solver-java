package LayeredNetwork;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class LayeredNetwork {

    public LayeredNetwork(String filename) {
    }

    public static LayeredNetwork parseXML(String filename) {
        LayeredNetwork myLN = new LayeredNetwork(filename);
        //verbose = 0;TODO: do we need verbose?

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document doc = null;
        try {
            doc = dBuilder.parse(filename);
        } catch (SAXException e) {//TODO: create a new file?
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        doc.getDocumentElement().normalize();

//        hosts = cell(0); %list of hosts - Proc
//        tasks = cell(0); %list of tasks - Task, ProcID
//        entries = cell(0); %list of entries - Entry, TaskID, ProcID
//        activities = cell(0); %list of activities - Act, TaskID, ProcID
//        procID = 1;
//        taskID = 1;
//        entryID = 1;
//        actID = 1;
//        procObj = cell(0);
//        taskObj = cell(0);
//        entryObj = cell(0);
//        actObj = cell(0);

       NodeList procList = doc.getElementsByTagName("processor");

       for(int i = 0; i<procList.getLength();i++){
           Element procElement = (Element) procList.item(i);
           char[] name = procElement.getAttribute("name").toCharArray();//TODO char[] or String?
           char[] scheduling = procElement.getAttribute("scheduling").toCharArray();
           double multiplicity = Double.parseDouble(procElement.getAttribute("multiplicity"));
           double replication = procElement.getAttribute("replication") == NAN ? 1 : Double.parseDouble(procElement.getAttribute("replication"));

           if(String.valueOf(scheduling).equals("inf")){//TODO inf/finite/nan in java
               //if isfinite(multiplicity) //TODO: inf in java?
               // line_warning(mfilename,'A finite multiplicity is specified for a host processor with inf scheduling. Remove it or set it to inf.');
               //multiplicity = Inf
           }else if(isNAN(multiplicity)){
               multiplicity = 1;
           }

           double quantum = procElement.getAttribute("quantum") == NAN ? 0.001 : Double.parseDouble(procElement.getAttribute("quantum"));
           double speedFactor = procElement.getAttribute("speedFactor") == NAN ? 1.0 : Double.parseDouble(procElement.getAttribute("speedFactor"));

           Processor newProc = new Processor(myLN, name, multiplicity, scheduling, quantum, speedFactor);
           newProc.setReplication(replication);
       }

        return null;
    }

    public static LayeredNetwork parseXML(String filename, int verbose){
        return null;
    }
}
