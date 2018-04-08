
package arbolfinal;

import java.util.ArrayList;
import javax.swing.JPanel;

public class SimuladorMetodos {
    
   TreeSet miArbol = new TreeSet();

    public SimuladorMetodos() {
    }

    public boolean add(String dato) {
        return (this.miArbol.add(dato));
       
    }
/*
    public String borrar(String dato) {
        String x = this.miArbol.borrar(dato);
        if (x == null) {
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: " + x.toString());
    }

    public String preOrden() {
        ArrayList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String inOrden() {
        ArrayList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }

     public List<E> postOrderList() {
        ArrayList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }

    public String imprimirPorNiveles() {
        ArrayList it = this.miArbol.impNiveles();
        return (recorrido(it, "Imprimir Por niveles"));
    }

    public String darHojas() {
        ArrayList it = this.miArbol.getHojas();
        return (recorrido(it, "Hojas del Arbol"));
    }

    private String recorrido(ArrayList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "\n";
            i++;
        }
        return (r);
    }
    
    public String alturaArbol(){
        return this.miArbol.retornarAltura();
    }
 
    public String balance(){
        return this.miArbol.imprimirBalance();
    }
  
    public String porNivel(){
        this.miArbol.alturaArbol();
        ArrayList it = this.miArbol.imprimirNivel();
        return (recorrido(it, "Imprimir Por niveles en orden!!!"));
    }

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    } */
}
