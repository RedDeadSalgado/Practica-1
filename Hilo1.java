package practica1_20084;
import javax.swing.JTextArea;

public class Hilo1 extends Thread{
    private JTextArea area;
    public Hilo1(JTextArea area){
        this.area=area;
    }
    public void run(){
        int i=0;
        while(true){
            area.append(i + "\n");
            i++;
        }
    }
}
