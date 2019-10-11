/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.trim().toLowerCase().contains(searched.trim().toLowerCase())) {
            return true;
        }
        return false;
    }
}
