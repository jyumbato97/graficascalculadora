/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadora;

import java.awt.BorderLayout;
import javax.swing.JButton;

/**
 *
 * @author Oropeza
 */
public class Graficadora {
    
    public static Plano plano;
    
    public static void main(String [] args){
        
        Ventana frame =new Ventana();
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(300,300,510,600);
        frame.setLayout(new BorderLayout());
        plano =new Plano();
        
        JButton start = new JButton("Iniciar");
        start.addActionListener(frame);
        start.setText("Iniciar");
        
        frame.add(plano,BorderLayout.CENTER);
        frame.add(start,BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
