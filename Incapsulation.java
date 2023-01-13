public class Incapsulation {
    public static void main(String[] args) {
   Customer c = new Customer();
   c.setData(001,"mustafa",123456);
   System.out.println(c.getCid()+" "+c.getCname()+" "+c.getCnum());
    }
}

class Customer{
    private int cid;
    private String cname;
    private long cnumber;
    
    public void setData(int cid, String cname, long cnumber){
        this.cid=cid;
        this.cname=cname;
        this.cnumber=cnumber;
    }

    public int getCid(){
       return cid; 
    }

    public String getCname(){
        return cname;
    }
    public long getCnum(){
        return cnumber;
    }

    public long getCnumber() {
        return cnumber;
    }
}


