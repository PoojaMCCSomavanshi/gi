package com.java.util;

import java.util.HashMap;

public class AbstractFactory {

	public static void main(String[] args) {
		HashMap<Attributes,String> values = new HashMap<Attributes, String>();
		values.put(Attributes.HDD,"500Gb");
		values.put(Attributes.MONITOR,"LG");
		values.put(Attributes.WIFI,"v4");
		values.put(Attributes.POWER,"12vlt");
		values.put(Attributes.CAMERA,"8mp");
		values.put(Attributes.RAM,"5.0");
		values.put(Attributes.CPU,"1.7Gz");
		values.put(Attributes.SERVERROOM,"10*10");

		Laptop laptop = (Laptop) ApplicationComputerFactory.getComputer(ComputerTypes.L, values);
		System.out.println(laptop);
	}
}

abstract class Computer1{
	private String cpu;
	private String hdd;
	private String ram;
	
	public Computer1(String cpu, String hdd, String ram) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}
	public Computer1() {
		super();
	}
	
}

class Server1 extends Computer{
	private String serverRoom;
	private String morePower;
	
	public Server1(String cpu, String hdd, String ram, String serverRoom, String morePower) {
		super(cpu, hdd, ram);
		this.serverRoom = serverRoom;
		this.morePower = morePower;
	}
	public Server1() {
		super();
	}
	public Server1(String cpu, String hdd, String ram) {
		super(cpu, hdd, ram);
	}
	@Override
	public String toString() {
		return "Server [serverRoom=" + serverRoom + ", morePower=" + morePower + "]";
	}
	
	
	
}

class Desktop1 extends Computer{
	private String monitor;
	private String usbBluetooth;
	public Desktop1(String cpu, String hdd, String ram, String monitor, String usbBluetooth) {
		super(cpu, hdd, ram);
		this.monitor = monitor;
		this.usbBluetooth = usbBluetooth;
	}
	public Desktop1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Desktop1(String cpu, String hdd, String ram) {
		super(cpu, hdd, ram);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Desktop [monitor=" + monitor + ", usbBluetooth=" + usbBluetooth + "]";
	}
	
	
}

class Laptop1 extends Computer{
	private String wifi;
	private String camera;
	public Laptop1(String cpu, String hdd, String ram, String wifi, String camera) {
		super(cpu, hdd, ram);
		this.wifi = wifi;
		this.camera = camera;
	}
	public Laptop1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop1(String cpu, String hdd, String ram) {
		super(cpu, hdd, ram);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [wifi=" + wifi + ", camera=" + camera + "]";
	}
	
}


enum Attributes1{
	HDD,
	RAM,
	CPU,
	MONITOR,
	CAMERA,
	WIFI,
	BLUETOOTH,
	SERVERROOM,
	POWER
}

enum ComputerTypes1{
	D,
	S,
	L
}


abstract class MainFactory{
	abstract public Computer getComputer(ComputerTypes type,HashMap<Attributes,String> values);
	
}


class ServerFactory extends MainFactory{

	@Override
	public Computer getComputer(ComputerTypes type, HashMap<Attributes, String> hashamp) {
		String power = hashamp.get(Attributes.POWER);
		String serverRm = hashamp.get(Attributes.SERVERROOM);
		if(power!=null && serverRm!=null)
			return new Server(hashamp.get(Attributes.HDD),hashamp.get(Attributes.RAM),hashamp.get(Attributes.CPU),power,serverRm);
		System.out.println("INvalid Properties of Server");
		return null;
	}
	
}

class DesktopFactory extends MainFactory{

	@Override
	public Computer getComputer(ComputerTypes type, HashMap<Attributes, String> values) {
		return null;
	}
	
}

class LaptopFactory extends MainFactory{

	@Override
	public Computer getComputer(ComputerTypes type, HashMap<Attributes, String> values) {
		return null;
	}
	
}

class ApplicationComputerFactory1{
	static public Computer getComputer(ComputerTypes type,HashMap<Attributes,String> hashamp) {
		Computer computer =null;
		String hdd = hashamp.get(Attributes.HDD);
		String ram = hashamp.get(Attributes.RAM);
		String cpu = hashamp.get(Attributes.CPU);
		
		if(hdd!=null && ram!=null && cpu!=null) {
			switch (type) {
			case S:
			
				break;
			case D:
				String monitor = hashamp.get(Attributes.MONITOR);
				String bluetooth = hashamp.get(Attributes.BLUETOOTH);
				if(monitor!=null && bluetooth!=null)
					computer = new Desktop(hdd,ram,cpu,monitor,bluetooth);
				System.out.println("Invalid Properties for Desktop");
				break;
			case L:
				String camera = hashamp.get(Attributes.CAMERA);
				String wifi = hashamp.get(Attributes.WIFI);
				if(camera!=null && wifi!=null)
						computer = new Laptop(hdd,ram,cpu,camera,wifi);
				System.out.println("Invalid Properties for Laptop");
				break;
			default:
				System.out.println("Cannot Create Computer-- as invalid Type..");
				break;
	}
		}else {
			System.out.println("Mandatory properties not given..");
		}
		
		return computer;
	}
}
