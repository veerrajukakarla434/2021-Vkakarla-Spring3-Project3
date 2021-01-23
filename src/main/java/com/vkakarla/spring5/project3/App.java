package com.vkakarla.spring5.project3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[])
    {
        // Read the Spring configuration file [SpringConfig.xml]
        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        // Get the Library instance
        Library library = (Library) appContext.getBean("library");
        // Get the Book Details
        library.getBook().getBookDetails();
    }
}
