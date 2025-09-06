package com.ashu.marshelling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ashu.binding.Employee;
import com.ashu.binding.Person;

public class DemoMarshel {
    
    public static void main(String[] args) throws JAXBException {
        
        // -------------------- Marshalling (Object -> XML) --------------------
        Person p = new Person();
        p.setPid(101);
        p.setPname("Ashu");
        p.setPemail("ashu@gmail.com");
        p.setPmobile(9876543210L);
        
        JAXBContext personContext = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = personContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(p, new File("person.xml"));
        
        System.out.println("Person object converted to XML (person.xml created)");
        
        
        // -------------------- Unmarshalling (XML -> Object) --------------------
        JAXBContext employeeContext = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = employeeContext.createUnmarshaller();
        
        Employee e = (Employee) unmarshaller.unmarshal(new File("employee.xml"));
        
        System.out.println("XML converted back to Employee object:");
        System.out.println(e);
    }
}
