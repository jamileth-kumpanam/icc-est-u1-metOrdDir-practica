package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] personas){
        int n = personas.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (personas[j].getName().compareToIgnoreCase(personas[j+1].getName()) > 0) {
                    Person temp = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
