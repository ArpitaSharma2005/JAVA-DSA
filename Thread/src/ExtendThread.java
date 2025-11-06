
class NewThread extends Thread
{
NewThread()
{
super("Demo Thread");
System.out.println("child thread: "+this);
start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("child thread: "+i);
Thread.sleep(2000);
}
}
catch(InterruptedException e)
{
System.out.println("child interrupted");
}
System.out.println("Exiting child thread");
}
}

class ExtendThread
{
public static void main(String args[])
{
new NewThread();
try
{
for(int i=5;i>0;i--)
{
System.out.println("Main thread"+i);
Thread.sleep(4000);
}
}
catch(InterruptedException e)
{
System.out.println("main thread interrupted");
}
System.out.println("main thread exiting");
}
}