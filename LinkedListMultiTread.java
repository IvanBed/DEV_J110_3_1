/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class LinkedListMultiTread {
    
    Planet head = new Planet();
   
    public static class Planet {
    
        String name;
        int distanceToSun;
        int mass;
        int diametr;
        Planet nextDistanceToSun;
        Planet nextMass;
        Planet nextDiametr;

        public Planet() {

        }

        public Planet(String name, int distanceToSun, int mass, int diametr) {
            this.name = name;
            this.distanceToSun = distanceToSun;
            this.mass = mass;
            this.diametr = diametr;
        }

    }

    public void addPlanetToList(String name, int distanceToSun, int mass, int diametr) {
        Planet newPlanet = new Planet(name, distanceToSun, mass, diametr);

        Planet spaceShip = head;
        while (spaceShip.nextDistanceToSun != null) {
            if (spaceShip.nextDistanceToSun.distanceToSun < distanceToSun) {
                break;
            }
            spaceShip = spaceShip.nextDistanceToSun;

        }
        newPlanet.nextDistanceToSun = spaceShip.nextDistanceToSun;
        spaceShip.nextDistanceToSun = newPlanet;

        Planet spaceShipTwo = head;
        while (spaceShipTwo.nextMass != null) {
            if (spaceShipTwo.nextMass.mass < mass) {
                break;
            }
            spaceShipTwo = spaceShipTwo.nextMass;

        }
        newPlanet.nextMass = spaceShipTwo.nextMass;
        spaceShipTwo.nextMass = newPlanet;
        
        
        
         Planet spaceShipThree = head;
        while (spaceShipThree.nextDiametr != null) {
            if (spaceShipThree.nextDiametr.diametr < diametr) {
                break;
            }
            spaceShipThree = spaceShipThree.nextDiametr;

        }
        newPlanet.nextDiametr = spaceShipThree.nextDiametr;
        spaceShipThree.nextDiametr = newPlanet;

    }

    public void printAll() {
        
        Planet spaceShip = head;
        while (spaceShip.nextDistanceToSun!=null) {
            spaceShip = spaceShip.nextDistanceToSun;
            System.out.println(spaceShip.name +  " " + " дистанция " +spaceShip.distanceToSun);

        }

        Planet spaceShipTwo = head;
        while (spaceShipTwo.nextMass!=null) {
            spaceShipTwo = spaceShipTwo.nextMass;
             System.out.println(spaceShipTwo.name +  " " + " масса " + spaceShipTwo.mass);
        }
        
        Planet spaceShipThree = head;
        while (spaceShipThree.nextDiametr!=null) {
            spaceShipThree = spaceShipThree.nextDiametr;
            System.out.println(spaceShipThree.name +  " " + " диамептр " + spaceShipThree.diametr);
        }

    }
    
}
