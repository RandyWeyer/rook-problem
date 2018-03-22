/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rook.problem;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Randy_000
 */

public class Permute extends javax.swing.JFrame {
   void permute(java.util.List<Integer> arr, int k){
        
    //Graphics g = rook.problem.jFrameRookProblem.jPanel1.getGraphics();
      
      
       //Start permutation calculator
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            //System.out.println(java.util.Arrays.toString(arr.toArray()));
            //super.paintComponents(g);

    //BRIAN NEED TO GET THIS TO ACTUALLY PAINT EACH PERMUTATION
    //MAY NEED TO USE PAINTIMMEDIATELY OR WAIT...NOTIFYALL
        }

    }
}


