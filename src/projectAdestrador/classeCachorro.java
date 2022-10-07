package projectAdestrador;

public class classeCachorro {
    public int Energy;

    public int getEnergy(){
        return this.Energy;
    }
    public void increaseEnergy (int valueIncrease){
        this.Energy = this.Energy + valueIncrease;
    }
    public void decreaseEnergy (int valueDecrease){
        this.Energy = this.Energy - valueDecrease;

    }
    //1
    public void cachorroLatir(){
        System.out.println("Cachorro: Au!Au!Au\n-2 Energia");
        int decreaseValue = 2;
        decreaseEnergy(decreaseValue);
    }
    //2
    public void cachorroAndar(){
        System.out.println("Cachorro: *Andando*\n-1 Energia");
        int decreaseValue = 1;
        decreaseEnergy(decreaseValue);

    }
    //3
    public void cachorroPular(){
        System.out.println("Cachorro: *Pula*\n-3 Energia");
        int decreaseValue = 3;
        decreaseEnergy(decreaseValue);

    }
    //4
    public void cachorroSentar(){
        System.out.println("Cachorro: *Senta*\n+2 Energia");
        int increaseValue = 2;
        increaseEnergy(increaseValue);
    }
    //5
    public void cachorroFicar(){
        System.out.println("Cachorro: *Fica*\n+1 Energia");
        int increaseValue = 1;
        increaseEnergy(increaseValue);

    }
    //6
    public void cachorroReceberRecompensa(){
        System.out.println("Cachorro: *Come biscoitos Scooby*\n+5 Energia");
        int increaseValue = 5;
        increaseEnergy(increaseValue);


    }


}
