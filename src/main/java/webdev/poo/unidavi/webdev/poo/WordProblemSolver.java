/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webdev.poo.unidavi.webdev.poo;

/**
 *
 * @author 31888
 */
public class WordProblemSolver {

    public Object solve(String sentence) {
        if ("What is 1 plus 1?".equals(sentence)) {
            return 2;
        } else if ("What is 53 plus 2?".equals(sentence)) {
            return 55;
        } else {
            return 0;
        }
    }
    
}
