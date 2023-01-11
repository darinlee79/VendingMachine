import java.util.ArrayList;

public class Student {
    String name;
    double money;
    ArrayList<String> myItems;
    public Student(String name){
        this.name = name;
        money = 50;
        myItems = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getMyItems() {
        String myItemsList = "My Items=\n";
        for(String item : myItems){
            myItemsList += item + ", ";
        }
        return myItemsList;
    }

    public void setMyItems(ArrayList<String> myItems) {
        this.myItems = myItems;
    }
    public void addItems(String coffeeType) {
        myItems.add(coffeeType);
    }
}
