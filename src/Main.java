public class Main {
    public static void main(String[] args) {
        var fullTime = 640;
        var oneTimeWorker = 8;
        var quantityWorker = fullTime / oneTimeWorker;
        System.out.println("Всего работников в компании - " + quantityWorker + " человек.");

        quantityWorker = quantityWorker + 94;
        fullTime = quantityWorker * oneTimeWorker;
        System.out.println("Если в компании работает " + quantityWorker + " человека, то всего " + fullTime + " часов работы может быть поделено между сотрудниками");
    }
}