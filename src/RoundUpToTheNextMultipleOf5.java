interface RoundToTheNextMultipleOf5 {
    
    static int roundToNext5(double number) {
      return (int) (Math.ceil(number / 5) * 5);
    }
}