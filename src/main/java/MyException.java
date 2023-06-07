public class MyException extends Exception{
    String my;
    public MyException(String my) {
this.my = my;
    }

    public String getLocalizedMessage(){
        return "MyException.getL";
    }
//    public String toString(){
//        return MyException.class + " : " + my;
//    }
}
