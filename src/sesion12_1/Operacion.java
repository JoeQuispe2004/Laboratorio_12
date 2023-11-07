package sesion12_1;
public class Operacion {
    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;
    public Operacion(CajaValidacion valor1, 
                     CajaValidacion valor2,
                     CajaValidacion resultado) {
        this.caja1 = valor1;
        this.caja2 = valor2;
        this.resultado = resultado;
    }
    public void suma(){
        float res = this.caja1.getValor()+
                this.caja2.getValor();
        this.resultado.mostraInfo(res + "");
    }
    public void resta(){
        float res = this.caja1.getValor()-
                this.caja2.getValor();
        this.resultado.mostraInfo(res + "");
    }
    public void mul(){
        float res = this.caja1.getValor()*
                this.caja2.getValor();
        this.resultado.mostraInfo(res + "");
    }public void div(){
        float res = this.caja1.getValor()/
                this.caja2.getValor();
        if(this.caja2.getValor()==0){
            this.resultado.mostrarError("No se puede dividir entre cero");
        }else if(this.caja1.getValor()==0&&this.caja2.getValor()==0){
            this.resultado.mostrarError("Ambos numeros "
                                      + "deben ser mayores a cero");   
        }else {
        this.resultado.mostraInfo(res + "");
        }
    }
    
}
