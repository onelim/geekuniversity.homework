package ru.geekuniveersity.homework.j2.lesson2;

public class Main {
    
    public static void main(String[] args) {
        
        Object[][] firstArr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        Object[][] secondArr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, new Main(), 3}};
        
        Main main = new Main();
        
        try {
            int sum = main.sumArray(firstArr);
            
            System.out.println("Сумма значений в первом массиве = " + sum);
            
            int sum2 = main.sumArray(secondArr);
            
            System.out.println("Сумма значений во втором массиве = " + sum2);
            
        } catch (WrongSizeArrayException | WrongDataArrayException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Integer sumArray(Object[][] arr) throws WrongSizeArrayException, WrongDataArrayException {
        int minSizeArr = 4;
        int sum = 0;
        
        if (arr.length < minSizeArr) throw new WrongSizeArrayException(arr, minSizeArr);
        
        int outterIndex = 0;
        
        for (Object[] nArr : arr) {
            if (nArr.length < minSizeArr) throw new WrongSizeArrayException(nArr, minSizeArr);
            
            for (int i = 0; i < nArr.length; i++) {
                if (!(nArr[i] instanceof Number))
                    throw new WrongDataArrayException(nArr[i], outterIndex, i);
                
                sum += (int) nArr[i];
            }
            
            outterIndex++;
        }
        
        return sum;
    }
}
