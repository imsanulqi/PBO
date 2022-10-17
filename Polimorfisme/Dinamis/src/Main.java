abstract class GateTol{
    protected abstract void TapGate();
}

class Gol1 extends GateTol{
    protected void TapGate(){
        System.out.println("Golongan 1 Rp. 11.000");
    }
}

class Gol2 extends GateTol{
    protected void TapGate(){
        System.out.println("Golongan 2 Rp. 13.000");
    }
}

class Gol3 extends GateTol{
    protected void TapGate(){
        System.out.println("Golongan 3 Rp. 18.000");
    }
}

public class Main{
    public static void main(String[] args) {
      GateTol Gol1 = new Gol1();
      Gol1.TapGate();
      
      GateTol Gol2 = new Gol2();
      Gol2.TapGate();

      GateTol Gol3 = new Gol3();
      Gol3.TapGate();
    }
}