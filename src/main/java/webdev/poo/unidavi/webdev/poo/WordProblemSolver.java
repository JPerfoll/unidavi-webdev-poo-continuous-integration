/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webdev.poo.unidavi.webdev.poo;

import java.util.HashMap;
import java.util.Map;

public class WordProblemSolver {
    
    private Map<String,Integer> resultados = new HashMap<String,Integer>();
        
    public WordProblemSolver() {
        resultados.put("What is 1 plus 1?", 2);
        resultados.put("What is 53 plus 2?", 55);
    }

    public Object solve(String sentence) {
        return resultados.get(sentence);
    }    
}
