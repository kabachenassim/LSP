/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.poo.LSP;

/**
 *
 * @author ADMIN
 */
public class Robot {
    
    private Position position ;
	private Direction direction ;
	
	
	public Robot(Position pos, Direction dir) {
		this.position=pos;
		this.direction=dir;
	}
	
public void tourne() { /*tourne d’1/ 4 de tour */ }
public void avance() { /* avance d’une case */ }
    
}
