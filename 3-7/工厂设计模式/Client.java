interface Computer {
    void printComputer();
}

class Macbookpro implements Computer {
    public void printComputer() {
        System.out.println("This is a mac");
    }
}

class Surface implements Computer {
    public void printComputer() {
        System.out.println("This is a surface");
    }
}

class AlienWare implements Computer {
    public void printComputer() {
        System.out.println("This is a alienware");
    }
}

//工厂类，专门用于生产电脑
class ComputerFactory {
    //返回值是电脑
    public static Computer getInstance(String str) {
        if(str.equals("mac")) {
            return new Macbookpro();
        } else if(str.equals("surface")) {
            return new Surface();
        } else if(str.equals("alienware")) {
            return new AlienWare();
        } else {
            System.out.println("没有找到指定商品！！！");
            return null;
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getInstance(args[0]); 
        computer.printComputer();
    }
}