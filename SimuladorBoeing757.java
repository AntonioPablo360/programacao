public interface Voar {
    void voar();
  }
  
  public interface Pousar {
    void pousar();
  }
  
  public class VoarDia implements Voar {
    @Override
    public void voar() {
      System.out.println("Voar durante o dia.");
    }
  }
  
  public class VoarNoite implements Voar {
    @Override
    public void voar() {
      System.out.println("Voar durante a noite.");
    }
  }
  
  public class PousarDia implements Pousar {
    @Override
    public void pousar() {
      System.out.println("Pousar durante o dia.");
    }
  }
  
  public class PousarNoite implements Pousar {
    @Override
    public void pousar() {
      System.out.println("Pousar durante a noite.");
    }
  }
  
  public abstract class Aviao {
    private Voar voarForma;
    private Pousar pousarForma;
  
    public Aviao() {}
  
    public abstract void informarDados();
  
    public void performanceVoar() {
      voarForma.voar();
    }
  
    public void performancePousar() {
      pousarForma.pousar();
    }
  
    public void setVoar(Voar voo) {
      voarForma = voo;
    }
  
    public void setPousar(Pousar pouso) {
      pousarForma = pouso;
    }
  }
  
  public class Boeing757 extends Aviao {
  
    public Boeing757() {
      voarForma = new VoarDia();
      pousarForma = new PousarDia();
    }
  
    @Override
    public void informarDados() {
      System.out.println("Informando dados de um Boeing 757.");
    }
  }
  
  public class SimuladorBoeing757 {
    public static void main(String[] args) {
      Boeing757 boing = new Boeing757();
  
      boing.performanceVoar();
      boing.performancePousar();
  
      boing.setVoar(new VoarNoite());
      boing.setPousar(new PousarNoite());
  
      boing.performanceVoar();
      boing.performancePousar();
    }
  }