/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rook.problem;

import javax.swing.JFrame;

/**
 *
 * @author Randy_000
 */
public class RookProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        JFrame frame = new rook.problem.jFrameRookProblem();
        frame.setTitle("Rook Problem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        
    }
    
}
