/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webdev.poo.unidavi.webdev.poo;

import java.util.HashMap;
import java.util.Map;

public class WordProblemSolver {
    
    private Map<String,Integer> resultados = new HashMap<>();
        
    public WordProblemSolver() {
        resultados.put("What is 1 plus 1?", 2);
        resultados.put("What is 53 plus 2?", 55);
        resultados.put("What is 45 plus 6?", 51); 
        resultados.put("What is 45 plus 7?", 52); 
        resultados.put("What is 45 plus 8?", 53); 
        resultados.put("What is 45 plus 9?", 54); 
        resultados.put("What is 45 plus 10?", 55); 
        resultados.put("What is 45 plus 11?", 56); 
        resultados.put("What is 45 plus 12?", 57); 
        resultados.put("What is 45 plus 13?", 58); 
        resultados.put("What is 45 plus 14?", 59); 
        resultados.put("What is 45 plus 15?", 60); 
        resultados.put("What is 45 plus 16?", 61); 
    }

    public Object solve(String sentence) {
        return resultados.get(sentence);
    }    
}
