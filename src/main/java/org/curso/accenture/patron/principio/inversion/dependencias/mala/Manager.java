package org.curso.accenture.patron.principio.inversion.dependencias.mala;

public class Manager {
  Worker worker;
  
  public void setWorker (Worker w) {
    worker = w;
  }
  
  public void manage() {
    worker.work();
  }
}
