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
	   System.out.println("CPU���ٶ�Ϊ"+cpu.getSpeed());
	   System.out.println("CPU�ĳߴ�Ϊ"+cpu.getSize());
	   System.out.println("Ӳ������Ϊ"+HD.getAmount());
	   System.out.println("Ӳ�̼۸�Ϊ"+HD.getPrice());
   }
}
