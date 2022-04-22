public class Test {
    public static void main(String[] args) {
        CustomArrayList firstArray = new CustomArrayList();
        CustomArrayList secondArray = new CustomArrayList();

        for (int i = 5; i < 20; i++) {
            firstArray.add(String.valueOf(i + 1));
        }
        System.out.println("\n1-массив: " + firstArray);
        System.out.println("\n---------------------");

        for (int i = 10; i < 20; i++) {
            secondArray.add(String.valueOf(i + 1));
        }
        System.out.println("\n2-массив: " + secondArray);
        firstArray.addAll(secondArray);
        System.out.println("\nмассив после метода addAll(): " + firstArray);
        firstArray.remove(24);
        System.out.println("\nмассив после метода remove: " + firstArray);
    }
}