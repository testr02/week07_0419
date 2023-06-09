package test.object;

public class TV {
	private int size;
	private int price;
	private String color;
	private String producer;
	private int channel;
	private int volume;
// setter, getter 메소드 추가
// setter: 필드 값을 설정
// getter: 필드 값을 반환
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void powerOn() {
		System.out.println(color +"색상의 "+producer+"의 TV 전원을 켜다");
	}
	public void powerOff() {
		System.out.println(color +"색상의 "+producer+"의 TV 전원을 끄다");
	}

	public void upChannel() {
		System.out.println("현재채널은 "+ ++channel+"번: "+color +"색상의 "+producer+"의 TV 프로그램을 위로 돌림");
	}
	public void downChannel() {
		System.out.println("현재채널은 "+ --channel+"번: "+color +"색상의 "+producer+"의 TV 프로그램을 아래로 누름");
	}


}
