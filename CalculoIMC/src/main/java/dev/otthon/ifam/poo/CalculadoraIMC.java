package dev.otthon.ifam.poo;

public class CalculadoraIMC {
    private double peso;
    private double altura;

    public double getIMC() {

        return (peso / (altura * altura));
        System.out.println();
    }

    public String getClassificacaoIMC() {

        double imc = getIMC();

        if(imc < 17) {
            return "Seu IMC é " + imc + "e está classificado como: MUITO ABAIXO DO PESO.\nPode ocasionar: queda no cabelo, infertilidade, ausência mestrual.";
        } else if (imc >= 17 && imc < 18.5) {
            return "Seu IMC é " + imc + "e está classificado como: ABAIXO DO PESO.\nPode ocasionar: Fadiga, stress, ansiedade.";
        } else if (imc >= 18.5 && imc < 25) {
            return "Seu IMC é " + imc + "e está classificado como: PESO NORMAL.\nPode ocasionar: Menor risco de doenças cardíacas e vasculares.";
        } else if (imc >= 25 && imc < 30) {
            return "Seu IMC é " + imc + "e está classificado como: ACIMA DO PESO.\nPode ocasionar: Fadiga, má circulação, varizes.";
        } else if (imc >= 30 && imc < 35) {
            return "Seu IMC é " + imc + "e está classificado como: OBESIDADE GRAU I.\nPode ocasionar: Diabetes, angina, infarto, aterosclerose.";
        } else if (imc >= 35 && imc < 40) {
            return "Seu IMC é " + imc + "e está classificado como: OBESIDADE GRAU II.\nPode ocasionar: Apneia do sono, falta de ar.";
        } else {
            return "Seu IMC é " + imc + "e está classificado como: OBESIDADE GRAU III.\nPode ocasionar: Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC.";
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
