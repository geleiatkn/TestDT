class Conta {
  int numero;
  String dono;
  double saldo;
  double limite;
     
  boolean saca(double quantidade) {
	     double novoSaldo = this.saldo - quantidade; 
	     this.saldo = novoSaldo;
	     return true;
  }
  
  void deposita(double quantidade) {
	     this.saldo += quantidade;
	   }
  
  
}

