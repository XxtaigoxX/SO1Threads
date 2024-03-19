package Controllerex1;

public class ThreadCalc extends Thread {
private int[] linha;
private int linhaid;

public ThreadCalc(int linhaid,int []linha) {
	this.linhaid = linhaid;
	this.linha= linha; 
}
public void run() {
int soma =0;
for(int valor:linha) {
	//soma += valor;
	System.out.println(valor);
}
System.out.println("====");
}

}
