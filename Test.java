package computer;

import CPU.CPU;
import HD.HardDisk;
import PC.PC;

public class Test {
  public static void main(String args[]){
	  CPU cpu=new CPU();
	  HardDisk disk=new HardDisk();
	  cpu.setSpeed(2200);
	  cpu.setSize(65);
	  disk.setAmount(200);
	  disk.setPrice(400);
	  PC pc=new PC();
	  pc.setCPU(cpu);
	  pc.setHardDisk(disk);
	  pc.show();
  }
}
