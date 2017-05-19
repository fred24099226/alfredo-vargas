/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredo.vargas;

/**
 *
 * @author T-
 */
public class AlfredoVargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("alfredo");
        
        //probaremos nuestra solucion
        //1-crear 1 usuario hipotetico
        Usuario u=new Usuario();
        //2- le asigno valores
        u.altura=1.69f;
        u.peso=86f;
        //3-generamos el modelo IMC
        Imc imc=new Imc();
      
        System.out.println("el valor de imc es "+imc.calcular(u));
    }
    
}
