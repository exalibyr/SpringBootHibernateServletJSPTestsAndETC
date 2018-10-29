package logic;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {

    public JaxbWriter() {
    }

    public void write(MovieList movieList, String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(MovieList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(movieList, file);
            //jaxbMarshaller.marshal(movieList, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
