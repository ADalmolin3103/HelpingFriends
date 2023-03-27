public class Sandbosta {
    public static void main(String[] args) {
        String teste = "+aaa";
        Expressao xp = new Expressao(teste);
        System.out.println(xp.estaCorretaSinteticamente());
        System.out.println(xp.getQtdeDivisores());
        System.out.println(xp.getPosicaoOperador());
    }
}
