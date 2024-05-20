package ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9};
        int elementToUpdate = 3;
        int newValue = 10;
        if (elementToUpdate >= 0 && elementToUpdate < myArray.length) {
            myArray[elementToUpdate] = newValue;
            System.out.println("Array after update:");
            for (int element : myArray) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Invalid index to update!");
        }
    }

}
