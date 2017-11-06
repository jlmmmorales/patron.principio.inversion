package org.curso.accenture.patron.principio.inversion.dependencias.buena;

public class Worker implements IWorker {
  public void work() {
    System.out.println("Worker ... working");
  }
  public void eat() {
    System.out.println("Worker ... comiendo en launch break");
  }

}
