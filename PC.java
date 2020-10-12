package PC;

import CPU.CPU;
import HD.HardDisk;

public class PC {
 CPU cpu;
 HardDisk HD;
    public void setCPU(CPU c){
    	this.cpu=c;
    }
    public void setHardDisk(HardDisk h){
    	this.HD=h;
    }
   public void show(){
	   System.out.println("CPU的速度为"+cpu.getSpeed());
	   System.out.println("CPU的尺寸为"+cpu.getSize());
	   System.out.println("硬盘容量为"+HD.getAmount());
	   System.out.println("硬盘价格为"+HD.getPrice());
   }
}
