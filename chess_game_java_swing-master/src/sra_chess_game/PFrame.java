package sra_chess_game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;


public class PFrame extends JFrame{
	boolean white;
	String newp;
	int i=0;
	public PFrame(Piece piece){
		this.white=piece.isWhite;
		this.setUndecorated(true);
		this.getContentPane().setBackground( new Color(33, 37, 41) );

	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		this.setBounds(0,0 , 600 , 300 );
        setLocationRelativeTo(null);
        JButton imgs[] = new JButton[4] ;
        ImageIcon pho[]=new ImageIcon[4];
        String path;
        this.setLayout(null);
		JLabel title=new JLabel("Promot your pawn :");
		title.setBounds(24, 20, 540, 50);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Serif", Font.PLAIN,30));
		title.setForeground(Color.white);
		this.add(title);
        for( i=1;i<5;i++) {
        	path="src\\assets\\"+i+".png";
        	pho[i-1]=new ImageIcon(path);
			pho[i-1].setImage(pho[i-1].getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
     		imgs[i-1]=new JButton(pho[i-1]); 
			imgs[i-1].setPreferredSize(new Dimension(10, 10));
    		//imgs[i-1].setIcon(pho[i-1]);
    		imgs[i-1].setBackground(new Color(33, 37, 41));
    		imgs[i-1].setBorder(BorderFactory.createLineBorder(new Color(33, 37, 41), 0));
    		imgs[i-1].setBounds(24*i+(i-1)*120, 100, 120, 120);
    		this.add(imgs[i-1]);
    		

        }    		
			imgs[0].addActionListener(e->{
				ChessGame.changePiece(piece,"queen");
				this.dispose();
				});
		
			imgs[1].addActionListener(e->{
				ChessGame.changePiece(piece,"bishop");
				this.dispose();
				});
			
			imgs[2].addActionListener(e->{
				ChessGame.changePiece(piece,"knight");
				this.dispose();
				});

			imgs[3].addActionListener(e->{
				ChessGame.changePiece(piece,"rook");
				this.dispose();
				});
	}
}
