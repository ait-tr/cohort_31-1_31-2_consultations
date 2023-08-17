public class Main {
    /*
    Сотрудники банка выдают кредиты. У каждого есть диапазон по времени - мин и макс
    время , которое требуется ему чтобы выдать кредит. minTime, maxTime.  Однако среди
    них есть сотрудник/ сотрудники , у которых вдруг возрастает работоспособность и они начинают
    выдавать кредиты быстрее, а потом опять скорость может снизиться до обычной.
    Почитать время, за которое каждый сотрудник выдаст N  кредитов.
     */
    public static void main(String[] args) throws InterruptedException {
     //   Thread myThread =Thread.currentThread();
     //   System.out.println(myThread.getName());
    //    myThread.getPriority();
    //    System.out.println(myThread);

        System.out.println("Main thread started");
      //  Thread.sleep(1000);

       NewThread newThread = new  NewThread( "NewThread1");
       newThread.start();

       newThread.join();

       NewThread thread2 = new NewThread("NewThread2");
       thread2.start();
       thread2.join();

       Thread myThreadRun = new Thread( new NewThreadRun(),"ThreadRunnable");
       myThreadRun.start();
       myThreadRun.join();

        System.out.println("Main thread finished");


    }
}
