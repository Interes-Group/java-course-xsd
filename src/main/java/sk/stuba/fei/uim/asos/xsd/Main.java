package sk.stuba.fei.uim.asos.xsd;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws JAXBException {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Persons persons = (Persons) jaxbUnmarshaller.unmarshal(is);

        System.out.println(persons.toString());
    }
}
