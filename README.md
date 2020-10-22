# Java10-12
Java项目（计算机）
班级：计G202 
学号：2020322093
姓名：刘淑君

## 一.实验目的1
1.学会使用Java编写简单的类。理解类的属性和构造方法

2.掌握关键字private，public关键字的作用
## 二.实验过程
分别编写四个类PC、CPU、HardDisk、Test，Test为主类。

  1.CPU类：getSpeed()返回speed的值，setSpeed（int m）方法将参数m的值赋值给speed
  
  2.HardDisk类：getAmount()返回amount的值，setAmount(int m)方法将参数m的值赋值给amount
  
  3.PC类：setCPU(CPU c)将参数c的值赋值给CPU，setHardDisk(HardDisk h)方法将参数h的值赋给HD，show()方法显示CPU的速度和硬盘的容量
  
  4.Test类：
  
   (1)main方法中创建了一个CPU对象cpu,cpu将自己的speed设置为2200。
  
   (2)创建了一个HardDisk对象disk，disk将自己的amount设置为200。
	    
   (3)创建了一个PC对象pc。 
  
   (4)pc调用setCPU(CPU c)方法，调用时实参是cpu。
  
   (5)pc调用setHarDisk(HardDisk h)方法，调用时实参是disk。
  
   (6)pc调用show()方法。
## 三.核心方法
  (1)
```
public void setSpeed(int m){
	   this.speed=m;
   }
```
  (2)
```
public void setSize(int s){
	   this.size=s;
   }
```
  (3)
```
 public void setAmount(int m){
		   this.amount=m;
	   }
```
  (4)
```
public pc(){

     }
```
  (5)
```
 public void setCPU(CPU c){
    	this.cpu=c;
    }
```
  (6)
```
public cpu(){

    }
```
  (7)
```
 public void show(){
	   System.out.println("CPU的速度为"+cpu.getSpeed());
	   System.out.println("CPU的尺寸为"+cpu.getSize());
	   System.out.println("硬盘容量为"+HD.getAmount());
	   System.out.println("硬盘价格为"+HD.getPrice());
   }
```
## 四.实验结果
```
CPU的速度为2200
CPU的尺寸为65.0
硬盘容量为200
硬盘价格为400.0

```
## 五.实验感想
   通过本次实验，了解了如何创建一个构造方法，如何去传递参数，如何使用private，public关键字以及属性的各种类型。中间遇到了各种各样的问题，但是经过和同学共同交流都一并得到了解决。对于Java编程有了一个更深的认识。





