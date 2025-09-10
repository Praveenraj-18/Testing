package org.changepond;

public class CPU {
	double price = 45000;
	 
    class Processor {
        int cores = 8;
        String manufacturer = "HP";
 
        double getCache() {
            return 10.0;
        }
    }
 
    class RAM {
        int memory = 16;
        String manufacturer = "A16";
 
        double getClockSpeed() {
            return 3.2;
        }
    }
 
    public static void main(String[] args) {
        CPU cpu = new CPU();
 
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
 
        System.out.println("Processor Cache: " + processor.getCache() + " MB");
        System.out.println("RAM Clock Speed: " + ram.getClockSpeed() + " GHz");
    }



}
