package org.curso.accenture.patron.principio.inversion.dependencias.mala;

public class Cliente {

  public static void main(String[] args) {
    
    Worker worker1 = new Worker();
    // Tengo que cambiar el Manager para poder trabajar con SuperWorker
    Manager manager = new Manager();
    manager.setWorker(worker1);
    manager.manage();

  }

}
