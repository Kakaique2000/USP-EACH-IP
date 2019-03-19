class Ex05 {

  public static void Juizes (double [] notas){
      double maior = 0;
      double menor = notas[0];
      double media = 0;
      for (int i = 0; i < notas.length; i++) {
        if (notas[i] > maior) {
          maior = notas [i];
        }
      }
      for (int i = 0; i < notas.length; i++) {
        if (notas[i] < menor) {
          menor = notas[i];
        }
      }
      for (int i = 0; i < notas.length; i++) {
        media += notas[i];
       }
      media = (media - (menor + maior)) / (notas.length - 2);
      System.out.println (media);
    }
    public static void main (String [] args) {
      double [] notas = {5.5,7.8,8,9.1,7,4};
      Juizes(notas); 
    }
}
