package generator;

import java.util.*;

public class Context {


    private Map<String, Map<String, Object>> templateData = new LinkedHashMap<>();


    private Map<String, Object> globalVariables = new LinkedHashMap<>();


    private Map<String, String> routes = new LinkedHashMap<>();

    public void addRoute(String endpointName, String pathPattern) {
        routes.put(endpointName, pathPattern);
    }

    public String getRoute(String endpointName) {
        return routes.get(endpointName);
    }

    public Map<String, String> getAllRoutes() {
        return routes;
    }

    public void setGlobalVariable(String name, Object value) {
        globalVariables.put(name, value);
    }

    public Object getGlobalVariable(String name) {
        return globalVariables.get(name);
    }

    public Map<String, Object> getAllGlobalVariables() {
        return globalVariables;
    }

    public void addTemplateData(String templateName, String varName, Object value) {
        templateData
                .computeIfAbsent(templateName, k -> new LinkedHashMap<>())
                .put(varName, value);
    }

    public Map<String, Object> getDataForTemplate(String templateName) {
        return templateData.getOrDefault(templateName, new LinkedHashMap<>());
    }

    public Map<String, Map<String, Object>> getAllTemplateData() {
        return templateData;
    }

    public void print() {
        System.out.println("===== EXTRACTED CONTEXT =====");
        System.out.println("--- Global Variables ---");
        for (var entry : globalVariables.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("--- Routes (endpoint -> path) ---");
        for (var entry : routes.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("--- Template Data ---");
        for (var entry : templateData.entrySet()) {
            System.out.println("  Template: " + entry.getKey());
            for (var varEntry : entry.getValue().entrySet()) {
                System.out.println("    " + varEntry.getKey() + " = " + varEntry.getValue());
            }
        }
    }
}