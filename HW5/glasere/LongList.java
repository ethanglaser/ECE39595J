public class LongList implements MyList{
    private LongList next;
    private long data;

    public LongList(LongList n, long _data){
        if (n == null){
            next = null;
            data = _data;
        }
        else{
            data = n.data;
            LongList head = n;
            while(head.next != null){
                head = head.next;
            }
            head.next = new LongList(null, _data);
            next = n.next;
        }
    }
    public long getData( ){
        return data;
    }
    public LongList next( ){
        return next;
    }
    public void printNode( ){
        System.out.println("LongList Node, data is: " + data);
    }
}
