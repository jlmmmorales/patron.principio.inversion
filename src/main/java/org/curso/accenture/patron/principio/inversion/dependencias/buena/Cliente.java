package org.curso.accenture.patron.principio.inversion.dependencias.buena;

public class Cliente {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    IWorker worker = new Worker();
    IWorker workerSuper = new SuperWorker();
    IWorker workerMini = new MiniWorker();
    //Puedo trabajar con el que quiera y no tengo que cambiar Manager
    Manager manager = new Manager();
    manager.setWorker(worker);
    manager.manage();
    
    manager.setWorker(workerSuper);
    manager.manage();
    
    manager.setWorker(workerMini);
    manager.manage();
    
    manager.setWorker(workerSuper);
    manager.manage();

  }

}
