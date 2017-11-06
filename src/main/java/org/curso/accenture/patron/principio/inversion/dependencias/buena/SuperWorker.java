package org.curso.accenture.patron.principio.inversion.dependencias.buena;

public class SuperWorker implements IWorker{
  public void work() {
    System.out.println("SuperWorker... trabajando mucho más");
  }
  
  public void eat() {
    System.out.println("SuperWorker... comiendo en lanzamiento break");
  }

}
