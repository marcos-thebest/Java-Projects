public class App {
    public static void main(String[] args) {

        // Criando o Objeto a partir da classe PC - Instanciação
        Computador pc = new Computador();

        pc.modelo = "G5";
        pc.marca = "Dell";
        pc.espacoHD = 256;
        pc.memoriaRam = 8;
        pc.placaDeVideoDedicada = true;
        pc.processador = "i7";
        pc.preco = 5200.50;

        // Criando outro objeto a partir da minha classe Fabricante - Relacionamento entre Classes
        Fabricante dell = new Fabricante();

        dell.nome = "Dell";
        dell.endereco = "1 Dell Way, Round Rock, TX 78682, USA";

        pc.fabricante = dell;

        // Criando mais um objeto a partir da classe PC - Instanciação
        Computador note = new Computador();

        note.modelo = "Macbook Pro";
        note.marca = "Apple";
        note.placaDeVideoDedicada = false;
        note.espacoHD = 512;
        note.memoriaRam = 16;
        note.processador = "i5";
        note.preco = 15999.99;

        // Criando outro objeto a partir da minha classe Fabricante - Relacionamento entre Classes
        Fabricante apple = new Fabricante();

        apple.nome = "Apple";
        apple.endereco = "One Apple Park Way, Cupertino, CA 95014, United States";

        note.fabricante = apple;
    }
}