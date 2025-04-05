package com.example.websocket_demo.client;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class App {
    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String username=JOptionPane.showInputDialog(null,"Enter UserName (Max : 16 Characters) :","Chat Application",JOptionPane.QUESTION_MESSAGE);
                ClientGUI clientGUI=null;
               if (username==null ||username.isEmpty()|| username.length()>16){
                   JOptionPane.showMessageDialog(null,"Invalid Username","Error",JOptionPane.ERROR_MESSAGE);
                   return;

               }
               try{
                   clientGUI=new ClientGUI(username);

               }catch (ExecutionException e){
                   throw new RuntimeException(e);
               }catch (InterruptedException e){
                   throw new RuntimeException(e);
               }
               clientGUI.setVisible(true);
            }
        });
    }
}
