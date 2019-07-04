public class Banco{
    private float saldo;
	public Banco(float saldo){
		this.saldo=saldo;
	}
	public void setSaldo(float saldo){
		saldo=saldo;
	}
	public float getSaldo(){
		return saldo;
	}
	public void calcular(float monto, int op){
		switch(op){
			case 1:
				saldo+=monto;
				break;
			case 2:
				saldo-=monto;
				break;
		}
		setSaldo(saldo);
	}
	
}