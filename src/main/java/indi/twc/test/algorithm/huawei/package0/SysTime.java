package indi.twc.test.algorithm.huawei.package0;

public class SysTime extends Thread{
	public static void main(String[] args) {  
	    Whore ivanka = new Whore();
        ivanka.warmUp();
        ivanka.fuck();
        ivanka = null;
        System.gc();
	  }  
}

class Whore{
    private String status;
    private boolean done;
    public Whore()
    {
        this.done = false;
        this.status = "1:ready to get fucked!";
        System.out.println(this.status);
    }
    void warmUp(){
        this.status= "2:Cloth taken off and on-bed ready!";
        System.out.println(this.status);
        this.status = "3:Wet and Ready!";
        System.out.println(this.status);
    }
    void fuck(){
        this.status ="4:oooh, yes ,fuck,aaaa~~~!";
        System.out.println(this.status);
        this.done = true;
    }
    protected void finalize(){
        if(done)
        System.out.println("5:Job Done And Money Received!");
    }
}
