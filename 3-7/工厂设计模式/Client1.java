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

interface ComputerFactory {
    Computer creatComputer();
}

class AppleFactory implements ComputerFactory {
    public Computer creatComputer() {
        return new Macbookpro();
    }
}

class MsFactory implements ComputerFactory {
    public Computer creatComputer() {
        return new Surface();
    }
}

public class Client1 {
    public static void main(String[] args) {
        Computer computer = new AppleFactory().creatComputer();
        computer.printComputer();
    }
}