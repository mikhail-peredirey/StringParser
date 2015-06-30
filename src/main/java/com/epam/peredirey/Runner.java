package com.epam.peredirey;

public class Runner {
    public static void main(String[] args) {
        Logger logger = org.slf4j.loggerFactory.getlogger(Runner.class);
        String textString = Files.getText();
        PropertyManager propertyManager = new PropertyManager("components.property");
        logger.info(String.valueOf(propertyManager.stringPropertyNames()));

        Parser parser = new Parser();
        parser.configure(propertyManager);
        parser.parse(textString);
    }
}