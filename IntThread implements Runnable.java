class IntThread implements Runnable
{
Thread t;
IntThread()
{
t = new Thread ( this, “Test thread”);
System.out.println (“ Child thread :” + t);
t.start();
}
public void run()
{
try {
for (int i= 5; i0; j–)
{
System.out.println (“Main thread :” + j);
Thread.sleep (1000);
}
} catch (InterruptedException e) { }
System.out.println ( “Main thread exiting …”);
}
}

