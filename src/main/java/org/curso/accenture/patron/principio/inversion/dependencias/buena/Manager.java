package org.curso.accenture.patron.principio.inversion.dependencias.buena;

public class Manager {
  IWorker worker;
  
  public void setWorker (IWorker w) {
    worker = w;
  }
  
  public void manage() {
    worker.work();
  }
}
