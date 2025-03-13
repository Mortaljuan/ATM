    public static void main(String[] args) {

        System.out.println("Dinero total en el sistema: $ " + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);

        ATM firstATM = new ATM(1000,"Bancolombia");
        ATM secondATM =new ATM(500,"Caja Social");
        firstATM.withdrawMoney(320);
        secondATM.withdrawMoney(200);
        firstATM.depositMoney(800);
        secondATM.depositMoney(1200);
        firstATM.checkBalance();
        secondATM.checkBalance();
        System.out.println("Dinero total en el sistema: $ " + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);
        ATM.averageMoney();
        //ATM.checkMoney();
    }