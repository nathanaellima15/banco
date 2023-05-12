public class Contab {

    private int Numero;
    private String NomeAgencia;
    private String Banco;
    private String TipoConta;
    private float Saldo;
    private int NumAgencia;
    private int NumBanco;

    public void abrir( int Numero,String NomeAgencia, String Banco, String TipoConta, 
            int Saldo, int NumAgencia, int NumBanco) {
        this.Numero = Numero;
        this.NomeAgencia = NomeAgencia;
        this.Banco = Banco;
        this.TipoConta = TipoConta;
        this.Saldo = Saldo;
        this.NumAgencia = NumAgencia;
        this.NumBanco = NumBanco;
        
    }
    public void encerrar(Numero, NomeAgencia, Banco, TipoConta, NumAgencia, NumBanco) {
    
    }
    public void consultar() {
    
    }
    public void saldo() {
    
    }
    public void creditar() {
    
    }
    public void debitar() {
    
    }
}
