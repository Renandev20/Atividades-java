import java.net.URL;
import javax.sound.sampled.*;
import java.util.Scanner;

public class corithians {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String jogador;
        System.out.println("Digite o nome do jogador:");
        jogador = scan.nextLine();

        URL audioURL = null;
        if (jogador.equals("messi")) { 
            audioURL = new URL("https://www.youtube.com/watch?v=7UNo5Fl4sCk&ab_channel=FutPar%C3%B3dias");
        } else if (jogador.equals("ronaldo")) { 
            audioURL = new URL("http://www.soundjay.com/button/beep-01a.wav");
        } else {
            System.out.println("Jogador não reconhecido.");
            return; 
        }

        Clip clip = AudioSystem.getClip();
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioURL);
        clip.open(audioInputStream);
        clip.start();

        System.out.println("Áudio reproduzido para " + jogador);
    }
}
