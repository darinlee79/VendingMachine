public class VendingMachine {
    int cappuccinos;
    int espressos;
    int lattes;
    double cappuccinoCost;
    double espressoCost;
    double latteCost;
    public VendingMachine(){
        cappuccinos = 10;
        espressos = 10;
        lattes = 10;
        cappuccinoCost = 12;
        espressoCost = 10;
        latteCost = 8;
    }
    public String reloadVendingMachine(){
        cappuccinos = 10;
        espressos = 10;
        lattes = 10;
        return "SUCCESS";
    }
    public String buyCappuccino(Student student, int amount) {
        double totalAmount = cappuccinoCost*amount;
        if (cappuccinos >= amount){
            if (student.getMoney() >= totalAmount){
                for (int i = 0; i < amount; i++) {
                    student.addItems("cappuccino");
                    cappuccinos--;
                }
                student.setMoney(student.getMoney() - totalAmount);
            }
            else {
                return "YOU DO NOT HAVE ENOUGH MONEY";
            }
        }
        else {
            return "CAPPUCCINOS ARE SOLD OUT";
        }
        return "SUCCESS";
    }
    public String buyEspresso(Student student, int amount) {
        double totalAmount = espressoCost*amount;
        if (espressos >= amount){
            if (student.getMoney() >= totalAmount){
                for (int i = 0; i < amount; i++) {
                    student.addItems("espresso");
                    espressos--;
                }
                student.setMoney(student.getMoney() - totalAmount);
            }
            else {
                return "YOU DO NOT HAVE ENOUGH MONEY";
            }
        }
        else {
            return "ESPRESSOS ARE SOLD OUT";
        }
        return "SUCCESS";
    }
    public String buyLatte(Student student, int amount) {
        double totalAmount = latteCost*amount;
        if (lattes >= amount){
            if (student.getMoney() >= totalAmount){
                for (int i = 0; i < amount; i++) {
                    student.addItems("latte");
                    lattes--;
                }
                student.setMoney(student.getMoney() - totalAmount);
            }
            else {
                return "YOU DO NOT HAVE ENOUGH MONEY";
            }
        }
        else {
            return "LATTES ARE SOLD OUT";
        }
        return "SUCCESS";
    }
}
