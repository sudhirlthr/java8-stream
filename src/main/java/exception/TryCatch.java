package exception;

public class TryCatch {
    public static void main(String[] args) throws MyException {try {
        System.out.println("1");
        m1();
        System.out.println("2");
    }catch (Exception e){
        System.out.println("3");
        throw new MyException2();
    }finally {
        System.out.println("4");
        throw new MyException();
    }
    }
    private static void m1() throws Exception {
        try {
            System.out.println("5");
            throw new MyException();
        }catch (Exception e){
            System.out.println("6");
            throw new MyException2();
        }finally {
            System.out.println("7");
            throw new Exception();
        }
    }
}
class MyException extends Exception{
    MyException(){
        super();
    }
}
class MyException2 extends Exception{
    MyException2(){
        super();
    }
}
