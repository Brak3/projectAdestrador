package projectAdestrador;
import java.util.ArrayList;
import java.util.Scanner;

public class classeAdestrador {
    classeCachorro treinarCachorro = new classeCachorro();
    ArrayList<Integer> adestradorComandos = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    public void iniciarTreinamento(int varControl) {
        while (varControl == 1) {
            for (int i = 1; i < 100; i++) {
                commandList();
                int listaInsere = input.nextInt();
                if (listaInsere == 7) {
                    System.out.println("Executando comandos");
                    doCommands();
                } else if (listaInsere > 7 || listaInsere < 1) {
                    commandListUnknowNumber();
                    listaInsere = input.nextInt();
                    addCommands(listaInsere, i);
                } else {
                    addCommands(listaInsere, i);
                }
            }
        }


    }

    public void commandList() {
        System.out.println("Terminal de comando do Rex 2000, insira os comandos que ele devera realizar (Um de cada vez!\n" +
                "1-Latir | -2 Energia\n" +
                "2-Andar | -1 Energia\n" +
                "3-Pular | -3 Energia\n" +
                "4-Sentar | +2 Energia\n" +
                "5-Ficar | +1 Energia\n" +
                "6-Dar recompensa | +5 Energia\n" +
                "7-Executar comandos");
    }

    public void commandListUnknowNumber() {
        System.out.println("Comando não reconhecido, digite novamente.\n" +
                "1-Latir | -2 Energia\n" +
                "2-Andar | -1 Energia\n" +
                "3-Pular | -3 Energia\n" +
                "4-Sentar | +2 Energia\n" +
                "5-Ficar | +1 Energia\n" +
                "6-Dar recompensa | +5 Energia\n" +
                "7-Executar comandos");
    }

    public void addCommands(int listaInsere, int numberContador) {
        this.adestradorComandos.add(listaInsere);
    }

    public void doCommands() {
        for (int i : this.adestradorComandos) {
            if (i == 1) {
                int usoEnergy = 2;
                checkEnergy(usoEnergy);
                treinarCachorro.cachorroLatir();
            } else if (i == 2) {
                int usoEnergy = 1;
                checkEnergy(usoEnergy);
                treinarCachorro.cachorroAndar();
            } else if (i == 3) {
                int usoEnergy = 3;
                checkEnergy(usoEnergy);
                treinarCachorro.cachorroPular();
            } else if (i == 4) {
                treinarCachorro.cachorroSentar();
            } else if (i == 5) {
                treinarCachorro.cachorroFicar();
            } else if (i == 6) {
                treinarCachorro.cachorroReceberRecompensa();
            }
        }
        exitProgram();
    }

    public void checkEnergy(int usoEnergia) {
        int varControl = treinarCachorro.getEnergy() - usoEnergia;
        if (varControl < 0) {
            System.out.println("O cachorro não possui energia para realizar uma ação da lista.");
            System.out.println("Deseja dar um bisoito Scooby ao cachorro? +5 Energia\n" +
                    "1-Sim\n" +
                    "2-Não");
            int varControl2 = input.nextInt();
            if (varControl2 == 1) {
                treinarCachorro.cachorroReceberRecompensa();
            } else {
                System.out.println("O cachorro não possui energia para realizar a ação.. ");
                exitProgram();
            }
        } else {
            return;
        }
    }

    public void exitProgram() {
        System.out.println("Programa sera finalizado !");
        System.exit(0);
    }
}