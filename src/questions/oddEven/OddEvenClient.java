package questions.oddEven;

public class OddEvenClient {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OddPrinter());
        Thread thread2 = new Thread(new EvenPrinter());

        thread1.start();
        thread2.start();
    }
}

/*
* Even is: 2
Even is: 4
Odd is: 1
Even is: 6
Odd is: 3
Even is: 8
Odd is: 5
Even is: 10
Odd is: 7
Odd is: 9
*
* As we can see two threads are running in parallel.
* so the output is not consistent, if there would have no threading then
* as we have called odd first, all odd number should be printed then,
* all even number should be printed.
* */
