import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public final class RandomGaussian {
    public static void main(String...aAStrings) {
        RandomGaussian gaussian = new RandomGaussian();
        double MEAN = 100.0f;
        double VARIANCE = 5.0f;
        for (int idx = 1; idx <= 10; idx++) {
            write(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE))+ "\n" );
        }
        
        read();
    }
    private Random fRandom = new Random();
    private double getGaussian(double aMean, double aVariance) {
        return aMean + fRandom.nextGaussian()*aVariance;
    }

    private static void write( String pTextoEscrever) {
        try (
            FileWriter create = new FileWriter("gaussian.txt", true);
            BufferedWriter buffer = new BufferedWriter(create);
            PrintWriter write = new PrintWriter(buffer);
        ) {
            write.append(pTextoEscrever);
            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        try (
            BufferedReader bufferLer = new BufferedReader(new FileReader("gaussian.txt"));
        ) {
            String line = "";
            while ((line = bufferLer.readLine()) != null) {
                System.out.println(line + "linha");
             } 
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }


}
