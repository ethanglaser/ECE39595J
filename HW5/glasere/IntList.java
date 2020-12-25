public class IntList implements MyList{
    private IntList next;
    private int data;

    public IntList(IntList n, int _data){
        if(n == null){
            next = null;
            data = _data;
        }
        else{
            next = n;
            data = _data;
        }
    }
    public int getData( ){
        return data;
    }
    public IntList next( ){
        return next;
    }
    public void printNode( ){
        System.out.println("IntList Node, data is: " + data);
    }
}
