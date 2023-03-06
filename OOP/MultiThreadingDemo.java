package OOP;

/*class Book extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){

            try {
                System.out.println("Book:  "+ Thread.currentThread().getId()+"is running...");
                //Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        }
        }*/

class Num extends Thread{
public void run(){
    for(int i=1;i<=5;i++){

        try {
            System.out.println("Num : "+ Thread.currentThread().getId());
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
    }
}
        }
/*class Trees extends Thread{
    public void run(){
        try {
            System.out.println("Tree : "+ Thread.currentThread().getId());
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}*/


public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
//Book book = new Book();
//Runnable book2 = new Book();
Num num = new Num();
//Thread t1 = new Thread(book2)
//Trees tree = new Trees();
//book.updateDb();
        Thread thread=new Thread(new Runnable() { // anonymous class
            @Override
            public void run() {
                for(int i=1;i<=5;i++){

                    try {
                        System.out.println("Book:  "+ Thread.currentThread().getId()+"is running...");
                        //Thread.sleep(1000);
                    } catch (Exception e) {

                    }//end try catch
                }//end for loop
            }
        });
        /**
         * name a thread
         */
        thread.setName("book1");
        System.out.println(thread.getName());

        /**
         * give priority to a thread
         */
        thread.setPriority(Thread.MAX_PRIORITY); // static variable. that's why put the class name before the priority
        System.out.println(thread.getPriority());

        thread.start();
       // t1.start();
        num.start();

        Thread thread2 = new Thread(()-> {
                for(int j=1;j<5;j++){
                    try {
                        System.out.println("Tree : "+ Thread.currentThread().getId());
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {}
                }
            }) ;


        thread2.start();
      /*  if(book2.isAlive()){
            System.out.println("still running...");
        }
        book.join();
        if(book2.isAlive()){
            System.out.println("still running...");
        }*/
        num.join();
        System.out.println("Bye");
    }
}
