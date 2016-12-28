/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wsuwka
 */
public class PsychoProfile {
    float IE; //if(-IE) Introwertk; else if(IE) Ekstrawertyk;
    float NS;
    float FT;
    float JP;
    
    PsychoProfile(){
        IE=0;
        NS=0;
        FT=0;
        JP=0;
    }
    void print() {
        System.out.println("IE: " + IE + ", NS: " + NS + ", JP: " + JP);
    }
    
    public float getIE() {
        return IE;
    }

    public void setIE(float IE) {
        this.IE = IE;
    }

    public float getNS() {
        return NS;
    }

    public void setNS(float NS) {
        this.NS = NS;
    }

    public float getFT() {
        return FT;
    }

    public void setFT(float FT) {
        this.FT = FT;
    }

    public float getJP() {
        return JP;
    }

    public void setJP(float JP) {
        this.JP = JP;
    }
        
}
