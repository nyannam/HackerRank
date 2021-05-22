public class MultiThreadingPractice {
    public static void main(String[] args) {
        Hai obj1 = new Hai();
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();

    }


}

class Hai implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hai");
            try{Thread.sleep(500);} catch(Exception e){}

        }
    }
}

class Hello implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);} catch(Exception e){}

        }
    }
}


