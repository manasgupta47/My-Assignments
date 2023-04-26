
class SingletonInheritanceCheck {
    private static SingletonInheritanceCheck instance;
    private SingletonInheritanceCheck(){}
    public static SingletonInheritanceCheck getInstance(){
        if(instance==null)
            instance=new SingletonInheritanceCheck();
        return instance;
    }
}
public class MySingleton extends SingletonInheritanceCheck{
    //This will not complie we got an error saying that
    // Signleton costructor is not visiable
}
public class Assignment2Q1 {
public static void main(String args[]){
SingletonInheritanceCheck obj1=SingletonInheritanceCheck.getInstance();
  }
}
