import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class Data{
    private int ano;
    private int mes;
    private int dia;

// Construtor
public Data (int ano, int mes, int dia){
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;

}

// Get da classe data
    public int getAno(){
        return ano;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }


// parse (pegar arquuivo e identifica variavel que preciso nele)
public static Data parseData(String s){
    String[] partes = s.split("-");

    int ano=Integer.parseInt(partes[0]);
    int mes=Integer.parseInt(partes[1]);
    int dia=Integer.perseInt(partes[2]);

}

public static String format(){
    return String.fo
}

}


class Veiculo{
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String categoria;
    private String[] combustivel;
    private int cilindros;
    private double cilindrada;
    private String transmissao;
    private String tracao;
    private double consumoCidade;
    private double consumoEntrada;
    private double co2;
    private boolean turbo;
    private Data dataRegistro;


// Contrutor
public Veiculo(int id, String marca, String modelo, int ano, String categoria, String[] combustivel, int cilindros, double cilindrada,
 String transmissao, String tracao, double consumoCidade, double consumoEntrada, double co2, boolean turbo, Data dataRegistro){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.categoria = categoria;
    this.combustivel = combustivel;
    this.cilindros = cilindros;
    this.cilindrada = cilindrada;
    this.transmissao = transmissao;
    this.tracao = tracao;
    this.consumoCidade = consumoCidade;
    this.consumoEntrada = consumoEntrada;
    this.co2 = co2;
    this.turbo = turbo;
    this.dataRegistro = dataRegistro;
}

// parse 
public static Veiculo parseVeiculo(String s){
    String[] partes = s.split("-");

    int id = Integer.parseInt(partes[0]);
    String marca = (partes[1]);
    String modelo = (partes[2]);
    int ano = Integer.parseInt(partes[3]);
    String categoria = (partes[4]);
    String[] combustivel = (partes[5]);
    int cilindros = Integer.parseInt(partes[6]);
    double cilindrada = Double.parseDouble(partes[7]);
    String transmissao = (partes[8]);
    String tracao = (partes[9]);
    double consumoCidade = Double.parseDouble(pates[10]);
    double consumoEntrada = Double.parseDouble(partes[11]);
    double co2 = Double.parseDouble(parte[12]);
    boolean turbo = Boolean.parseBoolean(partes[13]);
    Data dataRegistro = Data.parseData(partes[14]);

}

// Get da classe veiculo
    public int getId(){
        return id;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public String getCategoria(){
        return categoria;
    }
    public String[] getCombstivel(){
        return combustivel;
    }
    public int getCilindros(){
        return cilindros;
    }
    public double getCilindrada(){
        return cilindrada;
    }
    public String getTransmissao(){
        return transmissao;
    }
    public String getTracao(){
        return tracao;
    }
    public double getConsumoCidade(){
        return consumoCidade;
    }
    public double getConsumoEntrada(){
        return consumoEntrada;
    }
    public double getCo2(){
        return co2;
    }
    public boolean getTurbo(){
        return turbo;
    }
    public Data getDataRegistro(){
        return dataRegistro;
    }


}

class LeitorCsv{
    public static void (String[] args) {
        String filePath = "/tmp/entrada.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
