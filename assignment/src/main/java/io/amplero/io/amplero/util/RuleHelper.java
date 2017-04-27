package io.amplero.io.amplero.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aseem80 on 4/2/17.
 */
public class RuleHelper {

    private static String VOWELS = "AEIOUY";
    private  static String CONSONANT = "BCDFGHJKLMNPQRSTVWXZ";




    private static final List<String> ALLOWED_COMBINATIONS_2_CHAR = new ArrayList<>();
    static {
        ALLOWED_COMBINATIONS_2_CHAR.add( "AI" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "AY" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "EA" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "EE" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "EA" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "EO" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "IO" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "OA" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "OO" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "OY" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "YA" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "YO" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "YU" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "BL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "BR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "CH" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "CK" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "CL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "CR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "DR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "FL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "FR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "GH" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "GL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "GR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "KL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "KR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "KW" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "PF" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "PL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "PR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SC" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SH" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SK" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SL" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SM" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SN" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SP" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SQ" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "ST" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "SW" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "TH" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "TR" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "TW" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "WH" );
        ALLOWED_COMBINATIONS_2_CHAR.add( "WR" );
    }

    private static final List<String> ALLOWED_COMBINATIONS_3_CHAR = new ArrayList<>();

    static {
        ALLOWED_COMBINATIONS_3_CHAR.add( "SCH" );
        ALLOWED_COMBINATIONS_3_CHAR.add( "SCR" );
        ALLOWED_COMBINATIONS_3_CHAR.add( "SHR" );
        ALLOWED_COMBINATIONS_3_CHAR.add( "THR" );

    }

    public static boolean doesWorldLookReal(String word) {
        word.charAt(0);

        return false;

    }

    private static boolean isAlternateVowelAndConsonant(String word) {
        char[] temp = new char[word.length()];
        for(int index=0; index < word.length(); index++) {
            Character ch = word.charAt(index);
            if(isVowel(String.valueOf( ch ))) {
                temp[index]='V';
            } else {
                temp[index]='C';
            }
        }
        for(int index=0; index < word.length(); index++) {

        }





        }


    public static boolean isVowel(CharSequence c){
        return VOWELS.contains(c);
    }

    public static boolean isConsanant(CharSequence c){
        return CONSONANT.contains(c);
    }
}
