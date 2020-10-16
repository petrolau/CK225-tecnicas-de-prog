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
            //saída desta classe seja gravada em um arquivo
            escreverTexto(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE))+ "\n" );
        }
        //ler o arquivo gerado e apresentá-lo na saída padrão.
        LerArquivo();
    }
    private Random fRandom = new Random();
    private double getGaussian(double aMean, double aVariance) {
        return aMean + fRandom.nextGaussian()*aVariance;
    }

    private static void escreverTexto( String pTextoEscrever) {
        try (
            FileWriter criadorArquivo = new FileWriter("random.txt", true);
            BufferedWriter buffer = new BufferedWriter(criadorArquivo);
            PrintWriter escritorArquivos = new PrintWriter(buffer);
        ) {
            escritorArquivos.append(pTextoEscrever);
            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void LerArquivo() {
        try (
            BufferedReader bufferLer = new BufferedReader(new FileReader("random.txt"));
        ) {
            String linha = "";
            while ((linha = bufferLer.readLine()) != null) {
                System.out.println(linha + "linha");
             } 
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }


}