package com.epam.peredirey.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class PropertyManager {
    private final Properties properties;

    public Set<String> stringPropertyNames() {
        return properties.stringPropertyNames();
    }

    public PropertyManager(String fileName) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);

        properties = new Properties();
        try {
            properties.load(InputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public Map<String, String> getPropertiesWithSuffix(String suffix) {
        Set entries = properties.entrySet();
        Set<Map.Entry<String, String>> set = entries;
        HashMap map = new HashMap<>();
        for (Map.Entry<String, String> entry : set) { //set = связка ключ-значение
            String key = entry.getKey();
            if (key.endsWith(suffix)) {
                map.put(key.substring(0, key.indexOf('.')), entry.getValue());
            }
        }
        return map;
    }
}
