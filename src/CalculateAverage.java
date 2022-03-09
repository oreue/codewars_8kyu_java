public class CalculateAverage {
    public static double find_average(int[] array){
      int length = array.length;
      double sum = 0;
      
      for (int number: array) {
        sum += number;
      }
      
      return sum / length;
    }
  }