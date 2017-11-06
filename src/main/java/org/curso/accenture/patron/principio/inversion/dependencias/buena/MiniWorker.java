package org.curso.accenture.patron.principio.inversion.dependencias.buena;

public class MiniWorker implements IWorker{
  public void work() {
    System.out.println("MiniWorker... trabajando mucho menos");
  }
  
  public void eat() {
    System.out.println("SuperWorker... comiendo en lanzamiento break");
  }

}
