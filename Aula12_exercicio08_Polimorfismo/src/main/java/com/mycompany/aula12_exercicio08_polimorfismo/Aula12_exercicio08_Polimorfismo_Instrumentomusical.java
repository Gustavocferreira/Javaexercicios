/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12_exercicio08_polimorfismo;
import java.util.ArrayList;
import java.util.List;

abstract class InstrumentoMusical {
    public abstract void tocar();
}

class Piano extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.print("O piano está sendo tocado. ");
    }
}

class Guitarra extends InstrumentoMusical {
    @Override
    public void tocar() {    
        System.out.print("A guitarra está sendo tocada. ");
    }
}

public class Aula12_exercicio08_Polimorfismo_Instrumentomusical {
    public static void main(String[] args) {
        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        
        instrumentos.add(new Piano());
        instrumentos.add(new Guitarra());
        
        for(InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}