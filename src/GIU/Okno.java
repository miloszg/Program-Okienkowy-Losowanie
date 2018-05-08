package GIU;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;



public class Okno extends JFrame{
    String s="Wynik losowania to: ";
    public int indeks=0;
    public int skoki=0;
    public int licznik=0;

    Okno(String nazwaOkna){
        super(nazwaOkna);
        setResizable(false);
        setSize(800,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        List<String> lista = new ArrayList<String>();
        for(int i=1;i<30;i++)
        {
            String string=" "+String.valueOf(i)+" ";
            lista.add(string);
        }

        JPanel p = new JPanel(new FlowLayout());
        JProgressBar pr=new JProgressBar();
        JLabel l= new JLabel("Wynik losowania to: ");
        JTextField t=new JTextField("  "+lista.get(0));
        t.setEditable(false);
        t.setFocusable(false);
        pr.setMaximum(5);
        this.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                if(ke.getKeyCode()==KeyEvent.VK_L){
                    refreshGUI(lista,l,pr);
                }
            }
        });
        pr.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                if(licznik==5){
                    l.setText("Koniec losowania!");
                }
            }
        });

        t.addMouseWheelListener(new MouseAdapter(){
            @Override
            public void  mouseWheelMoved(MouseWheelEvent e){

                if(e.getWheelRotation()>0){
                    if(skoki>0)  skoki--;}
                else{
                    if(skoki<lista.size()-1) skoki++;}
                setLosowanie(skoki,lista, t);
            }
        });

        p.add(pr);
        p.add(t);
        p.add(l);
        this.add(p);
        setVisible(true);
    }

    public void setLosowanie(int skoki,List<String> lista,JTextField t)
    {
        indeks=skoki;
        t.setText("  "+lista.get(indeks));
    }
    public void refreshGUI(List<String> lista,JLabel l,JProgressBar pr)
    {
        if(licznik!=5){
            licznik++;
            s+=lista.get(indeks);
            l.setText(s);
            lista.remove(indeks);
            pr.setValue(licznik);
        }
    }
}