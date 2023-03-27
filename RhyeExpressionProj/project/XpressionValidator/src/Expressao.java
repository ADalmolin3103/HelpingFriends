public class Expressao {
    //Atributo de classe
    String expressao ="";
    char[] expAr; //Array de caracteres que forma a expressao. Utilizado para iterar e verificar cada caracter

    public Expressao(String exp){
        this.setExpressao(exp);
        expAr = expressao.toCharArray();
    }

    //Getters && Setters
    public String getExpressao() {
        return expressao;
    }
    
    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public boolean estaCorretaSinteticamente(){
        int parentesesNumero = 0; //Controle de parenteses. "(" soma 1, ")" subtrai
        
        for(char c: expAr){
            if(c == '('){
                parentesesNumero++;
            } else if (c == ')'){
                parentesesNumero--;
            }
            if(parentesesNumero < 0){ //Se em qualquer momento o contador for negativo, implica que foi fechado um parenteses antes de abrir. Hence, return false
                //Dieses ist sehr Einfach muahahahah
                return false;
            }
        }
        if(parentesesNumero == 0) {
            return true;
        } else { //Se cair aqui so pode significar que parentesesNumero é maior que 0, ou seja, abriu mais do que fechou
            return false;
        }

    }
    
    public int getQtdeDivisores(){
        int qtdDivisor = 0;
        for(char c: expAr){
            if(c == '/'){
                qtdDivisor++;
            }
        }
        return qtdDivisor;
    }

    public int getPosicaoOperador(){
        char c = ' ';
        for(int i = 0; i < expAr.length; i++){
            c = expAr[i];
            if(String.valueOf(c).matches("[-|+|*|/]")){
                return i;
            }
        }
        return -1; // -1 == sem operador
    }
}

