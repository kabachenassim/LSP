/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.poo.LSP;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Listerobots {
    
    List<Robot> liste_des_robot;
 
 
public void avancer(){
	
 for (Robot R : liste_des_robot) {
		
		R.avance();
}
}
    
}
