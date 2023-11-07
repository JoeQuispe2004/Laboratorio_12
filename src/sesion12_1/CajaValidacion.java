package sesion12_1;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class CajaValidacion {

    private JTextField caja;
    private JLabel error;

    public CajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }
    public float getValor(){
       float valor=0;
        error.setText("");
        try {
            String valoTexto = caja.getText();
            valor = Float.parseFloat(valoTexto);
        } catch (NumberFormatException ex) {
            error.setText("Error de formato");
        }
        return valor; 
    }
    public void mostraInfo(String t){
        this.error.setText("");
        this.caja.setText(t);
    }
    public void mostrarError(String er){
        this.error.setText(er);
    }
    /**
     * @return the caja
     */
    public JTextField getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(JTextField caja) {
        this.caja = caja;
    }

    /**
     * @return the error
     */
    public JLabel getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(JLabel error) {
        this.error = error;
    }
    
}
