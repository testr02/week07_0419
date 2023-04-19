package test.object;

public class RunTV {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.setChannel(7);
		t1.setColor("Silver");
		t1.setPrice(10000000);
		t1.setProducer("SAMSUNG");
		t1.setSize(70);

		t2.setChannel(0);
		t2.setColor("Black");
		t2.setPrice(7000000);
		t2.setProducer("LG");
		t2.setSize(60);
		
		t1.powerOn();
		t1.upChannel();
		t1.upChannel();
		t1.downChannel();
		
		t2.powerOn();
		t2.upChannel();
		t2.upChannel();
		t2.powerOff();
	}

}
