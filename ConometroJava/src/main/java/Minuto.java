/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER00000000000000
 */
public class Minuto implements Runnable{
     private static boolean exit = false;
     
    @Override
    public void run() {
        int i=Integer.parseInt(Tela.contmin.getText());
        while (!exit) {
            Tela.contmin.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(60000);
            } catch (Exception e) {

            }
        }
    }
    static void stop(){
        exit = true;
    }
}
